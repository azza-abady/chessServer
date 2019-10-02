package com.chess.chessServer.pieces;

import java.util.ArrayList;
import java.util.List;

import com.chess.chessServer.alliance.Alliance;
import com.chess.chessServer.board.Board;
import com.chess.chessServer.board.Move;

public class King extends Piece{

	public King(final int piecePosition, final Alliance pieceAlliance) {
		super(PieceType.KING,piecePosition, pieceAlliance);
	}

	@Override
	public List<Move> calculateLegalMoves(final Board board) {
		// TODO write logic to calculate the legal moves for king
		final List<Move> legalMoves = new ArrayList<>();
		return legalMoves;
	}
	@Override
	public String toString() {
		return Piece.PieceType.KING.toString();
	}

	@Override
	public King movePiece(Move move) {
		return new King(move.getDestinationPosition(),move.getMovedPiece().getAlliance());
	}
}
