package ttt;
import java.util.*;

public class TickTackToe {
	
	public static boolean playGame;
	public String[][] gameBoard = new String[7][7];
	public int[] wins = {0, 0};
	
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
		
		while(playGame == true) {
			draw();
			playerTurn();
			playerWon();
			if(playGame == false) {
				draw();
				break;
			}
			botTurn();
			botWon();
			if(playGame == false) {
				draw();
				break;
			}
		}
	}
	
	public void draw() {
		for(String[] row: gameBoard) {
			for(String pos: row) {
				System.out.print(pos);
			}
			System.out.println();
		}
	}
	
	public void playerTurn() {
		boolean spotTaken = true;
		
		while(spotTaken == true) {
			System.out.println("Coordinates(x,y): ");
			String coordinates = s.nextLine();
			int x = Integer.parseInt(coordinates.substring(0, 1));
			int y = Integer.parseInt(coordinates.substring(2, 3));
			
			
			switch(x) {
			case 1:
				break;
			case 2:
				x = 3;
				break;
			case 3:
				x = 5;
				break;
			}
			if(y == 2) {
				y = 3;
			}
			else if(y == 3) {
				y = 5;
			}
			
			if(gameBoard[y][x].equals("X") == false && gameBoard[y][x].equals("O") == false) {
				spotTaken = false;
				gameBoard[y][x] = "X";
			}
		}
	}
	
	public void botTurn() {
		boolean spotTaken = true;
		while(spotTaken == true) {
			int x = ((int)(Math.random() * 3)) + 1;
			int y = ((int)(Math.random() * 3)) + 1;
			
			switch(x) {
			case 1:
				break;
			case 2:
				x = 3;
				break;
			case 3:
				x = 5;
				break;
			}
			
			switch(y) {
			case 1:
				break;
			case 2:
				y = 3;
				break;
			case 3:
				y = 5;
				break;
			}
			
			if(gameBoard[y][x].equals("X") == false && gameBoard[y][x].equals("O") == false) {
				spotTaken = false;
				gameBoard[y][x] = "O";
			}
		}
	}
	
	public void playerWon() {
		boolean playerWon = false;
		if(gameBoard[1][1].equals("X") && gameBoard[1][3].equals("X") && gameBoard[1][5].equals("X")) {
			playerWon = true;
		}
		else if(gameBoard[3][1].equals("X") && gameBoard[3][3].equals("X") && gameBoard[3][5].equals("X")) {
			playerWon = true;
		}
		else if(gameBoard[5][1].equals("X") && gameBoard[5][3].equals("X") && gameBoard[5][5].equals("X")) {
			playerWon = true;
		}
		else if(gameBoard[1][1].equals("X") && gameBoard[3][1].equals("X") && gameBoard[5][1].equals("X")) {
			playerWon = true;
		}
		else if(gameBoard[1][3].equals("X") && gameBoard[3][3].equals("X") && gameBoard[5][3].equals("X")) {
			playerWon = true;
		}
		else if(gameBoard[1][5].equals("X") && gameBoard[3][5].equals("X") && gameBoard[5][5].equals("X")) {
			playerWon = true;
		}
		else if(gameBoard[1][1].equals("X") && gameBoard[3][3].equals("X") && gameBoard[5][5].equals("X")) {
			playerWon = true;
		}
		else if(gameBoard[1][5].equals("X") && gameBoard[3][3].equals("X") && gameBoard[5][1].equals("X")) {
			playerWon = true;
		}
		
		if(playerWon == true) {
			System.out.println("YOU WIN!");
			playGame = false;
		}
	}
	
	public void botWon() {
		boolean botWon = false;
		if(gameBoard[1][1].equals("O") && gameBoard[1][3].equals("O") && gameBoard[1][5].equals("O")) {
			botWon = true;
		}
		else if(gameBoard[3][1].equals("O") && gameBoard[3][3].equals("O") && gameBoard[3][5].equals("O")) {
			botWon = true;
		}
		else if(gameBoard[5][1].equals("O") && gameBoard[5][3].equals("O") && gameBoard[5][5].equals("O")) {
			botWon = true;
		}
		else if(gameBoard[1][1].equals("O") && gameBoard[3][1].equals("O") && gameBoard[5][1].equals("O")) {
			botWon = true;
		}
		else if(gameBoard[1][3].equals("O") && gameBoard[3][3].equals("O") && gameBoard[5][3].equals("O")) {
			botWon = true;
		}
		else if(gameBoard[1][5].equals("O") && gameBoard[3][5].equals("O") && gameBoard[5][5].equals("O")) {
			botWon = true;
		}
		else if(gameBoard[1][1].equals("O") && gameBoard[3][3].equals("O") && gameBoard[5][5].equals("O")) {
			botWon = true;
		}
		else if(gameBoard[1][5].equals("O") && gameBoard[3][3].equals("O") && gameBoard[5][1].equals("O")) {
			botWon = true;
		}
		
		if(botWon == true) {
			System.out.println("YOU LOSE!");
			playGame = false;
		}
	}
	
	Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		TickTackToe game = new TickTackToe();
	}
	
	
}
