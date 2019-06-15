package ttt;

import java.util.*;

public class TickTackToe {
	public static boolean playGame;
	public String[][] gameBoard = new String[7][7];
	
	TickTackToe(){
		playGame = true;
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < 7; j++) {
				if(i % 2 == 0) {
					if(j % 2 == 0) {
						gameBoard[i][j] = " ";
					}
					else {
						gameBoard[i][j] = "-";
					}
				}
				else {
					if(j % 2 == 0) {
						gameBoard[i][j] = "|";
					}
					else {
						gameBoard[i][j] = " ";
					}
				}
			}
		}
		playGame();
	}
	
	public void playGame() {
		
		
	}
	
	public void draw() {
		
	}
	
	public void playerTurn() {
		
	}
	
	public void botTurn() {
		
	}
	
	public void playerWon() {
		
	}
	
	public void botWon() {
		
	}
	
	Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		TickTackToe game = new TickTackToe();
	}
}
