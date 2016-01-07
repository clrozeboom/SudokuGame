package org.fishers.game.sudoku.core;

public interface GameBoard {

	void addNumber(int number, int column, int row);

	boolean isFull();

	int getNumberAtPosition(int column, int row);

}
