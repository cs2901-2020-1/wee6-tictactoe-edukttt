import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner in;
    static String[] board;
    static String turn;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        board = new String[9];
        turn = "X";

        populateEmptyBoard();

        Welcome.welcome(board);

        TicTacToe.run(board, turn, in);
    }

    static void populateEmptyBoard() {
        for (int a = 0; a < 9; a++) {
            board[a] = String.valueOf(a+1);
        }
    }
}