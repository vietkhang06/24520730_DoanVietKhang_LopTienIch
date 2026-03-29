import java.util.LinkedList;
import java.util.Queue;

public class Cau9 {
    public static void main(String[] args) {
        Queue<String> taskQueue = new LinkedList<>();
        taskQueue.add("Tác vụ 1");
        taskQueue.add("Tác vụ 2");
        taskQueue.add("Tác vụ 3");
        taskQueue.add("Tác vụ 4");
        System.out.println("Danh sách tác vụ: " + taskQueue);
        while(!taskQueue.isEmpty())
        {
            String dangXuLy = taskQueue.poll();
            System.out.println("Đang xử lý: " + dangXuLy);
            System.out.println("Còn lại: " + taskQueue);
        }
        System.out.println("Đã hoàn thành tất cả tác vụ.");
    }
}