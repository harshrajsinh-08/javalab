package fileio;


import java.io.*;
import java.util.Scanner;

public class direct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String src = sc.nextLine();
        String directoryPath = src;
        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            String[] filesAndDirectories = directory.list();
            if (filesAndDirectories != null) {
                for (String name : filesAndDirectories) {
                    System.out.println(name);
                }
            } else {
                System.out.println("Empty directory");
            }
        } else {
            System.out.println("The specified directory does not exist or is not a directory.");
        }
    }
}
