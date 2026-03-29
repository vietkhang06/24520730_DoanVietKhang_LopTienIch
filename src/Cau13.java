import java.util.Scanner;

public class Cau13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số N: ");
        int n = scanner.nextInt();
        long thoiGianBatDau = System.nanoTime();
        long sum = 0;
        for(long i = 1; i <= n; i++) sum += i;
        long thoiGianKetThuc = System.nanoTime();
        long thoiGianThucThi = thoiGianKetThuc - thoiGianBatDau;
        System.out.println("Tổng từ 1 đến " + n + " là: " + sum);
        System.out.println("Thời gian thực thi: " + thoiGianThucThi + " ns");
    }
}