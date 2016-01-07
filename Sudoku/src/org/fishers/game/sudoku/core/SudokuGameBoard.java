package org.fishers.game.sudoku.core;

public class SudokuGameBoard implements GameBoard {
	int gameBoard[][] = {{0,0,2,0},
			             {0,1,0,0},
			             {0,0,0,4},
			             {3,0,0,0}};
	
	@Override
	public String toString() {
		StringBuilder board = new StringBuilder();

		board.append("_________\n");
		for (int j = 0; j < 4; ++j) {
			for (int i = 0; i < 4; ++i) {
				board.append("|");
				
				if (gameBoard[i][j] == 0) {
					board.append(" ");
				} else {
					board.append(gameBoard[i][j]);
				}
			}
			board.append("|\n");
			board.append("---------\n");
		}
		return board.toString();
	}

	@Override
	public void addNumber(int number, int column, int row) {
		gameBoard[column][row] = number;
	}

	@Override
	public boolean isFull() {
		for (int j = 0; j < 4; ++j) {
			for (int i = 0; i < 4; ++i) {
				if(gameBoard[j][i] == 0) {
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public int getNumberAtPosition(int column, int row) {
		return gameBoard[column][row];
	}

}
