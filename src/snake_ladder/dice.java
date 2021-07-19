package snake_ladder;

import Student_details.Student;

 class dice extends Student   //Dice is a subclass of Student in package snake_ladder
 								//(Single Inheritance)
 {
	 
	 String  Player2name,Player1name;
	   int p1pos,p2pos;
	   
	 dice(String Player1name, String Player2name)     //Constructor Overloading having parameters
	 {
		 this.Player1name=Player1name;
		 this.Player2name=Player2name;
		 
	 }
	 
	 dice()           //Default Constructor
	 {
		 p1pos=0;
		 p2pos=0;
	 }
	

	int diceval()            // Method which gives the random dice value
	{
	int random=(int)Math.round(Math.random()*5+1);
	return random;
	}
	
}
