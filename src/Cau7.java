import java.util.Scanner;
import java.time.Duration;
import java.time.LocalTime;

public class Cau7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "^([0-1][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]$";
        String input1, input2;

        do {
            System.out.print("Nhập mốc thời gian thứ nhất (HH:mm:ss, >= 00:00:00 && < 24:00:00): ");
            input1 = scanner.nextLine();
            if(!input1.matches(regex))
            {
                System.out.println("Sai định dạng! Vui lòng nhập lại (ví dụ 03:06:00).");
            }
        } while(!input1.matches(regex));
        LocalTime time1 = LocalTime.parse(input1);

        do {
            System.out.print("Nhập mốc thời gian thứ hai (HH:mm:ss, >= 00:00:00 && < 24:00:00) ");
            input2 = scanner.nextLine();
            if(!input2.matches(regex))
            {
                System.out.println("Sai định dạng! Vui lòng nhập lại (ví dụ 03:06:00).");
            }
        } while(!input2.matches(regex));
        LocalTime time2 = LocalTime.parse(input2);

        long seconds = Math.abs(Duration.between(time1, time2).toSeconds());
        long h = seconds / 3600;
        long m = (seconds % 3600) / 60;
        long s = seconds % 60;
        System.out.printf("Khoảng cách giữa hai mốc: %02d:%02d:%02d\n", h, m, s);
    }
}