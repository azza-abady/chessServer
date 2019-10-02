package com.chess.chessServer.players;

import java.util.List;

import com.chess.chessServer.alliance.Alliance;
import com.chess.chessServer.board.Board;
import com.chess.chessServer.board.Move;
import com.chess.chessServer.board.MoveTransition;
import com.chess.chessServer.pieces.King;
import com.chess.chessServer.pieces.Piece;
import com.chess.chessServer.pieces.Piece.PieceType;

public abstract class Player {

	protected final King playerKing;
	protected final Board board;
	protected final List<Move> legalMoves;
	
	public Player(final Board board, final List<Move> legalMoves, final List<Move> enemyMoves) {
		this.playerKing = null;//establishKing();
		this.board = board;
		this.legalMoves = legalMoves;
		
	}

	private King establishKing() {
		for(final Piece piece:getActivePieces()) {
			if(piece.getPieceType().equals(PieceType.KING)) {
				return (King) piece;
			}
		}
		throw new RuntimeException("Invalid Game");
	}
	
	public boolean isLegalMove(final Move move) {
		return this.legalMoves.contains(move);
	}
	// TODO to be Implemented
	public boolean isInCheck() {
		return false;
	}
	
	public boolean isInCheckMate() {
		return false;
	}
	// TODO to be Implemented
	public MoveTransition makeMove(final Move move) {
		return null;
	}
	
	
	public List<Move> getLegalMoves() {
		return legalMoves;
	}

	public King getPlayerKing() {
		return playerKing;
	}

	public abstract List<Piece> getActivePieces();
	
	public abstract Alliance getAlliance();
	
	public abstract Player getEnemy();
}
