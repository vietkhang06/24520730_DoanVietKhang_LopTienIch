import java.util.Scanner;
import java.time.Duration;
import java.time.Instant;

public class Cau8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhấn Enter để bắt đầu bấm giờ.");
        scanner.nextLine();
        Instant start = Instant.now();
        System.out.println("Đang tính thời gian.");
        System.out.println("Nhấn Enter để dừng bấm giờ.");
        scanner.nextLine();
        Instant end = Instant.now();
        Duration thoiGianLamBai = Duration.between(start, end);
        long h = thoiGianLamBai.toHours();
        int m = thoiGianLamBai.toMinutesPart();
        int s = thoiGianLamBai.toSecondsPart();
        String result = String.format("%02d:%02d:%02d", h, m, s);
        System.out.println("Thời gian làm bài là: " + result);
    }
}