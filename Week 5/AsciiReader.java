import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class AsciiReader {
    public static void main(String[] args) {
        String filePath = "moby_dick_ascii.txt";

        try {
            // Get the exact file size in bytes (1 byte = 1 char for ASCII)
            long fileSize = Files.size(Path.of(filePath));
            
            // Create a char[] long enough to hold the entire 1.2MB file
            char[] buffer = new char[(int) fileSize];

            // Read the entire file into the char array in one pass
            try (FileReader reader = new FileReader(filePath)) {
                int charsRead = reader.read(buffer);
                System.out.println("Loaded " + charsRead + " characters into the char[].");
            }

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}