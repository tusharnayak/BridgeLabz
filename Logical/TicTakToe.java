package com.Bridgelabz.Logical;

public class TicTakToe 
{
	public static void main(String[] args) {
			int player = 0;
			int[][] Board = new int[3][3];
			boolean isEmpty = true;
			//creating an object of game.
			TicTacToeGame obj = new TicTacToeGame(player,Board,isEmpty);
			//calling play method to start the game.
			obj.play(player, Board, isEmpty);
	}

}
