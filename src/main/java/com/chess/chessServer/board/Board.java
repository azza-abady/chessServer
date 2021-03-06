package com.chess.chessServer.board;

import java.util.ArrayList;
import java.util.List;

import com.chess.chessServer.alliance.Alliance;
import com.chess.chessServer.pieces.Bishop;
import com.chess.chessServer.pieces.King;
import com.chess.chessServer.pieces.Knight;
import com.chess.chessServer.pieces.Pawn;
import com.chess.chessServer.pieces.Piece;
import com.chess.chessServer.pieces.Queen;
import com.chess.chessServer.pieces.Rook;
import com.chess.chessServer.players.BlackPlayer;
import com.chess.chessServer.players.Player;
import com.chess.chessServer.players.WhitePlayer;
import com.google.common.collect.ImmutableList;

public class Board {

	private final List<Tile> gameBoard;
	private final List<Piece> whitePieces;
	private final List<Piece> blackPieces;
	
	// to keep track of players on board
	private final WhitePlayer whitePlayer;
	private final BlackPlayer blackPlayer;
	
	private final Player currentPlayer;
	
	 Board(final BoardBuilder builder) {
		this.gameBoard = createGameBoard(builder);
		this.blackPieces = calculateActivePieces(this.gameBoard, Alliance.BLACK);
		this.whitePieces = calculateActivePieces(this.gameBoard, Alliance.WHITE);
		
		final List<Move> whiteLegalMoves = calculateLegalMoves(this.whitePieces);
		final List<Move> blackLegalMoves = calculateLegalMoves(this.blackPieces);
		
		this.whitePlayer = new WhitePlayer(this,whiteLegalMoves,blackLegalMoves);
		this.blackPlayer = new BlackPlayer(this,whiteLegalMoves,blackLegalMoves);
		this.currentPlayer = builder.nextMoveMaker.choosePlayer(this.whitePlayer, this.blackPlayer);
	}

	
	
	private List<Move> calculateLegalMoves(final List<Piece> pieces) {
		final List<Move> legalMoves = new ArrayList<>();
		for(final Piece piece: pieces) {
			legalMoves.addAll(piece.calculateLegalMoves(this));
		}
		return ImmutableList.copyOf(legalMoves);
	}

	private static List<Piece> calculateActivePieces(final List<Tile> gameBoard, final Alliance alliance) {
		final List<Piece> activePieces = new ArrayList<Piece>();
		for (final Tile tile : gameBoard) {
			if (tile.isTileOccupied()) {
				final Piece piece = tile.getPiece();
				if (piece.getAlliance() == alliance) {
					activePieces.add(piece);
				}
			}
		}
		return ImmutableList.copyOf(activePieces);
	}

	public Tile getTile(int tilePosition) {
		return gameBoard.get(tilePosition);
	}

	private static List<Tile> createGameBoard(final BoardBuilder builder) {
		final Tile[] tiles = new Tile[BoardUtils.NUM_TILES];
		for (int i = 0; i < BoardUtils.NUM_TILES; i++) {
			tiles[i] = Tile.createTile(i, builder.boardConfig.get(i));
		}
		return ImmutableList.copyOf(tiles);
	}
	
	
	public List<Piece> getWhitePieces() {
		return this.whitePieces;
	}


	public List<Piece> getBlackPieces() {
		return this.blackPieces;
	}

	
	public WhitePlayer getWhitePlayer() {
		return whitePlayer;
	}

	public BlackPlayer getBlackPlayer() {
		return blackPlayer;
	}

	public Player currentPlayer() {
		return this.currentPlayer;
	}

	@Override
	public String toString() {
		StringBuilder stringbuilder = new StringBuilder();
		for(int i=0; i<BoardUtils.NUM_TILES;i++) {
			final String tileText = this.gameBoard.get(i).toString();
			stringbuilder.append(String.format("%3s", tileText));
			if((i+1) % BoardUtils.NUM_TILES_PER_ROW == 0) {
				stringbuilder.append("\n");
			}
		}
		return stringbuilder.toString();
	}
	
	// init the game board
	public static Board getStandardBoard() {
		final BoardBuilder builder = new BoardBuilder();
		builder.setPiece(new Rook(0, Alliance.BLACK));
		builder.setPiece(new Knight(1, Alliance.BLACK));
		builder.setPiece(new Bishop(2, Alliance.BLACK));
		builder.setPiece(new Queen(3, Alliance.BLACK));
		builder.setPiece(new King(4, Alliance.BLACK));
		builder.setPiece(new Bishop(5, Alliance.BLACK));
		builder.setPiece(new Knight(6, Alliance.BLACK));
		builder.setPiece(new Rook(7, Alliance.BLACK));
		builder.setPiece(new Pawn(8, Alliance.BLACK));
		builder.setPiece(new Pawn(9, Alliance.BLACK));
		builder.setPiece(new Pawn(10, Alliance.BLACK));
		builder.setPiece(new Pawn(11, Alliance.BLACK));
		builder.setPiece(new Pawn(12, Alliance.BLACK));
		builder.setPiece(new Pawn(13, Alliance.BLACK));
		builder.setPiece(new Pawn(14, Alliance.BLACK));
		builder.setPiece(new Pawn(15, Alliance.BLACK));

		builder.setPiece(new Pawn(48, Alliance.WHITE));
		builder.setPiece(new Pawn(49, Alliance.WHITE));
		builder.setPiece(new Pawn(50, Alliance.WHITE));
		builder.setPiece(new Pawn(51, Alliance.WHITE));
		builder.setPiece(new Pawn(52, Alliance.WHITE));
		builder.setPiece(new Pawn(53, Alliance.WHITE));
		builder.setPiece(new Pawn(54, Alliance.WHITE));
		builder.setPiece(new Pawn(55, Alliance.WHITE));
		builder.setPiece(new Rook(56, Alliance.WHITE));
		builder.setPiece(new Knight(57, Alliance.WHITE));
		builder.setPiece(new Bishop(58, Alliance.WHITE));
		builder.setPiece(new Queen(59, Alliance.WHITE));
		builder.setPiece(new King(60, Alliance.WHITE));
		builder.setPiece(new Bishop(61, Alliance.WHITE));
		builder.setPiece(new Knight(62, Alliance.WHITE));
		builder.setPiece(new Rook(63, Alliance.WHITE));

		builder.setMoveMaker(Alliance.WHITE);
		return builder.build();
	}

}
