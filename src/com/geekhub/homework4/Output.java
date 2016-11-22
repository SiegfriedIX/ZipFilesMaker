package com.geekhub.homework4;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import static com.geekhub.homework4.Main.path1;

class Output {
    static void outputImagesZip() throws IOException{
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream("images.zip"));
        File file = new File(path1);
        doZipImages(file, out);
        out.close();
    }
    static void outputVideoZip() throws IOException{
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream("video.zip"));
        File file = new File(path1);
        doZipVideo(file, out);
        out.close();
    }
    static void outputAudioZip() throws IOException{
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream("audio.zip"));
        File file = new File(path1);
        doZipAudio(file, out);
        out.close();
    }
    private static void doZipImages(File dir, ZipOutputStream out) throws NullPointerException,IOException {
        for (File f : dir.listFiles(new ImageFileFilter())) {
            if (f.isDirectory())
                doZipImages(f, out);
            else {
                out.putNextEntry(new ZipEntry(f.getName()));
                Main.write(new FileInputStream(f), out);
            }
        }
    }
    private static void doZipVideo(File dir, ZipOutputStream out) throws IOException,NullPointerException {
        for (File f : dir.listFiles(new VideoFilesFilter())) {
            if (f.isDirectory())
                doZipVideo(f, out);
            else {
                out.putNextEntry(new ZipEntry(f.getName()));
                Main.write(new FileInputStream(f), out);
            }
        }
    }
    private static void doZipAudio(File dir, ZipOutputStream out) throws IOException,NullPointerException {
        for (File f : dir.listFiles(new AudioFilesFilter())) {
            if (f.isDirectory())
                doZipAudio(f, out);
            else {
                out.putNextEntry(new ZipEntry(f.getName()));
                Main.write(new FileInputStream(f), out);
            }
        }
    }

    }