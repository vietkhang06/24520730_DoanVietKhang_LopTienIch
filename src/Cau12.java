import java.io.File;
import java.util.Scanner;

public class Cau12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập đường dẫn đến tệp cần kiểm tra (VD:\"C:\\Users\\Khang\\Downloads\\data.txt\"): ");
        String duongDan = scanner.nextLine();
        File file = new File(duongDan);

        if(file.exists())
        {
            System.out.println("Thông tin của tệp:");
            System.out.println("Tên tệp: " + file.getName());
            System.out.println("Đường dẫn tuyệt đối: " + file.getAbsolutePath());
            System.out.println("Kích thước: " + file.length() + " bytes");
            System.out.println("Có thể đọc: " + (file.canRead() ? "Có" : "Không"));
            System.out.println("Có thể ghi: " + (file.canWrite() ? "Có" : "Không"));
            System.out.println("Đây có phải thư mục: " + (file.isDirectory() ? "Phải" : "Không phải"));
        } else System.out.println("Lỗi: Tệp tin hoặc đường dẫn không tồn tại!");
    }
}