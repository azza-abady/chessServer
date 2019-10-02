package com.chess.chessServer.alliance;

import com.chess.chessServer.players.BlackPlayer;
import com.chess.chessServer.players.Player;
import com.chess.chessServer.players.WhitePlayer;

public enum Alliance {
	WHITE
 {
		@Override
		public boolean isWhite() {
			return true;
		}

		@Override
		public boolean isBlack() {
			return false;
		}

		@Override
		public int getDirection() {
			return -1;
		}

		@Override
		public Player choosePlayer(final WhitePlayer whitePlayer, final BlackPlayer blackPlayer) {
			return whitePlayer;
		}
	}	
	,BLACK	
 {
		@Override
		public boolean isWhite() {
			return false;
		}

		@Override
		public boolean isBlack() {
			return true;
		}

		@Override
		public int getDirection() {
			return 1;
		}

		@Override
		public Player choosePlayer(WhitePlayer whitePlayer, BlackPlayer blackPlayer) {
			return blackPlayer;
		}
	};
	public abstract int getDirection();
	public abstract boolean isWhite();
	public abstract boolean isBlack();
	public abstract Player choosePlayer(WhitePlayer whitePlayer,BlackPlayer blackPlayer);
}
