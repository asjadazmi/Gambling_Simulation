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
		
			int win_amount=100+50;
			int loose_amount=100-50;
			int winner=0;
			int Winning = 0;
	        int Winner_Day=0;
	        int Losser_Day=0;
			
			for(int day=1;day<=20;day++) {
				stake_amount=100;
				while(stake_amount > loose_amount && stake_amount < win_amount) {
					int check1=(int)Math.floor(Math.random()*10)%2;
					switch(check1) {
					case 1:
						stake_amount+=bet_amount;
						break;
					case 0:
						stake_amount-=bet_amount;
						break;
					 default:
					}
				}
				if(stake_amount == win_amount) {
	                System.out.println("you won the game "+day);
	                winner += 50;
	            }
				else 
	            {
	                System.out.println("you are looser "+day);
	                winner -= 50;
	            }
				if(stake_amount==win_amount) {
					Winner_Day+=1;
					winner+=loose_amount;
				}
				else {
					Losser_Day-=1;
					winner -=50;
					
				}
				System.out.println("Total Win Days in month: "+Winner_Day);
		        System.out.println("Total Loss Days in month: "+Losser_Day);
		        System.out.println("Total Win Price Won In Month Is " +winner );	
					
				}
	            System.out.println("Total Win Price: "+winner );
			}
		}
	
	
	

