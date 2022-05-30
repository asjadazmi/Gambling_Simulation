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
			int win_amount=150;
			int loose_amount=50;
			while(stake_amount > loose_amount && stake_amount < win_amount) {
				int bet=(int)Math.floor(Math.random()*10)%2;
				switch(bet) {
				case 1:
					System.out.println("Bet Win");
	                System.out.println("Final Amount: "+(stake_amount += bet_amount));
	                break;
				case 0:
					 System.out.println("Bet Loss");
		             System.out.println("Final Amount: "+(stake_amount -= bet_amount));
		             break;
		         default:
		          }
		}
	}
	}
	}

