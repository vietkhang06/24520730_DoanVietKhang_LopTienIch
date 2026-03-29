import java.util.Scanner;

public class Cau6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0, y = 0;
        System.out.print("Nhập số bước đi: ");
        int soBuoc = scanner.nextInt();

        for(int i = 0; i < soBuoc; i++)
        {
            int huongDi = (int)(Math.random() * 4);
            if(huongDi == 0)
            {
                y++;
            } else if (huongDi == 1) {
                y--;
            } else if (huongDi == 2) {
                x--;
            } else x++;
        }

        double khoangCach = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("Vị trí cuối cùng: (" + x + ", " + y + ")");
        System.out.printf("Khoảng cách Euclid: %.2f\n", khoangCach);
    }
}