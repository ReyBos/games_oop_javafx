package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1) {
                if (Win.checkWinColumn(board, i) || Win.checkWinRow(board, i)) {
                    rsl = true;
                    break;
                }
            }
        }
        return rsl;
    }

    public static boolean checkWinRow(int[][] board, int row) {
        boolean rsl = true;
        for (int column = 0; column < board.length; column++) {
            if (board[row][column] == 0) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean checkWinColumn(int[][] board, int column) {
        boolean rsl = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][column] == 0) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
