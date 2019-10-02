package com.chess.chessServer.pieces;

import java.util.ArrayList;
import java.util.List;

import com.chess.chessServer.alliance.Alliance;
import com.chess.chessServer.board.Board;
import com.chess.chessServer.board.Move;

public class Pawn extends Piece{

	public Pawn(final int piecePosition, final Alliance pieceAlliance) {
		super(PieceType.PAWN,piecePosition, pieceAlliance);

	}

	@Override
	public List<Move> calculateLegalMoves(final Board board) {
		// TODO write logic to calculate the legal moves for pawn
		final List<Move> legalMoves = new ArrayList<Move>();
		return legalMoves;
		
	}
	
	@Override
	public String toString() {
		return Piece.PieceType.PAWN.toString();
	}

	@Override
	public Pawn movePiece(Move move) {
		return new Pawn(move.getDestinationPosition(),move.getMovedPiece().getAlliance());
	}
}
