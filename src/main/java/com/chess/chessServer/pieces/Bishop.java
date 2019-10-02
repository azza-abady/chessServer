package com.chess.chessServer.pieces;

import java.util.ArrayList;
import java.util.List;

import com.chess.chessServer.alliance.Alliance;
import com.chess.chessServer.board.Board;
import com.chess.chessServer.board.Move;

public class Bishop extends Piece {

	public Bishop(final int piecePosition, final Alliance pieceAlliance) {
		super(PieceType.BISHOP,piecePosition, pieceAlliance);
	}

	@Override
	public List<Move> calculateLegalMoves(final Board board) {
		// TODO write logic to calculate the legal moves for bishop
		final List<Move> legalMoves = new ArrayList<>();
		return legalMoves;
	}
	
	@Override
	public String toString() {
		return Piece.PieceType.BISHOP.toString();
	}

	@Override
	public Bishop movePiece(Move move) {
		return new Bishop(move.getDestinationPosition(),move.getMovedPiece().getAlliance());
	}

}
