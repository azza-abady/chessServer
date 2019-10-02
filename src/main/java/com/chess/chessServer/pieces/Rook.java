package com.chess.chessServer.pieces;

import java.util.ArrayList;
import java.util.List;

import com.chess.chessServer.alliance.Alliance;
import com.chess.chessServer.board.Board;
import com.chess.chessServer.board.Move;

public class Rook extends Piece {

	public Rook(final int piecePosition, final Alliance pieceAlliance) {
		super(PieceType.ROOK,piecePosition, pieceAlliance);
	}

	@Override
	public List<Move> calculateLegalMoves(final Board board) {
		// TODO write logic to calculate the legal moves for rook
		final List<Move> legalMoves = new ArrayList<Move>();
		return legalMoves;
	}
	@Override
	public String toString() {
		return Piece.PieceType.ROOK.toString();
	}

	@Override
	public Rook movePiece(Move move) {
		return new Rook(move.getDestinationPosition(),move.getMovedPiece().getAlliance());
	}
}
