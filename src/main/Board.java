package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board {
	
	private char [] fields;
	
	public Board() {
		fields = new char[9];
		Arrays.fill(fields, ' ');
	}
	
	public char[] getFields() {
		return fields;
	}
	
	public char getNextPlayer() {
		return 'X';
	}
	
	public List<String> display() {
		ArrayList<String> messages = new ArrayList<>();
		messages.add("Game Board Creation…");
		messages.add(" | | ");
		messages.add("-+-+-");
		messages.add(" | | ");
		messages.add("-+-+-");
		messages.add(" | | ");
		messages.add("");
		messages.add("Board Created.");
		messages.add("The game will start with player X");
		return messages;
	}

}
