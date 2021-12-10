import java.io.File;
import java.util.ArrayDeque;

public class NestedFolders {
    public static void main(String[] args) {
        File file = new File("D:\\java\\Java Advanced\\Streams\\Files");

        ArrayDeque<File> queue = new ArrayDeque<>();

        queue.offer(file);

        int count = 0;

        while (!queue.isEmpty()) {
            File f = queue.poll();
            File[] files = f.listFiles();
            for (File currentFile : files) {
                if (currentFile.isDirectory()) {
                    queue.offer(currentFile);
                }
            }

            count++;
            System.out.println(f.getName());
        }

        System.out.printf("[%d] folders", count);
    }
}