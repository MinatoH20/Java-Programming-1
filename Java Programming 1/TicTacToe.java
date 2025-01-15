import java.util.Scanner;

public class TicTacToe {
    private static char[][] board = new char[3][3]; 
    private static char currentPlayer = 'X'; // Player 'X' starts

    public static void main(String[] args) {
        initializeBoard(); // Initialize the board with numbers 1-9
        Scanner scanner = new Scanner(System.in);
        boolean gameWon = false;
        int move;

        System.out.println("Welcome to Tic-Tac-Toe!");
        displayBoard();

        // Loop until someone wins or the board is full
        while (!gameWon && !isBoardFull()) {
            System.out.println("Player " + currentPlayer + ", enter your move (1-9): ");
            move = scanner.nextInt();

            if (isValidMove(move)) {
                makeMove(move);
                displayBoard();
                gameWon = checkWin();

                if (gameWon) {
                    System.out.println("Player " + currentPlayer + " wins!");
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        if (!gameWon) {
            System.out.println("It's a draw!");
        }

        scanner.close();
    }

    // Initialize the board with numbers 1-9
    private static void initializeBoard() {
        char num = '1';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = num++;
            }
        }
    }

    // Display the board
    private static void displayBoard() {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Check if the move is valid
    private static boolean isValidMove(int move) {
        switch (move) {
            case 1: return board[0][0] == '1';
            case 2: return board[0][1] == '2';
            case 3: return board[0][2] == '3';
            case 4: return board[1][0] == '4';
            case 5: return board[1][1] == '5';
            case 6: return board[1][2] == '6';
            case 7: return board[2][0] == '7';
            case 8: return board[2][1] == '8';
            case 9: return board[2][2] == '9';
            default: return false;
        }
    }

    // Place the current player's mark on the board
    private static void makeMove(int move) {
        switch (move) {
            case 1: board[0][0] = currentPlayer; break;
            case 2: board[0][1] = currentPlayer; break;
            case 3: board[0][2] = currentPlayer; break;
            case 4: board[1][0] = currentPlayer; break;
            case 5: board[1][1] = currentPlayer; break;
            case 6: board[1][2] = currentPlayer; break;
            case 7: board[2][0] = currentPlayer; break;
            case 8: board[2][1] = currentPlayer; break;
            case 9: board[2][2] = currentPlayer; break;
        }
    }

    // Switch player between 'X' and 'O'
    private static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    // Check if there's a winner
    private static boolean checkWin() {
        // Check rows, columns, and diagonals
        return (checkRows() || checkColumns() || checkDiagonals());
    }

    // Check if all spaces are filled
    private static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] != 'X' && board[i][j] != 'O') {
                    return false;
                }
            }
        }
        return true;
    }

    // Check rows for a win
    private static boolean checkRows() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
        }
        return false;
    }

    // Check columns for a win
    private static boolean checkColumns() {
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true;
            }
        }
        return false;
    }

    // Check diagonals for a win
    private static boolean checkDiagonals() {
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }
        return false;
    }
}
