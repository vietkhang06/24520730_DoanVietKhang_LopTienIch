import java.util.*;

public class Cau10 {
    private static final int[] row = {-1, 1, 0, 0};
    private static final int[] col = {0, 0, -1, 1};

    public static void main(String[] args) {
        char[][] maTran = {
                {'#', '.', '#', '#', '#'},
                {'.', '.', '.', '.', '#'},
                {'#', '.', '#', '.', '#'},
                {'#', '.', '.', '.', '.'},
                {'#', '#', '#', '#', '#'}
        };
        int[] batDau = {1, 0};
        int[] dichDen = {3, 4};
        int khoangCach = duongDiNganNhat(maTran, batDau, dichDen);

        if(khoangCach != -1) System.out.println("Độ dài đường đi ngắn nhất: " + khoangCach);
        else System.out.println("Không tìm thấy đường đi.");
    }

    public static int duongDiNganNhat(char[][] maTran, int[] batDau, int[] dichDen) {
        int rows = maTran.length;
        int cols = maTran[0].length;
        if(maTran[batDau[0]][batDau[1]] == '#' || maTran[dichDen[0]][dichDen[1]] == '#') return -1;
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[rows][cols];
        queue.add(new int[]{batDau[0], batDau[1], 0});
        visited[batDau[0]][batDau[1]] = true;

        while(!queue.isEmpty())
        {
            int[] current = queue.poll();
            int r = current[0];
            int c = current[1];
            int khoangCach = current[2];
            if(r == dichDen[0] && c == dichDen[1]) return khoangCach;
            for(int i = 0; i < 4; i++)
            {
                int nr = r + row[i];
                int nc = c + col[i];
                if(nr >= 0 && nr < rows && nc >= 0 && nc < cols && maTran[nr][nc] == '.' && !visited[nr][nc])
                {
                    visited[nr][nc] = true;
                    queue.add(new int[]{nr, nc, khoangCach + 1});
                }
            }
        }
        return -1;
    }
}