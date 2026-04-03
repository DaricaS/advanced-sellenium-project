package utils;

import java.io.File;

public class FileHelper {

    public static boolean isFileDownloaded(String downloadPath, String fileName) {

        File dir = new File(downloadPath);
        File[] files = dir.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.getName().contains(fileName)) {
                    return true;
                }
            }
        }
        return false;
    }
}

