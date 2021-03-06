package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.Board;
import main.Game;

class TicTacToeTest {

	@Test
	@DisplayName("Empty board creation")
	void testEmpty() {
		Board board = new Board();
		assertEquals(9, countFields(' ', board.getFields()), "An empty board should have 9 empty fields");
		assertEquals('X', board.getNextPlayer(), "Player X should start the game");
		assertEquals(
				Arrays.asList("Game Board Creation?", " | | ", "-+-+-", " | | ", "-+-+-", " | | ", "", "Board Created.",
						"The game will start with player X"),
				board.display(), "The empty board should be displayed with correct messages");
	}

	@Test
	@DisplayName("1st mark on the board")
	void testFirstMark() {
		Board board = new Board();
		board.mark();
 		assertEquals(1, countFields('X',board.getFields()), "After the first mark the board should have 1 X");
 		assertEquals(8, countFields(' ',board.getFields()), "After the first mark the board should have 8 blanks");
 		assertEquals('O', board.getNextPlayer(), "Next player should be O");
		
	}

	@Test
	@DisplayName("2nd mark on the board")
	void testSecondMark() {
		Board board = new Board();
		board.mark();
		board.mark();
 		assertEquals(1, countFields('O',board.getFields()), "After the second mark the board should have 1 O");
 		assertEquals(1, countFields('X',board.getFields()), "After the second mark the board should have 1 X");
 		assertEquals(7, countFields(' ',board.getFields()), "After the second mark the board should have 7 blanks");
 		assertEquals('X', board.getNextPlayer(), "Next player should be X");
		
	}
	
	@Test
	@DisplayName("Check display")
	void testCheckDisplay() {
		Board board = new Board(new String("XOXO     ").toCharArray());
		assertEquals(
				Arrays.asList("Player X:", "X|O|X", "-+-+-", "O| | ", "-+-+-", " | | ", ""),
				board.display(), "Board in progress should be displayed properly");
	}
	
	@Test
	@DisplayName("Check Winner")
	void testCheckWinner() {
		Board board = new Board(new String("XOXO     ").toCharArray());
		assertEquals(' ',board.checkWinner(), "Board in progress has no winner");
		board = new Board(new String("XXXOO    ").toCharArray());
		assertEquals('X',board.checkWinner(), "X wins in a horizontal line");
		board = new Board(new String("XOXXO  O ").toCharArray());
		assertEquals('O',board.checkWinner(), "O wins in a vertical line");
		board = new Board(new String("OX XO X O").toCharArray());
		assertEquals('O',board.checkWinner(), "O wins in a diagonal \\");
		board = new Board(new String(" XOXO O X").toCharArray());
		assertEquals('O',board.checkWinner(), "O wins in a diagonal /");
	}

	@Test
	@DisplayName("Check game")
	void testCheckGame() {
		Game game = new Game();
		game.run();
		assertNotEquals(' ',game.getBoard().checkWinner(), "Game shouldn't end in progress");
	}

	
	
	private int countFields(char what, char[] fields) {
		int cntField = 0;
		for (char field : fields) {
			if (field == what) {
				cntField++;
			}
		}
		return cntField;
	}

	
}
