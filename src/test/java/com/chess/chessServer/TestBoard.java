package com.chess.chessServer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.chess.chessServer.board.Board;

/**
 * Unit test for chess server.
 */
public class TestBoard {
	
	@Test
	public void initalBoard() {
		final Board board = Board.getStandardBoard();
		//assertEquals(board.currentPlayer().getLegalMoves().size(), 20);
		//assertEquals(board.currentPlayer().getEnemy().getLegalMoves().size(), 20);
		assertFalse(board.currentPlayer().isInCheck());
		assertFalse(board.currentPlayer().isInCheckMate());
		assertEquals(board.currentPlayer(), board.getWhitePlayer());
		assertEquals(board.currentPlayer().getEnemy(), board.getBlackPlayer());
		assertFalse(board.currentPlayer().getEnemy().isInCheck());
		assertFalse(board.currentPlayer().getEnemy().isInCheckMate());
	}
}