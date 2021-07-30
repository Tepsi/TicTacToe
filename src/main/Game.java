package main;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Game {
	Board board;

	public Game() {
		board = new Board();
	}

	public Board getBoard() {
		return board;
	}
	
	public void run() {
		printMessages(board.display());
		while (board.checkWinner() == ' ') {
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			board.mark();
			printMessages(board.display());
		}
	}

	private void printMessages(List<String> list) {
		for (String message : list) {
			System.out.println(message);
		}
	}

}
