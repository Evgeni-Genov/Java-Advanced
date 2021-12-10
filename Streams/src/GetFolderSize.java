import java.io.File;

public class GetFolderSize {
    public static void main(String[] args) {
        File file = new File("D:\\java\\Java Advanced\\Streams\\resources\\Exercises Resources");

        long sum = 0;
        File[] files = file.listFiles();
        for (File currentFile : files) {
            sum += currentFile.length();
        }
        System.out.println("Folder size: " + sum);
    }
}