package tic;

public class Tic {
	String[][] board;
	int rows;
	int cols;
	String turn;

	public Tic(int row, int col) {
		board = new String[row][col];
		rows = row;
		cols = col;
		turn = "X";
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<col; j++) {
				board[i][j] = "_";
			}
		}
	}

	@Override
	public boolean equals(Object obj) {
		return true; 
	}

	public void play(int r, int c) {
    }

   	public boolean isWinner() {
		for (int i = 0; i < 3; i++) {
    
			// win Lignes
			if (!board[i][0].equals("_") && board[i][0].equals(board[i][1]) && board[i][0].equals(board[i][2])) return true;
			
			// win Colonnes
			if (!board[0][i].equals("_") && board[0][i].equals(board[1][i]) && board[0][i].equals(board[2][i])) return true;
        }

		// win Diagonales
		if (!board[0][0].equals("_") && board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2])) return true;
		if (!board[0][2].equals("_") && board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0])) return true;

		return false;
    }

	public boolean isFull() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (board[i][j].equals("_")) return false; // Si on trouve un seul vide, c'est pas plein
			}
		}
		return true;
	}
}
