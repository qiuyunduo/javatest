package urltest;

import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午8:05 18-6-20
 * @Modified: null
 */
public class MulThreadDownLoad {
    public static void main(String[] args) throws Exception{
        String path = "http://mpge.5nd.com/2016/2016-11-15/74847/1.mp3";
        new MulThreadDownLoad().download(path,3);
    }

    private void download(String path, int theradSize) throws Exception {
        URL url = new URL(path);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setConnectTimeout(5000);

        if(connection.getResponseCode() == 200){
            int length = connection.getContentLength();
            File file = new File(getFileName(path));

            RandomAccessFile accessFile = new RandomAccessFile(file,"rwd");
            accessFile.setLength(length);
            accessFile.close();

            int block = length % theradSize == 0 ? length / theradSize : length / theradSize + 1;

            for(int threadID = 0; threadID < theradSize; threadID++){
                new DownloadThread(threadID,block,url,file).start();
            }
        }else {
            System.out.println("download fail");
        }

    }

    class DownloadThread extends Thread{
        private int threadID;
        private int block;
        private URL url;
        private File file;

        public DownloadThread(int threadId, int block, URL url, File file) {
            this.threadID = threadId;
            this.block = block;
            this.url = url;
            this.file = file;
        }

        @Override
        public void run() {
            int start = threadID * block; // 计算该线程从网络文件什么位置开始下载
            int end = (threadID + 1) * block - 1; // 计算下载到网络文件什么位置结束
            try {
                RandomAccessFile accessFile = new RandomAccessFile(file, "rwd");
                accessFile.seek(start); // 从start开始
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.setConnectTimeout(5000);
                // 设置获取资源数据的范围，从start到end
                connection.setRequestProperty("Range", "bytes=" + start + "-" + end);
                // 注意多线程下载状态码是 206 不是200
                if (connection.getResponseCode() == 206) {
                    InputStream inputStream = connection.getInputStream();
                    byte[] buffer = new byte[1024];
                    int len = 0;
                    //拷贝网络的文件
                    while ((len = inputStream.read(buffer)) != -1) {
                        accessFile.write(buffer, 0, len);
                    }
                    accessFile.close();
                    inputStream.close();
                }
                System.out.println("第" + (threadID + 1) + "条线程已经下载完成");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    private String getFileName(String path){
        return path.substring(path.lastIndexOf("/")+1);
    }
}
