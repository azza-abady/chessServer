package com.chess.chessServer;

import com.chess.chessServer.board.Board;

/**
 * @author azza.hamdy
 */
public class App 
{
    public static void main( String[] args )
    {
    	Board board = Board.getStandardBoard();
    	System.out.println(board);
    }
}
