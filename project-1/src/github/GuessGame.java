package github;

import java.util.*;


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
	int answer;
	int winner;
}

//	
//	for(int elem:guesses)
//	{
//		System.out.println(elem);
//	}
//	return guesses;
//
//
//class Ref
//{
//	int answer;
//	
//
//	//
//}
public class GuessGame 
{
	public static void main(String[] args)
	{
//		Ref obj = new Ref();
		
		Ref.Input obj1 = new Ref.Input();
		obj1.numOfPlayers();
		

//			int [][]playerArray= new int[numOfPlayers][1];
//
//			for(int i=0;i<playerArray.length;i++)
//			{
//				for(int j=0; j<playerArray[i].length;j++)
//				{
//					Scanner scan2 = new Scanner(System.in);
//					System.out.println("Player "+(1+i)+", enter your guess: ");
//					playerArray[i][j] = scan2.nextInt();
//				}
//			}
//			System.out.println("thats "+numOfPlayers);
//			System.out.println(playerArray.getClass().getName());
//			System.out.println("The Players guess;");
//
//	        for(int i=0; i<playerArray.length;i++)
//	        {
//	            for(int j=0; j<playerArray[i].length;j++)
//	            {
//	                System.out.print(playerArray[i][j] + " ");
//	            }
//	            System.out.println();
//	        }
	        
//
	}
}
