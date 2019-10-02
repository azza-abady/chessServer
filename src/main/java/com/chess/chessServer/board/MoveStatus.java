package com.chess.chessServer.board;

public enum MoveStatus {
	DONE {
		@Override
		boolean isDone() {
			return true;
		}
	},
	ILLEGAL_MOVE {
		@Override
		boolean isDone() {
			return false;
		}
	}
	
	;
	abstract boolean isDone();
}
