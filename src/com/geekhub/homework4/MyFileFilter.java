package com.geekhub.homework4;

import java.io.File;
import java.io.FileFilter;

class ImageFileFilter implements FileFilter    {
    private final String[] imageFileExtensions = new String[] {"jpeg","jpg","gif","png"};
    @Override
    public boolean accept(File file) {
        for (String extension : imageFileExtensions) {
            if (file.getName().toLowerCase().endsWith(extension)) {
                return true;
            }
        }
        return false;
    }
}
class VideoFilesFilter implements FileFilter{
    private final String[] videoFileExtensions = new String[] {"avi","mp4","flv"};
    @Override
    public boolean accept(File file) {
        for (String extension : videoFileExtensions) {
            if (file.getName().toLowerCase().endsWith(extension)) {
                return true;
            }
        }
        return false;
    }
}
class AudioFilesFilter implements FileFilter{
    private final String[] audioFileExtensions = new String[] {"mp3","wav","wma"};
    @Override
    public boolean accept(File file) {
        for (String extension : audioFileExtensions) {
            if (file.getName().toLowerCase().endsWith(extension)) {
                return true;
            }
        }
        return false;
    }
}






