public class Maze {
    private final int col;
    private final int row;
    private final GridCell[][] grid;

    public Maze(int columnCount, int rowCount) {
        this.col = columnCount;
        this.row = rowCount;
        this.grid = new GridCell[columnCount][rowCount];
        for (int x = 0; x < columnCount; x++) {
            for (int y = 0; y < rowCount; y++) {
                grid[x][y] = new GridCell(x, y);
            }
        }
    }

    public void khoiTaoMaze(int x, int y) {
        grid[x][y].isVisited = true;
        int[] huongDi = {0, 1, 2, 3};
        for (int i = huongDi.length - 1; i > 0; i--) {
            int randomIndex = (int) (Math.random() * (i + 1));
            int temp = huongDi[i];
            huongDi[i] = huongDi[randomIndex];
            huongDi[randomIndex] = temp;
        }

        for (int i : huongDi) {
            int nextX = x;
            int nextY = y;
            if (i == 0) nextY--;
            else if (i == 1) nextY++;
            else if (i == 2) nextX--;
            else if (i == 3) nextX++;

            if (diHopLe(nextX, nextY)) {
                phaTuong(grid[x][y], grid[nextX][nextY], i);
                khoiTaoMaze(nextX, nextY);
            }
        }
    }

    private boolean diHopLe(int x, int y) {
        return (x >= 0 && x < col && y >= 0 && y < row && !grid[x][y].isVisited);
    }

    private void phaTuong(GridCell hienTai, GridCell tiepTheo, int huongDi) {
        if (huongDi == 0) {
            hienTai.hasWall[0] = false;
            tiepTheo.hasWall[1] = false;
        }
        else if (huongDi == 1) {
            hienTai.hasWall[1] = false;
            tiepTheo.hasWall[0] = false;
        }
        else if (huongDi == 2) {
            hienTai.hasWall[2] = false;
            tiepTheo.hasWall[3] = false;
        }
        else if (huongDi == 3) {
            hienTai.hasWall[3] = false;
            tiepTheo.hasWall[2] = false;
        }
    }

    public void render() {
        for (int y = 0; y < row; y++) {
            for (int x = 0; x < col; x++) {
                System.out.print(grid[x][y].hasWall[0] ? "+---" : "+   ");
            }
            System.out.println("+");
            for (int x = 0; x < col; x++) {
                System.out.print(grid[x][y].hasWall[2] ? "|   " : "    ");
            }
            System.out.println("|");
        }
        for (int x = 0; x < col; x++) System.out.print("+---");
        System.out.println("+");
    }

    private static class GridCell {
        int x, y;
        boolean[] hasWall = {true, true, true, true};
        boolean isVisited = false;
        GridCell(int x, int y) { this.x = x; this.y = y; }
    }
}