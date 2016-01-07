package org.fishers.games.sudoku;

import static org.junit.Assert.*;

import org.fishers.game.sudoku.GameFactory;
import org.fishers.game.sudoku.core.GameBoard;
import org.junit.Test;

public class SudokuTest {

	@Test 
	public void testAddNumberToBoard() {
		GameBoard board = GameFactory.getSudokuBoard();
		board.addNumber(3, 2, 2);
		assertEquals(3, board.getNumberAtPosition(2,2));
	}

	@Test
	public void testSudokuBoard() {
		GameBoard board = GameFactory.getSudokuBoard();
		assertNotNull(board);
	}
}
