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
			System.out.println("Player "+(1+i)+", what is your guess?");
			guesses[i]= scan2.nextInt();
		}
		return guesses;
	}
}


class Ref
{
	int players;
	int answer;
	int winner;
	int []playerGuesses;
	
	
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
	
	int Answer()
	{
	    Random rand = new Random();
	    answer = rand.nextInt(11);
	    return answer;
	}
	
	int Winner(int []guesses, int answer)
	{
		Answer();
		for(int i=0;i<guesses.length;i++)
		{
			if(answer==guesses[i])
			{
				winner=i;
			}
			
		}
		return winner;
	
	}
	
	void Results()
	{
		System.out.println("The winning number is: "+answer);
		System.out.println("The winner is Player"+winner+"!!!");
	}
}

public class GuessGame 
{
	public static void main(String[] args)
	{
		Ref game = new Ref();
		game.collectPlayers();
		game.collectGuesses();
		game.Results();
	}
}
