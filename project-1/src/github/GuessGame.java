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
class Ref
{
	
	class Input
	{
		public void numOfPlayers()
		{
			Scanner scan1 = new Scanner(System.in);
			System.out.println("How many players?");
			int numOfPlayers = scan1.nextInt();
			int []guesses= new int[numOfPlayers];
			
			for(int i=0;i<guesses.length;i++)
			{
				Scanner scan2 = new Scanner(System.in);
				System.out.println("Player "+(1+i)+", what is your guess?");
				guesses[i]= scan2.nextInt();
			}
			System.out.println("The "+numOfPlayers+" players' guesses are:" );
			for(int elem:guesses)
			{
				System.out.println(elem);
			}
		}
	}
	
}
public class GuessGame 
{
	public static void main(String[] args)
	{
		Ref obj = new Ref();
		
		Ref.Input obj1 = obj.new Input();
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
