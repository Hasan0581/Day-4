import java.util.Random;

public class SnakeLadder {

	
	static int count = 1;
	static final int Winposition = 100;
	static int player1position = 0;
	static int player2position = 0;
	static int player1currentposition = 0;
	static int player2currentposition = 0;
	
	public static void main (String[] args)
	{
		System.out.println("Welcome to SnakeLadder Program");
				
			while (player1currentposition <= Winposition && player2currentposition <= Winposition)
		{
			if(count%2 !=0)
			{
				System.out.println("Player1 is Playing:");
				player1position = player1position();		
				player1currentposition = player1position;	
			}
			else
			{
				System.out.println("Player2 is Playing");
				player2position = player2position();
				player2currentposition = player2position;
			}
			if(player1position <= Winposition || player2position <= Winposition)
				count++;
			if( player1position == Winposition || player2position == Winposition)
				break;
			System.out.println("Player1 Position = "+player1currentposition);
			System.out.println("Player2 Position = "+player2currentposition);
		}
		System.out.println("P1Position "+player1position);
		System.out.println("P2Position "+player2position);
		
		if(player1position > player2position)
			System.out.println("Player1 Won the Game");
		else 
			System.out.println("Player2 Won the Game");

		System.out.println("The Number of Time of Dicerolled to Win the Game is "+count);	    
		}
	
	public static int rollDice()
	{
	    Random r = new Random();
	    int n=r.nextInt(6)+1;
	    return (n);
	   
	}	
	
	public static int player1position()
	{
			int DiceValue = rollDice();
			System.out.println("The Dice Value is "+DiceValue);
			
			if(DiceValue == 6)
			{
				int a = rollDice();
				
				System.out.println("The Dice Value is "+a);
				DiceValue = DiceValue + a;
			}

			Random r = new Random();
		    int opt = r.nextInt(3);
    
		    switch(opt)
		    {
		    
		    case 0:
		    		player1position = player1currentposition;
		    		System.out.println("The Player is not Playing"); 
		    		break;
		    case 1:
		    		player1position = player1currentposition + DiceValue;
		    		System.out.println("The Player got Ladder and got chance to roll the dice again");
		    	
		    		int x = rollDice();
		    		System.out.println("The Dice Value is "+x);
		    	
		    		int p1extraposition = player1position + x;
		    	
		    		player1position = p1extraposition;
		    	
		    		if(player1position > Winposition)
					player1position = player1currentposition;
		    		break;
		    	
		    default:
		    		player1position = player1currentposition - DiceValue;
		    		if (player1position  < 0)
		    		player1position = 0;
		    		System.out.println("The Player got Snake ");
		    	
		    }
			  		   
		player1currentposition=player1position;
	   	return(player1currentposition);
	}
	
	public static int player2position()
	{
			int DiceValue = rollDice();
						
			System.out.println("The Dice Value is "+DiceValue);
			
			if(DiceValue == 6)
			{
				int b = rollDice();
				
				System.out.println("The Dice Value is "+b);
				DiceValue = DiceValue + b;
			}
			
			Random r = new Random();
		    int opt = r.nextInt(3);
    
		    switch(opt)
		    {
		    
		    case 0:	
		    		player2position = player2currentposition;
		    		System.out.println("The Player is not Playing"); 
		    		break;
		    	
		    case 1:
		    		player2position = player2currentposition + DiceValue;
		    		System.out.println("The Player got Ladder and got chance to roll the dice again");
		    	
		    		int y = rollDice();
		    		System.out.println("The Dice Value is "+y);
		    	
		    		int p2extraposition = player2position + y;
		    		    	
		    		player2position = p2extraposition;
		    	
		    		if(player2position > Winposition)
					player2position = player2currentposition;
		    		break;
		    	
		    default:
		    		player2position = player2currentposition - DiceValue;
		    		if (player2position  < 0)
		    		player2position = 0;
		    		System.out.println("The Player got Snake ");
		    }
			  		   
		    		player2currentposition=player2position;
		    		return(player2currentposition);		
		}
}
  


