package com.chess.chessServer.players;

import java.util.List;

import com.chess.chessServer.alliance.Alliance;
import com.chess.chessServer.board.Board;
import com.chess.chessServer.board.Move;
import com.chess.chessServer.pieces.Piece;

public class WhitePlayer extends Player{

	public WhitePlayer(Board board, List<Move> whiteLegalMoves, List<Move> blackLegalMoves) {
		super(board, whiteLegalMoves, blackLegalMoves);
	}

	@Override
	public List<Piece> getActivePieces() {
		return this.board.getWhitePieces();
	}

	@Override
	public Alliance getAlliance() {
		return Alliance.WHITE;
	}

	@Override
	public Player getEnemy() {
		return this.board.getBlackPlayer();
	}

}
