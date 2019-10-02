package com.chess.chessServer.players;

import java.util.List;

import com.chess.chessServer.alliance.Alliance;
import com.chess.chessServer.board.Board;
import com.chess.chessServer.board.Move;
import com.chess.chessServer.pieces.Piece;

public class BlackPlayer extends Player{

	public BlackPlayer(Board board, List<Move> whiteLegalMoves, List<Move> blackLegalMoves) {
		super(board, blackLegalMoves, whiteLegalMoves);
	}

	@Override
	public List<Piece> getActivePieces() {
		return this.board.getBlackPieces();
	}

	@Override
	public Alliance getAlliance() {
		return Alliance.BLACK;
	}

	@Override
	public Player getEnemy() {
		return this.board.getWhitePlayer();
	}

}
