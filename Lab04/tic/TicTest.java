package tic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TicTest {

	@Test //testing ability to declare a board
	void test() {
		Tic board = new Tic(3, 3);
		Tic board2 = new Tic(3,3);
		assertEquals(board, board2);
	}
	
	@Test //testing ability to place a move on the board
	public void testPlayMove() {
		Tic game = new Tic(3, 3);
		game.play(0, 0); 
		assertEquals("X", game.board[0][0]); 
	}
}
