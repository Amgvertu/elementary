package ru.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean flag = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean flag = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }
}

