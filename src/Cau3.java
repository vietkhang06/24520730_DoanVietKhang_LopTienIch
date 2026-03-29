import java.io.*;
import java.util.Scanner;

public class Cau3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "output.txt";

        System.out.print("Nhập chuỗi văn bản: ");
        String input = scanner.nextLine();

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName)))
        {
            bufferedWriter.write(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(BufferedReader br = new BufferedReader(new FileReader(fileName)))
        {
            String line;
            System.out.print("Nội dung từ tệp: ");
            while ((line = br.readLine()) != null)
            {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}