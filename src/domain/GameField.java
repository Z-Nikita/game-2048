package domain;

public class GameField {

    // Состояние - переменные
    private int[][] matrix;

    public GameField(int size) {
        matrix = new int[][]{
                {0, 0, 0, 2},
                {2, 2, 4, 8},
                {4, 16, 36, 0},
                {64, 32, 16, 8}};
    }

    public int[][] getMatrix() {
        return matrix;
    }

}
