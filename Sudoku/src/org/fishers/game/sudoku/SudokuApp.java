package org.fishers.game.sudoku;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.fishers.game.sudoku.core.GameBoard;

public class SudokuApp {

	public static void main(String[] args) {
		//testSudokuBoard();
		//testAddNumberToBoard();
		try {
			GameBoard board = GameFactory.getSudokuBoard();
			System.out.println(board.toString());
			while (!board.isFull()) {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

				System.out.println("What number do you want to add? ");
				int number = Integer.valueOf(br.readLine());
				System.out.println("You entered: " + number);

				System.out.println("What column do you want? ");
				int column = Integer.valueOf(br.readLine());
				column--;
				System.out.println("You entered: " + column);

				System.out.println("What row do you want? ");
				int row = Integer.valueOf(br.readLine());
				row--;
				System.out.println("You entered: " + row);

				board.addNumber(number, column, row);

				System.out.println(board.toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void testAddNumberToBoard() {
		GameBoard board = GameFactory.getSudokuBoard();
		board.addNumber(3, 2, 2);
		System.out.println(board.toString());
	}

	private static void testSudokuBoard() {
		GameBoard board = GameFactory.getSudokuBoard();
		System.out.println(board.toString());
	}
}
