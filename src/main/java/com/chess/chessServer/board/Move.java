package com.chess.chessServer.board;

import com.chess.chessServer.pieces.Piece;

public abstract class Move {
	final Board board;
	final Piece movedPiece;
	final int destinationPosition;
	
	private Move(final Board board,final Piece movedPiece, final int destinationPosition){
		this.board = board;
		this.movedPiece = movedPiece;
		this.destinationPosition = destinationPosition;
	}
	
	public int getDestinationPosition() {
		return this.destinationPosition;
	}
	
	
	public Piece getMovedPiece() {
		return movedPiece;
	}

	public abstract Board execute();
	
	public static final class NormalMove extends Move{

		public NormalMove(final Board board, final Piece movedPiece, final int destinationPosition) {
			super(board, movedPiece, destinationPosition);
			// TODO Auto-generated constructor stub
		}

		@Override
		public Board execute() {
			// TODO to be Implemented
			return null;
		}
		
	}
	
	public static final class AttackMove extends Move{

		final Piece attackedPiece;
		
		public AttackMove(final Board board, final Piece movedPiece, final int destinationPosition, final Piece attackedPiece) {
			super(board, movedPiece, destinationPosition);
			this.attackedPiece = attackedPiece;
		}

		@Override
		public Board execute() {
			// TODO to be Implemented
			return null;
		}
		
	}
}
