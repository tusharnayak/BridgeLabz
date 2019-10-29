package com.Bridgelabz.Logical;
import java.util.Scanner;

public class TicTacToeGame 
{
	
	
		public TicTacToeGame(int player,int [][] Board,boolean isEmpty){}
		//Initializing the board.
		public void board(int player,int [][] Board,boolean isEmpty) {
		System.out.println(" Tic-Tac-Toe Game \n Computer is x \n Player  is o ");
		for (int i = 0; i < Board.length; i++) {
		for (int j = 0; j < Board.length; j++) {
		Board[i][j] = 4;
		}
		}
		System.out.println(" Players Board :");
		dispBoard(player,Board,isEmpty);
		}
		/*
		* print the board
		*/
		public void dispBoard(int player,int [][] Board,boolean isEmpty) {
		int count = 0;
		for (int i = 0; i < Board.length; i++) {
		System.out.println("---------------");
		System.out.print("|");
		for (int j = 0; j < Board.length; j++) {
		if (Board[i][j] == 0) {
		count++;
		System.out.print(" x |");
		}
		else if (Board[i][j] == 1) {
		count++;
		System.out.print(" o |");
		}
		else
		System.out.print("   |");
		}
		System.out.println();
		}
		if (count == 9) {
		isEmpty = false;
		}
		System.out.println("---------------");
		}
		/*
		* this method takes the steps that have given by player and computer.
		* And changing the values in the board array.
		*/
		public void putVal(int player,int [][] Board,boolean isEmpty) {
		int i;
		int j;
		if (player % 2 == 1) {
		i = (int) (Math.random() * 10) % 3;
		j = (int) (Math.random() * 10) % 3;
		} else {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two values less than 3");
		i = s.nextInt();
		j = s.nextInt();
		}
		if (Board[i][j] == 4) {
		if (player % 2 == 0) {
		Board[i][j] = 0;
		} else {
		Board[i][j] = 1;
		System.out.println("Coumputer Choosing " + i + " " + j);
		}
		} else
		putVal(player,Board,isEmpty);
		}
		//when the sum of the rows in a array is equal then it will prints true.
		public boolean win(int player,int [][] BOARD,boolean isEmpty) {
		return ((BOARD[0][0] + BOARD[0][1] + BOARD[0][2] == player * 3)
		|| (BOARD[1][0] + BOARD[1][1] + BOARD[1][2] == player * 3)
		|| (BOARD[2][0] + BOARD[2][1] + BOARD[2][2] == player * 3)
		|| (BOARD[0][0] + BOARD[1][0] + BOARD[2][0] == player * 3)
		|| (BOARD[0][1] + BOARD[1][1] + BOARD[2][1] == player * 3)
		|| (BOARD[0][2] + BOARD[1][2] + BOARD[2][2] == player * 3)
		|| (BOARD[0][0] + BOARD[1][1] + BOARD[2][2] == player * 3)
		|| (BOARD[2][0] + BOARD[1][1] + BOARD[0][2] == player * 3));
		}
		public void play(int player,int [][] Board,boolean isEmpty) {
		/*
		* this board initially it will print the board.
		* And next prints the borad,which the player selected the point.
		*/
		board(player,Board,isEmpty);
		//this method runs untill one of the player won the game.
		while (isEmpty) {
		System.out.println("Player turn");
		putVal(player,Board,isEmpty);
		dispBoard(player,Board,isEmpty);
		if (win(player,Board,isEmpty)) {
		System.out.println("Player won");
		return;
		}
		player = 1;
		System.out.println("Computer turn");
		putVal(player,Board,isEmpty);
		dispBoard(player,Board,isEmpty);
		if (win(player,Board,isEmpty)) {
		System.out.println("Computer won");
		return;
		}
		player = 0;
		}
		}
		}
		
		


