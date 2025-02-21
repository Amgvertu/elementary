package ru.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean flag;
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            flag = true;
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != 'X') {
                    flag = false;
                }
            }
            if (flag) {
                count++;
            }
        }
        return count == row;
    }
}

