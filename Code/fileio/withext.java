package fileio;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class withext {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String directoryPath = sc.nextLine();
        System.out.println("Enter extension  for eg. (.java)");
        String targetExtension = sc.nextLine();
        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            File[] match = directory.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.endsWith(targetExtension);
                }
            });

            if (match != null) {
                for (File file : match) {
                    System.out.println(file.getName());
                }
            } else {
                System.out.println("No files with the specified extension found in the directory.");
            }
        } else {
            System.out.println("The specified directory does not exist or is not a directory.");
        }
    }
}
