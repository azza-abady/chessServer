package com.chess.chessServer.pieces;

import java.util.ArrayList;
import java.util.List;

import com.chess.chessServer.alliance.Alliance;
import com.chess.chessServer.board.Board;
import com.chess.chessServer.board.Move;

public class Queen extends Piece{

	public Queen(final int piecePosition, final Alliance pieceAlliance) {
		super(PieceType.QUEEN,piecePosition, pieceAlliance);
	}

	@Override
	public List<Move> calculateLegalMoves(final Board board) {
		// TODO write logic to calculate the legal moves for queen
		final List<Move> legalMoves = new ArrayList<Move>();
		return legalMoves;
	}
	@Override
	public String toString() {
		return Piece.PieceType.QUEEN.toString();
	}

	@Override
	public Queen movePiece(Move move) {
		return new Queen(move.getDestinationPosition(),move.getMovedPiece().getAlliance());
	}
}
