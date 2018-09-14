package homework.workaboutIo;

import java.io.*;
import java.util.LinkedList;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午7:48 18-6-7
 * @Modified: null
 */
public class Exercise2 {
    public static void main(String[] args) throws IOException{
        File olddir = new File("test5/img");
        File newdir = new File("test5/img1");

        if(!newdir.exists())
            newdir.mkdirs();

        LinkedList<File> filelist = getAllImg(olddir);

        for (File file : filelist ) {
            File oldFile = file;
            File newFile = new File(newdir, oldFile.getName());
            // 完成普通的文件复制操作
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(oldFile));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newFile));
            // 先读
            byte[] bytes = new byte[1024];
            int len=0;
            while ((len = bis.read(bytes)) != -1) {
                // 后写
                bos.write(bytes, 0, len);
            }
            // 关闭流
            bos.close();
            bis.close();
        }

        System.out.println(filelist);
    }
    public static LinkedList<File> getAllImg(File olddir){

        LinkedList<File> filelist = new LinkedList<File>();
        LinkedList<File> dirlist = new LinkedList<File>();

        dirlist.add(olddir);

        while (!dirlist.isEmpty()) {
            File dir = dirlist.pop();
            File[] files = dir.listFiles();
            for (int i = 0; i < files.length; i++) {
                if (files[i].isFile()) {
                    String name = files[i].getName();
                    System.out.println(name);
                    if(name.matches("(.*)\\.(jpg|png|gif)"))
                        filelist.add(files[i]);
                } else if (files[i].isDirectory()) {
                    dirlist.add(files[i]);
                } else {
                    System.out.println("未知文件或文件夹．．．");
                }
            }
        }


        return filelist;
    }

}
