
public class Cau5 {
    public static void main(String[] args) {
        Maze myMaze = new Maze(10, 10);
        myMaze.khoiTaoMaze(0, 0);
        System.out.println("Ma trận đuợc khởi tạo:");
        myMaze.render();
    }
}