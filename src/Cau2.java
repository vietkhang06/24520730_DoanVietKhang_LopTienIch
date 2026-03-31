import java.util.Scanner;
import java.util.regex.*;

public class Cau2 {
    private static final String URL_REGEX = "^https?://[a-zA-Z0-9.-]+(/[a-zA-Z0-9._~:/?#\\[\\]@!$&'()*+,;=%-]*)?$";
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String url;
        while(true)
        {
            System.out.println("Nhập URL:");
            url = scanner.nextLine();
            if(Pattern.matches(URL_REGEX, url))
            {
                System.out.println("URL hợp lệ !!! Tiến hành lưu trữ URL");
                break;
            }
            else {
                System.out.println("Lỗi: URL không đúng với định dạng (Phải bắt đầu bằng http:// hoặc https:// và có tên miền hợp lệ)");
                System.out.println("Vui lòng thử lại!\n");
            }
        }
        System.out.println("Lưu thành công URL: " + url);
    }
}