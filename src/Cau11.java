import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class Cau11 {
    public static void main(String[] args) {
        String tenFile = "example.txt";
        String noiDung = "Hello, this is a test file";
        try {
            File file = new File(tenFile);

            if(file.createNewFile()) System.out.println("Tệp mới đã được tạo: " + file.getName());
            else System.out.println("Tệp đã tồn tại.");

            FileWriter fileWriter = new FileWriter(tenFile);
            fileWriter.write(noiDung);
            fileWriter.close();
            System.out.println("Đã ghi nội dung vào tệp thành công.");
            System.out.println("Nội dung đọc từ tệp:");
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine())
            {
                String data = scanner.nextLine();
                System.out.println(data);
            }
        } catch(IOException e) {
            System.out.println("Đã xảy ra lỗi hệ thống.");
            e.printStackTrace();
        }
    }
}