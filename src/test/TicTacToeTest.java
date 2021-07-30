package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.Board;


class TicTacToeTest {

	@Test
	@DisplayName("Empty board creation")
	void testEmpty() {
		Board board = new Board();
		int cntField = 0;
		for (char field:board.getFields()) {
			if (field == ' ') {
				cntField++;
			}
		} 
		assertEquals(9, cntField, "An empty board should have 9 empty fields");

	}


}
