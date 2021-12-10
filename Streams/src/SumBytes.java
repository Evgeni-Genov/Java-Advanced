import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

public class SumBytes {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "D:\\java\\Java Advanced\\Streams\\resources\\input.txt";

        BufferedReader reader = new BufferedReader(new FileReader(path));

        List<String> lines = reader.lines().collect(Collectors.toList());

        long sum = 0;

        for (String line : lines) {
            for (char currentChar : line.toCharArray()) {
                sum += currentChar;
            }
        }

        System.out.println(sum);
    }
}