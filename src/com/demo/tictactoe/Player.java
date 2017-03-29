package com.demo.tictactoe;


import java.util.Random;

public class Player {
	private ActionFigure figure;

	public Player(ActionFigure figure) {
		this.figure = figure;
	}

	public Move turn(Board board) {
		Move m = new Move();
		Random rn = new Random();
		int x, y;
		do{
			x = rn.nextInt(Board.size);
			y = rn.nextInt(Board.size);
			if (board.getFigure(x,y) == null){
				m.setX(x);
				m.setY(y);
				m.setFigure(figure);
				break;
			}
		} while (true);
		return m;
	}

}
