package com.chess.chessServer.board;

import java.util.HashMap;
import java.util.Map;

import com.chess.chessServer.pieces.Piece;
import com.google.common.collect.ImmutableMap;

public abstract class Tile {
	private final int tileNumber;
	
	// cache all possible empty tiles
	private static final Map<Integer, EmptyTile> EMPTY_TILES_CACHE=createEmptyTiles();
	
	protected Tile(final int tileNumber){
		this.tileNumber = tileNumber;
	}
	public abstract boolean isTileOccupied();
	public abstract Piece getPiece();
	
	private static Map<Integer,EmptyTile> createEmptyTiles(){
		final Map<Integer,EmptyTile> emptyTileMap = new HashMap<Integer,EmptyTile>();
		for(int i=0;i<BoardUtils.NUM_TILES;i++) {  // the chess board consist of 64 tiles (8*8)
			emptyTileMap.put(i, new EmptyTile(i));
		}
		// to return Immutable map
		return ImmutableMap.copyOf(emptyTileMap);
	}
	// factory method to create tile
	public static Tile createTile(final int tileNumber,final Piece piece) {
		return piece !=null ? new OccupiedTile(tileNumber, piece) : EMPTY_TILES_CACHE.get(tileNumber); 
	}
	
	
}
