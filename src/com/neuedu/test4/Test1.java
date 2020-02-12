package com.neuedu.test4;

import java.io.*;

/**
 * 把d下某个文件复制到 d:/a下
 *
 * @author bin
 * @date 2020/2/12 0012 14:08
 */
public class Test1 {
    public static void main(String[] args) {
        File from = new File("d:/01-开班.wmv");
        File parent = new File("d:/a");
        if(!parent.exists()){
            parent.mkdir();
        }
        File to = new File("d:/a/"+from.getName());
        InputStream inputStream = null;
        OutputStream outputStream = null;
        byte[] b = new byte[1024];

        try {
            inputStream = new FileInputStream(from);
            outputStream = new FileOutputStream(to);
            int len = inputStream.read(b);
            while(len != -1){
                outputStream.write(b,0,len);
                outputStream.flush();
                len = inputStream.read(b);
            }
            System.out.println("复制完成");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (outputStream != null)
                outputStream.close();
                if (inputStream != null)
                    inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
