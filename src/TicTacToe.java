import java.util.Scanner;

public class TicTacToe {

	char board[][] = new char[3][3];
	boolean isCompleted = false;

	void init() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = '.';
			}
		}
	}

	void printBoard() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println("");
		}

	}

	void playMove(int move, int player) {// 5
		int tmp = 0;
		for (int i = 0; i < board.length; i++) {// 0 1
			for (int j = 0; j < board[i].length; j++) {// 0 1 2
				tmp++;// 5 //11
				if (tmp == move) {
					if (player == 0) // player 1
						board[i][j] = 'X';
					else
						board[i][j] = 'O';
				}
			}
		}

	}

	boolean isValidMove(int move) {
		int tmp = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				tmp++;
				if (tmp == move) {
					if (board[i][j] == '.') {
						System.out.println("checking " + i + " " + j);
						return true;
					} else {
						return false;
					}
				}
			}
		}
		return false;

	}

	// checking winner
	void winner() {

		// 00 01 02
		// 10 11 12
		// 20 21 22
		int winner1 = 0;
		;
		int winner2 = 0;
		for (int i = 0; i < 3; i++) {
			winner1 = 0;
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == 'X') {
					winner1++;
				}
			}
			if (winner1 == 3) {
				System.out.println("Player 1 Winner ");
				isCompleted = true;
			}
		}
		for (int i = 0; i < 3; i++) {
			winner2 = 0;
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == 'O') {
					winner2++;
				}
			}
			if (winner2 == 3) {
				System.out.println("Player 2 Winner ");
				isCompleted = true;
			}
		}
	}

	void printCorrectMoveOption() {
		int tmp = 1;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == '.') {
					System.out.print(tmp++ + " ");
				} else {
					tmp++;
					System.out.print("* ");
				}
			}
			System.out.println("");
		}
	}

	// char x = scr.next().charAt(0);
	public static void main(String[] args) {
		int move = -1;
		Scanner scr = new Scanner(System.in);
		// logic
		TicTacToe t = new TicTacToe();
		t.init();
		// max 9 times -> winner -> draw
		int totalMoves = 0;// player->0 2
		while (totalMoves != 9 && t.isCompleted == false) {

			System.out.println("*********");
			t.printBoard();
			System.out.println("*********");
			t.printCorrectMoveOption();// . *
			if (totalMoves % 2 == 0) { // 0
				System.out.println("Player 1 : ");
			} else {// 1 odd -> player2
				System.out.println("Player 2 : ");
			}
			move = scr.nextInt();

			if (t.isValidMove(move) == true) {
				t.playMove(move, totalMoves % 2);
				totalMoves++;
				t.winner();
			} else {
				System.out.println("Invalid Move");
			}
		}
	}
}
