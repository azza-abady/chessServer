package com.chess.chessServer.pieces;

import java.util.ArrayList;
import java.util.List;

import com.chess.chessServer.alliance.Alliance;
import com.chess.chessServer.board.Board;
import com.chess.chessServer.board.Move;

public class Knight extends Piece {

	public Knight(final int piecePosition, final Alliance pieceAlliance) {
		super(PieceType.KNIGHT,piecePosition, pieceAlliance);
	}

	@Override
	public List<Move> calculateLegalMoves(final Board board) {
		// TODO write logic to calculate the legal moves for knight
		final List<Move> legalMoves = new ArrayList<>();
		return legalMoves;
	}
	
	@Override
	public String toString() {
		return Piece.PieceType.KNIGHT.toString();
	}

	@Override
	public Knight movePiece(Move move) {
		return new Knight(move.getDestinationPosition(),move.getMovedPiece().getAlliance());
	}

}
