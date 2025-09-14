import java.util.*;
public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
        Scanner sc = new Scanner(System.in);
        char player = 'X';
        boolean gameEnded = false;

        while (!gameEnded) {
            System.out.println("Current board:");
            for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("-----");
            }

            int r, c;
            while (true) {
            System.out.print("Player " + player + ", enter row (1-3): ");
            r= sc.nextInt() - 1;
            System.out.print("Enter column (1-3): ");
            c = sc.nextInt() - 1;
            if (r>= 0 && r < 3 && c >= 0 && c < 3 && board[r][c] == ' ') {
                board[r][c] = player;
                break;
            } else {
                System.out.println("Invalid move, try again.");
            }
            }


            for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player ||
                board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                gameEnded = true;
            }
            }
            if (board[0][0] ==player && board[1][1] ==player && board[2][2] == player ||
            board[0][2] ==player && board[1][1] == player && board[2][0] == player) {
            gameEnded = true;
            }

            
            boolean draw = true;
            for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == ' ')
                draw = false;

            if (gameEnded) {
            System.out.println("Player " +player + " wins!");
            } else if (draw) {
            System.out.println("It's a draw!");
            gameEnded = true;
            } else {
            player = (player == 'X') ? 'O' : 'X';
            }
        }
        sc.close();

    }
}

