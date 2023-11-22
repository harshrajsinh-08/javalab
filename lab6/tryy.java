import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class tryy {
    public static void main(String[] args) {
        String[] fileNames = {"file1.txt", "file2.txt", "file3.txt"};

        for (String fileName : fileNames) {
            try {
                int lineCount = countLines(fileName);
                System.out.println(fileName + ": " + lineCount + " lines");
            } catch (IOException e) {
                System.err.println("Error reading file: " + fileName);
            }
        }
    }

    private static int countLines(String fileName) throws IOException {
        int lineCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
            }
        }
        return lineCount;
    }
}
