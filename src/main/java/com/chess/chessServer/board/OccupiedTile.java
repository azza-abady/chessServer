package com.chess.chessServer.board;

import com.chess.chessServer.pieces.Piece;

public class OccupiedTile extends Tile {

	private final Piece pieceOnTile;
	
	OccupiedTile(final int tileNumber, final Piece placedPiece) {
		super(tileNumber);
		this.pieceOnTile = placedPiece;
	}

	@Override
	public boolean isTileOccupied() {
		return true;
	}

	@Override
	public Piece getPiece() {
		return pieceOnTile;
	}
	
	@Override
	public String toString() {
		return getPiece().getAlliance().isBlack() ? getPiece().toString().toLowerCase() : getPiece().toString(); // to print black pieces in lower case
	}
}
