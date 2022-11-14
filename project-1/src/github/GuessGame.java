package github;

import java.util.*;

import github.Ref.Players;


class Players  
{
	int numOfPlayers;
	
	int getNumOfPlayers()
	{
		Scanner scan1 = new Scanner(System.in);
		System.out.println("How many players?");
		numOfPlayers = scan1.nextInt();
		
		return numOfPlayers;
	}
}

class Guesses 
{
	int []guesses;
	
	int[] getGuesses(int numOfPlayers)
	{
		int []guesses= new int[numOfPlayers];
		for(int i=0;i<guesses.length;i++)
		{
			Scanner scan2 = new Scanner(System.in);
			System.out.println("Player "+(1+i)+", guess a number between 0-10.");
			guesses[i]= scan2.nextInt();
		}
		return guesses;
	}
}


class Ref2
{
	int players;
	int []playerGuesses;
	int answer;
	int winner;
	
	void collectPlayers()
	{
		Players p=new Players();
		players=p.getNumOfPlayers();
	}
	
	void collectGuesses()
	{
		Guesses g=new Guesses();
		playerGuesses=g.getGuesses(players);
	}
	
	int answer()
	{
		Random random = new Random();
		answer = random.nextInt(11);
		
	    return answer;
	}
	
	void winner()
	{
		
		for(int i=0;i<playerGuesses.length;i++)
		{
			if(answer==playerGuesses[i])
			{
				winner=i;
				System.out.println("The winning number is: "+answer);
				System.out.println("Congrats to Player "+(i+1)+" !");
				break;
			}
			else 
			{
				System.out.println("The winning number is: "+answer);
				System.out.println("Losers, please try again :)");
				break;
			}
		}
	}
}

public class GuessGame 
{
	public static void main(String[] args)
	{
		Ref2 game = new Ref2();
		game.collectPlayers();
		game.collectGuesses();
		game.answer();
		game.winner();
	}
}
