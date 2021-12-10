import java.io.*;

public class LineNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("D:\\java\\Java Advanced\\Streams\\resources\\inputLineNumbers.txt"));

        String line = reader.readLine();

        PrintWriter writer = new PrintWriter("output.txt");
        int row = 1;

        while (line != null) {
            writer.println(row++ + ". " + line);
            line = reader.readLine();
        }
        writer.close();
    }
}