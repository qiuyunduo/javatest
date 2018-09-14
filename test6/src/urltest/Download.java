package urltest;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午7:24 18-6-21
 * @Modified: null
 */
public class Download {
    private static int ThreadSize = 3;
    private static int block;
    private static String path = "http://mpge.5nd.com/2016/2016-11-15/74847/1.mp3";
    private static int currentThreadId = 0;
    private static long st;

    public static void main(String[] args) {
        st = System.currentTimeMillis();
        try {
            URL url = new URL(path);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            //设置请求方式为GET
            connection.setRequestMethod("GET");
            //设置连接超时限制
            connection.setConnectTimeout(10 * 1000);
            //获取响应状态码
            int state = connection.getResponseCode();

            if (state == 200) {
                int filelength = connection.getContentLength();
                String filename = path.substring(path.lastIndexOf("/") + 1);
                File file = new File(filename);
                RandomAccessFile raf = new RandomAccessFile(file, "rw");
                raf.setLength(filelength);

                block = filelength / ThreadSize;

                for (int i = 0; i < ThreadSize; i++) {
                    int startlocal = i * block;
                    int endlocal = (i + 1) * block - 1;
                    if (i == ThreadSize - 1) {
                        endlocal = filelength - 1;
                    }
                    new MyThread(i, startlocal, endlocal).start();
                }
                raf.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static class MyThread extends Thread {
        private int ThreadID;
        private int startloacl;
        private int endlocal;

        public MyThread(int i, int startloacl, int endlocal) {
            this.ThreadID = i;
            this.startloacl = startloacl;
            this.endlocal = endlocal;
        }

        @Override
        public void run() {
            synchronized (MyThread.class) {
                currentThreadId++;
            }

            try {
                System.out.println("线程名id: "+ThreadID+"，开始位置："+startloacl+"，结束位置："+endlocal);

                URL url = new URL(path);
                HttpURLConnection connection  = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.setConnectTimeout(10 * 1000);
//                File file = new File(ThreadID+".txt");
//
//                if(file.exists()){
//                    BufferedReader br = new BufferedReader(
//                            new InputStreamReader(new FileInputStream(file)));
//
//                    String lastPostion_str = br.readLine();
//                    startloacl = Integer.parseInt(lastPostion_str);
//                    br.close();
//                }
                connection.setRequestProperty("Range","bytes:"+startloacl+"-"+endlocal);
                int state = connection.getResponseCode();
                System.out.println(state);
                if(state == 200){
                    InputStream is = connection.getInputStream();
                    String filename = path.substring(path.lastIndexOf("/")+1);
                    System.out.println(filename);
                    RandomAccessFile rafile = new RandomAccessFile(new File(filename),"rwd");
                    rafile.seek(startloacl);
                    byte[] bytes = new byte[1024];
                    int lenght = -1;
                    int total = 0;
                    while ((lenght = is.read(bytes)) != -1){
                        rafile.write(bytes,0,lenght);
//                        total += lenght;
//                        int currentThreadPostion = startloacl+total;
//                        RandomAccessFile rafile2 = new RandomAccessFile(file,"rw");
//                        rafile2.write(String.valueOf(currentThreadPostion).getBytes());
//                        rafile2.close();
//                        System.out.println(Thread.currentThread().getName()+":"+total);
                    }
                    rafile.close();
                    is.close();
                    System.out.println("线程："+ThreadID+"下载完毕");
                    synchronized (MyThread.class){
                        currentThreadId--;
                        System.out.println(Thread.currentThread().getName()+":"+currentThreadId);
                        if(currentThreadId == 0){
//                            for (int i = 0; i < ThreadSize; i++) {
//                                File file1 = new File(i+".txt");
//                                file1.delete();
//                            }
                            System.out.println(System.currentTimeMillis()-st);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
//            super.run();
        }
    }
}