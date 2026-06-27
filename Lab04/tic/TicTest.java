package tic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TicTest {

	@Test // #1. testing ability to declare a board
	void test() {
		Tic board = new Tic(3, 3);
		Tic board2 = new Tic(3,3);
		assertEquals(board, board2);
	}
	
	@Test // #2. testing ability to place a move on the board
	public void testPlayMove() {
		Tic game = new Tic(3, 3);
		game.play(0, 0); 
		assertEquals("X", game.board[0][0]); 
	}

	@Test // #3. testing ability to change turns after a move
	public void testTurnChangesAfterMove() {
		Tic game = new Tic(3, 3);
		game.play(0, 0);
		assertEquals("O", game.turn); 
	}

	@Test // #4. testing ability to prevent playing in an occupied cell
	public void testOccupiedCell() {
		Tic game = new Tic(3, 3);
		game.play(0, 0);
		assertThrows(RuntimeException.class, () -> {
			game.play(0, 0); 
		});
	}
    
	// #5,6,7. testing ability to detect a winning condition
	
	@Test // #5. testing horrizontal win condition
	public void testWinnerHorizontal() {
		Tic game = new Tic(3, 3);
		game.play(0, 0); 
		game.play(1, 0); 
		game.play(0, 1); 
		game.play(1, 1); 
		game.play(0, 2); 
		
		assertTrue(game.isWinner()); 
	}

	@Test // #6. testing vertical win condition
    public void testWinnerVertical() {
        Tic game = new Tic(3, 3);
        game.play(0, 0); 
        game.play(0, 1); 
        game.play(1, 0); 
        game.play(1, 1); 
        game.play(2, 0); 
        
        assertTrue(game.isWinner());
    }

	@Test // #7. testing diagonal win condition
	public void testWinnerDiagonal() {
		Tic game = new Tic(3, 3);
		game.play(0, 0); 
		game.play(0, 1); 
		game.play(1, 1); 
		game.play(0, 2); 
		game.play(2, 2);                 
		assertTrue(game.isWinner());
	}
}
