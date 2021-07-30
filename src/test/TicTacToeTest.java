package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.Board;

class TicTacToeTest {

	@Test
	@DisplayName("Empty board creation")
	void testEmpty() {
		Board board = new Board();
		assertEquals(9, countFields(' ', board.getFields()), "An empty board should have 9 empty fields");
		assertEquals('X', board.getNextPlayer(), "Player X should start the game");
		assertEquals(
				Arrays.asList("Game Board Creation…", " | | ", "-+-+-", " | | ", "-+-+-", " | | ", "", "Board Created.",
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
		
	}

	@Test
	@DisplayName("2nd mark on the board")
	void testSecondMark() {
		Board board = new Board();
		board.mark();
		board.mark();
 		assertEquals(1, countFields('O',board.getFields()), "After the second mark the board should have 1 O");
		
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
