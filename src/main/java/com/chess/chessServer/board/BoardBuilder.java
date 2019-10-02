package com.chess.chessServer.board;

import java.util.HashMap;
import java.util.Map;

import com.chess.chessServer.alliance.Alliance;
import com.chess.chessServer.pieces.Piece;

public class BoardBuilder {
	Map<Integer, Piece> boardConfig;
	Alliance nextMoveMaker;

	public BoardBuilder() {
		this.boardConfig = new HashMap<>();
	}

	public BoardBuilder setPiece(final Piece piece) {
		this.boardConfig.put(piece.getPiecePosition(), piece);
		return this;
	}

	public BoardBuilder setMoveMaker(final Alliance nextMoveMaker) {
		this.nextMoveMaker = nextMoveMaker;
		return this;
	}

	public Board build() {
		return new Board(this);
	}
}
