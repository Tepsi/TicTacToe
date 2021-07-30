package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Board {

	private char[] fields;
	private char nextPlayer;

	public Board() {
		fields = new char[9];
		Arrays.fill(fields, ' ');
		nextPlayer = 'X';
	}

	public Board(char[] fields) {
		this.fields = fields;
		nextPlayer = 'X';
	}

	public char[] getFields() {
		return fields;
	}

	public char getNextPlayer() {
		return nextPlayer;
	}

	public void mark() {
		ArrayList<Integer> emptyList = new ArrayList<>();
		for (int i = 0; i < fields.length; i++) {
			if (fields[i] == ' ') {
				emptyList.add(i);
			}
		}
		Random random = new Random();
		fields[emptyList.get(random.nextInt(emptyList.size()))] = nextPlayer;
		if (nextPlayer == 'X') {
			nextPlayer = 'O';
		} else {
			nextPlayer = 'X';
		}
	}
	
	public char checkWinner() {
		for (int row = 0; row < 3; row++) {
			if (fields[row*3] == fields[row*3+1] &&
					fields[row * 3] == fields[row * 3 + 2])
				return fields[row*3];
		}
		for (int column = 0; column < 3; column++) {
			if (fields[column] == fields[3+column] &&
			    fields[column] == fields[6+column]) return fields[column];
		}
		
		if (fields[0] == fields[4] &&
			    fields[0] == fields[8]) return fields[4];
		
		if (fields[2] == fields[4] &&
				fields[2] == fields[6]) return fields[4];
		
		return ' ';
	}

	public List<String> display() {
		ArrayList<String> messages = new ArrayList<>();
		if (isEmpty()) {
			messages.add("Game Board Creation…");
			messages.add(" | | ");
			messages.add("-+-+-");
			messages.add(" | | ");
			messages.add("-+-+-");
			messages.add(" | | ");
			messages.add("");
			messages.add("Board Created.");
			messages.add("The game will start with player X");
		} else {
			messages.add("Player " + nextPlayer + ":");
			messages.add(fields[0] + "|" + fields[1] + "|" + fields[2]);
			messages.add("-+-+-");
			messages.add(fields[3] + "|" + fields[4]+ "|" + fields[5]);
			messages.add("-+-+-");
			messages.add(fields[6] + "|" + fields[7] + "|" + fields[8]);
			messages.add("");

		}
		return messages;
	}
	
	private boolean isEmpty() {
		for (char field:fields) {
			if (field != ' ') {
				return false;
			}
		}
		return true;
	}

}
