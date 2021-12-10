import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        File file = new File("D:\\java\\Java Advanced\\Streams\\Files");

        File[] files = file.listFiles();

        for (File currentFile : files) {
            if (!currentFile.isDirectory()) {
                System.out.printf("%s: [%d]%n", currentFile.getName(), currentFile.length());
            }
        }
    }
}