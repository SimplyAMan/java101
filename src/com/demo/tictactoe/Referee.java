package com.demo.tictactoe;

public class Referee {

	public void put(Move move, Board board) {
		board.setFigure(move.getX(),move.getY(),move.getFigure());
	}

	public boolean isWin(Move move, Board board) {
		int x = move.getX();
		int y = move.getY();
		boolean result = false;

		ActionFigure figure = move.getFigure();
		ActionFigure figure1 = board.getFigure(x,0);
		ActionFigure figure2 = board.getFigure(x,1);
		ActionFigure figure3 = board.getFigure(x,2);

		if (figure1 == figure && figure2 == figure && figure3 == figure)
			result = true;

		figure1 = board.getFigure(0,y);
		figure2 = board.getFigure(1,y);
		figure3 = board.getFigure(2,y);
		if (figure1 == figure && figure2 == figure && figure3 == figure)
			result = true;

		return result;
	}

}
