import java.util.Scanner;
import java.util.Arrays;

public class Cau14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        if(n < 5)
        {
            System.out.println("Mảng có ít hơn 5 phần tử. Chương trình kết thúc.");
            System.exit(0);
        }

        int[] array = new int[n];
        System.out.print("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int[] copiedArray = new int[n];
        System.arraycopy(array, 0, copiedArray, 0, n);
        System.out.print("Nhập tên người sử dụng để lưu vào hệ thống: ");
        scanner.nextLine();
        String userName = scanner.nextLine();
        System.setProperty("user.custom.name", userName);
        String name = System.getProperty("user.custom.name");
        System.out.println("Mảng đã sao chép: " + Arrays.toString(copiedArray));
        System.out.println("Tên người dùng lấy từ System.getProperty(): " + name);
    }
}