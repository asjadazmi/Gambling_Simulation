package com.bridgelabz;
import java.util.Random;
public class Gambler {
	public static void main(String[] args) {
		game();
	}
	public static void game() {
		System.out.println("welcome to the gambling simulation:");
		int stake_amount =100;
		int bet_amount=1;
		System.out.println("every day game of stake is: "+stake_amount+"$");
		System.out.println("betting of every game is: "+bet_amount+"$");
	}
}
