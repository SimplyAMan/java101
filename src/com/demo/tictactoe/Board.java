package com.demo.tictactoe;

public class Board {
	static public int size = 3;
	private ActionFigure [][] board = new ActionFigure[size][size];
	private int step = 0;

	public void setFigure(int x, int y, ActionFigure figure){
		board[x][y] = figure;
	}

	public ActionFigure getFigure(int x, int y){
		return board[x][y];
	}


	public boolean hasMoreSpace() {
		int space = 0;
		for (int i = 0; i < size; i++)
			for (int j = 0; j < size; j++)
				if (board[i][j] == null) {
					space++;
				}
		return (space > 2);
	}

	public void print() {
		System.out.println("Step - " + ++step);
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (board[i][j] == ActionFigure.CROSS)
					System.out.print("X ");
				else if (board[i][j] == ActionFigure.NOUGHT)
					System.out.print("O ");
				else
					System.out.print("_ ");
			}
			System.out.println(" ");
		}

	}

}
