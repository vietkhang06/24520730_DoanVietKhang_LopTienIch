import java.util.regex.*;
import java.util.Scanner;

public class Cau1 {
    private static final String EMAIL = "^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    private static final String PASSWORD = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email, password;

        while(true)
        {
            System.out.print("Nhập email đúng định dạng (ví dụ: example@domain.com): ");
            email = scanner.nextLine();
            if(Pattern.matches(EMAIL, email)) break;
            else System.out.println("Email không hợp lệ, vui lòng nhập lại !");
        }

        while(true)
        {
            System.out.print("Nhập mật khẩu đúng định dạng sau (Ít nhất 8 ký tự, gồm chữ hoa, chữ thường, số và ký tự đặc biệt): ");
            password = scanner.nextLine();
            if(Pattern.matches(PASSWORD, password)) break;
            else System.out.println("Mật khẩu sai định dạng (Ít nhất 8 ký tự, gồm chữ hoa, chữ thường, số và ký tự đặc biệt) !");
        }

        System.out.println("Bạn đã đăng ký thành công tài khoản " + email + " !");
    }
}