package com.geekhub.homework4;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

class Main {
    static String path1;
    public static void main(String[] args) throws IOException {
        inputDir();
        FileFilterMain.fileFilterMain();
    }
    private static void inputDir(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the files path");
        path1 = sc.nextLine();
    }
    static void write(InputStream in, OutputStream out) throws IOException {
        byte[] buffer = new byte[8192];
        int len;
        while ((len = in.read(buffer)) >= 0)
            out.write(buffer, 0, len);
        in.close();
    }

}
