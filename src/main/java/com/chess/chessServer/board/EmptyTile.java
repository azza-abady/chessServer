package com.chess.chessServer.board;

import com.chess.chessServer.pieces.Piece;

public class EmptyTile extends Tile {

	EmptyTile(final int tileNumber) {
		super(tileNumber);
	}
	
	@Override
	public boolean isTileOccupied() {
		return false;
	}

	@Override
	public Piece getPiece() {
		return null;
	}
	
	@Override
	public String toString() {
		return "-";
	}
}
