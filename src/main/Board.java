package main;

import java.util.Arrays;

public class Board {
	
	private char [] fields;
	
	public Board() {
		fields = new char[9];
		Arrays.fill(fields, ' ');
	}
	
	public char[] getFields() {
		return fields;
	}

}
