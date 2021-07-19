package snake_ladder;

 class Player  extends dice  //(Sub Class of dice and hence Multi-Level Inheritance)
 {

	Player()               //Default Constructor
	{
		super("Player1","Player 2");    //Calling a function in Dice Class and passing names 
	}
	
	
	public   int getPlayer1pos(int pos_forward)  // This is a function to get the player position
	{
		int p1=p1pos;
		p1pos+=pos_forward;
		p1pos=check(p1pos);
		if(p1pos>100)
		{
			return p1;
		}
		return p1pos;
		
	}
	
	public   int getPlayer2pos(int pos_forward)
	{
		int p2=p2pos;
		p2pos+=pos_forward;
		p2pos=check(p2pos);
		if(p2pos>100)
		{
			return p2;
		}  
		return p2pos;
	}
	
	public  boolean Playercheck(int pos)   // A function to check is any player reached 100th position
	{
		if(pos==100)
		{
			return true;
		} 
		
		return false;
	}
	
	protected  int Snake(int p)     // A function to decrement Player_Position value if bitten by Snake
	{
		switch (p)
		{
		case 31:{
			return 14;}
			
		case 37:{
			return 17;}
			
		case 73:{
			return 53;}
			
		case 78:{
			return 39;}
			
		case 92:{
			return 35;}
			
		case 99:{
			return 7;}
		}
		return p;
	}
	
	protected  int Ladder(int p)   // A function to increment Player_Position value if a Ladder is found
	{
		switch (p)
		{
		case 5:
			return 25;
			
		case 10:
			return 29;
			
		case 22:
			return 41;
			
		case 28:
			return 55;
			
		case 44:
			return 95;
			
		case 70:
			return 89;
			
		case 79:
			return 81;
				
		}
		return p;
	}
	

	public  int check(int player_pos)    // Calling Respective Snake Or Ladder Functions on Player_position
{
		if(player_pos==31||player_pos==37||player_pos==73||player_pos==78||player_pos==92||player_pos==99)
		{
			 System.out.println("Bitten by a Snake");
			player_pos=Snake(player_pos);
		}
		 if(player_pos==5||player_pos==10||player_pos==22||player_pos==28||player_pos==44||player_pos==70||player_pos==79)
		{
			 System.out.println("Found a Ladder");
			player_pos=Ladder(player_pos);
		}
		return player_pos;
	}
	

}
