package fileio;

import java.io.File;
import java.util.Scanner;

public class allext {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String directoryPath = sc.nextLine();

        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            String[] extensions = new String[0];
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        String fileName = file.getName();
                        int dotIndex = fileName.lastIndexOf('.');
                        if (dotIndex > 0 && dotIndex < fileName.length() - 1) {
                            String extension = fileName.substring(dotIndex + 1).toLowerCase();
                            boolean isDuplicate = false;
                            for (String ext : extensions) {
                                if (ext.equals(extension)) {
                                    isDuplicate = true;
                                    break;
                                }
                            }

                            if (!isDuplicate) {

                                String[] newExtensions = new String[extensions.length + 1];
                                System.arraycopy(extensions, 0, newExtensions, 0, extensions.length);
                                newExtensions[extensions.length] = extension;
                                extensions = newExtensions;
                            }
                        }
                    }
                }

                if (extensions.length > 0) {
                    System.out.println("All unique file extensions in " + directoryPath + ":");
                    for (String extension : extensions) {
                        System.out.println(extension);
                    }
                } else {
                    System.out.println("No files with extensions found in the directory.");
                }
            }
        } else {
            System.out.println("The specified directory does not exist or is not a directory.");
        }
    }
}