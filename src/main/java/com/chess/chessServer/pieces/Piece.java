package com.chess.chessServer.pieces;

import java.util.List;

import com.chess.chessServer.alliance.Alliance;
import com.chess.chessServer.board.Board;
import com.chess.chessServer.board.Move;

public abstract class Piece {

	protected final PieceType pieceType;
	protected final int piecePosition;
	protected final Alliance pieceAllience;
	
	Piece(final PieceType pieceType, final int piecePosition, final Alliance pieceAlliance){
		this.piecePosition = piecePosition;
		this.pieceAllience = pieceAlliance;
		this.pieceType = pieceType;
	}
	public PieceType getPieceType() {
		return this.getPieceType();
	}
	public int getPiecePosition() {
		return this.piecePosition;
	}
	public Alliance getAlliance() {
		return this.pieceAllience;
	}
	public abstract List<Move> calculateLegalMoves(final Board board);
	public abstract Piece movePiece(Move move);
	
	public enum PieceType{
		PAWN("P"),
		KNIGHT("N"),
		BISHOP("B"),
		QUEEN("Q"),
		ROOK("R"),
		KING("K");
		
		private String pieceName;
		PieceType(final String pieceName){
			this.pieceName = pieceName;
		}
		
		@Override
		public String toString() {
			return this.pieceName;
		}
	}
}
