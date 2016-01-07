package org.fishers.game.sudoku;

import org.fishers.game.sudoku.core.GameBoard;
import org.fishers.game.sudoku.core.SudokuGameBoard;

public class GameFactory {

	public static GameBoard getSudokuBoard() {
		return new SudokuGameBoard();
	}

}
