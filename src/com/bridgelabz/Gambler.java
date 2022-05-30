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
		int check=(int)Math.floor(Math.random()*10)%2;
		System.out.println("ran: "+check);
		switch(check) {
		case 1:
			stake_amount+=bet_amount;
		    System.out.println("gambler stake amount is:"+stake_amount);
		    break;
		case 0:
			stake_amount-=bet_amount;
			System.out.println("gambler stake amount is:"+stake_amount);
			break;
		default:
		}
		}
	}

