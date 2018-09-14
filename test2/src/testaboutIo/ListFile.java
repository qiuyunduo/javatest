package testaboutIo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午5:10 18-6-6
 * @Modified: null
 */
public class ListFile {
    public static void main(String[] args) throws IOException {
        ArrayList<String> listfiles = new ArrayList<String>();

        File file = new File("/home/qiuyunduo/文档");

        File[] tempList = file.listFiles();

        for (int i = 0; i < tempList.length; i++) {
            if(tempList[i].isFile())
                System.out.println("文件："+tempList[i].getName());
            if(tempList[i].isDirectory())
                System.out.println("文件夹："+tempList[i]);
            if(tempList[i].getName().toString().equals("test.txt"))
                tempList[i].delete();
        }
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.exists());
        System.out.println(file.isDirectory());

//        File file1 = new File("/home/qiuyunduo/文档/test/test1.txt");
//
//        File file1parent = file1.getParentFile();
//
//        if(!file1parent.exists())
//            file1parent.mkdir(); //mkdirs创建多个目录
//        file1.createNewFile();

        File file2 = new File("/home/qiuyunduo/文档");

        int num1=0 , num2=0; //num1存储一级目录中文件数，num2存储一级目录中文件夹数
        int nums = 0; //nums存储一级目录中所有文件数（包括所有子目录中文件数）
        LinkedList<File> dirs = new LinkedList<File>();

        if(!file2.exists())
            file2.mkdirs();
        dirs.push(file2);

        while (!dirs.isEmpty()) {
            File f = dirs.pop();
            File[] files2 = f.listFiles();

            for (int i = 0; i < files2.length; i++) {
                if (files2[i].isFile()) {
                    System.out.println("文件：　" + files2[i].getName());
                    nums++;
                    if(files2[i].getParent().equals(file2.getAbsolutePath()))
                        num1++;
                } else if (files2[i].isDirectory()) {
                    System.out.println("文件夹: " + files2[i].getName());
                    num2++;
                    dirs.addLast(files2[i]);
                } else {
                    System.out.println("未知文件或文件夹．．．");
                }
            }
        }


        System.out.println(num1+" "+num2+" "+nums);

    }


}
