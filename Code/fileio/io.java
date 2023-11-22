package fileio;
import java.io.*;
import java.util.Scanner;
public class io {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filePath = "/Users/harsh/Code/fileio/content.txt";
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            if (new File(filePath).length() > 0) {
                bufferedWriter.newLine();
            }
            System.out.println("Enter what you want to write: ");
            bufferedWriter.write(sc.nextLine());

            bufferedReader.close();
            bufferedWriter.close();

            System.out.println("New content appended to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
