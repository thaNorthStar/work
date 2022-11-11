package github;

import java.util.*;


//
//class Player 
//{
//	int numOfPlayers;
//	int guesses;
//	
//	
//	int getGameSetup()
//	{
//		Scanner scan1 = new Scanner(System.in);
//		System.out.println("How many players?");
//		int numOfPlayers = scan1.nextInt();
//		int [][]playerArray= new int[numOfPlayers][1];
//
//		for(int i=0;i<playerArray.length;i++)
//		{
//			for(int j=0; j<playerArray[i].length;j++)
//			{
//				Scanner scan2 = new Scanner(System.in);
//				System.out.println("Player "+(1+i)+", enter your guess: ");
//				playerArray[i][j] = scan2.nextInt();
//			}
//		}
//		System.out.println("Player guesses: "+numOfPlayers);
//	}
//}

//
//
//class Ref
//{
//	int answer;
//	int winner;
//randim numer
//	
//
//}
public class GuessGame 
{
	public static void main(String[] args)
	{
			Scanner scan1 = new Scanner(System.in);
			System.out.println("How many players?");
			int numOfPlayers = scan1.nextInt();
			int [][]playerArray= new int[numOfPlayers][1];

			for(int i=0;i<playerArray.length;i++)
			{
				for(int j=0; j<playerArray[i].length;j++)
				{
					Scanner scan2 = new Scanner(System.in);
					System.out.println("Player "+(1+i)+", enter your guess: ");
					playerArray[i][j] = scan2.nextInt();
				}
			}
			System.out.println("thats "+numOfPlayers);
			System.out.println(playerArray.getClass().getName());
			System.out.println("The Players guess;");

	        for(int i=0; i<playerArray.length;i++)
	        {
	            for(int j=0; j<playerArray[i].length;j++)
	            {
	                System.out.print(playerArray[i][j] + " ");
	            }
	            System.out.println();
	        }
	        
//
	}
}
