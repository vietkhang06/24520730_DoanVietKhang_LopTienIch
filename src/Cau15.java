import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Cau15 {
    public static void main(String[] args) {
        String inputPath = "data.txt";
        String outputPath = "output.txt";

        try {
            List<String> processedLines = Files.lines(Paths.get(inputPath))
                    .filter(line -> line != null && !line.trim().isEmpty())
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());
            Files.write(Paths.get(outputPath), processedLines);
            System.out.println("Xuất tệp thành công!");
        } catch(IOException e) {
            System.err.println("Lỗi xử lý tệp: " + e.getMessage());
        }
    }
}