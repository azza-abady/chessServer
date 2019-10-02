package com.chess.chessServer.board;

// represent move transition from board to another and all information need to be saved 
public class MoveTransition {
	
	// the board that you go transition to after make the move. 
	private final Board transitionBoard;
	private final Move move;
	// tell us if we able to do the move or not
	private final MoveStatus moveStatus;

	
	public MoveTransition(final Board transitionBoard,final Move move,final MoveStatus moveStatus) {
		this.transitionBoard = transitionBoard;
		this.move = move;
		this.moveStatus = moveStatus;
	}


	public MoveStatus getMoveStatus() {
		return moveStatus;
	}
	
	
}
