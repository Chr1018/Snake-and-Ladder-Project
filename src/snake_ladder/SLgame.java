package snake_ladder;

import java.util.Scanner;
import Student_details.Student;
import Student_details.checkstring;


 class SLgame extends Player implements checkstring     // SubClass of Player and Implements the interface checkstring
 {
	 public static int tempval=0;
	 static boolean flag=false;
	 
	public static void main(String [] args)
	{
		
		Scanner sc = new Scanner(System.in);         //Scanner class for input output handling
		
		dice obj =new dice("Player 1","Player 2");   //Creating Object of Class dice
		
		Student obj1=new Student();					//Creating Object of Class Student
		
		Player obj2=new Player();					//Creating Object of Class Player
		
		Student obj4=new Student(obj1);             //Creating Object as obj4 of type Student and showing objects can be passed as parameters
		
		checkstring obj3=new SLgame();             // Interface method access using object hence obj3 is an object
		
		System.out.println("Details:");
		System.out.println("Name: "+obj1.name);
		System.out.println("USN: "+obj1.USN);
		System.out.println("Department: "+obj1.Department);
		System.out.println("Semester: "+obj4.sem);
		System.out.println("Section: "+obj4.section);
		System.out.println("Project Title "+obj4.title);
		System.out.println("College: "+obj4.cname);
		System.out.println();

	System.out.println("Snake And Ladder Game");
	
	
	do {
	System.out.println("Player 1 Name: ");    
	obj.Player1name=sc.nextLine();           // Checking if the given name is a string and does not contain invalid input
	flag=obj3.isstring(obj.Player1name);
	}while(flag);
	
	
	
do {	
	 System.out.println("Player 2 Name: ");
	 obj.Player2name=sc.nextLine();
	 flag=obj3.isstring(obj.Player2name);
}while(flag);

	sc.close();
	
	System.out.println("Rules and Information about  the game are as follows: ");
	System.out.println("The first player to reach 100th position wins");
	System.out.println("The Player 1 gets First chance to roll the dice and so on it alternates");
	System.out.println("Snakes Present at positions : 31,37,73,78,92,99 ");
	System.out.println("Ladders Present at positions: 5,10,22,28,44,70,79 ");
	System.out.println("If any Player is nearing 100th position the person has to get the exact dice value that ends up at 100");
	System.out.println("Otherwise the position is retained as it is. Ex: player is at 97 and gets 4 his position will remain 97.");
	System.out.println();
	
	
	try {                                        
	Thread.sleep(5000);                              //Using Thread concept and delaying by 5 seconds
	}         
	catch (InterruptedException e) {                 //Also using try catch and showing exception handling
        e.printStackTrace();
    }
	
	System.out.println("Starting the game");
	System.out.println("Snake_cell_value     Brings_down_to		Ladder_cell_value     Leads_up_to");
	System.out.println("31				14			5			25		");
	System.out.println("37				17			10			29      ");
	System.out.println("73				53			22			41		");
	System.out.println("78				39			28			55		");
	System.out.println("92				35			44			95		");
	System.out.println("99				7			70			89		");
	System.out.println("-				-			79			81		");
	
	System.out.println(obj.Player1name+"'s Position  "+obj.p1pos);
	System.out.println(obj.Player2name+"'s Position  "+obj.p2pos);
    System.out.println();
	
	while(true)
	{
		
		System.out.println("Rolling Dice ");
		
		try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		tempval=obj.diceval();
		System.out.println(obj.Player1name+" Rolled a : "+tempval);
		obj2.p1pos=obj2.getPlayer1pos(tempval);
		System.out.println(obj.Player1name+"'s Position : "+obj2.p1pos);
		System.out.println();
		
		try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		if(obj2.Playercheck(obj2.p1pos))
		{
			System.out.println(obj.Player1name+"'s Position : "+obj2.getPlayer1pos(tempval));
			System.out.println(obj.Player1name+" Wins");
			break;
		}
		
		System.out.println("Rolling Dice ");
		
		try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		tempval=obj.diceval();
		System.out.println(obj.Player2name+" Rolled a : "+tempval);
		obj2.p2pos=obj2.getPlayer2pos(tempval);
		System.out.println(obj.Player2name+"'s Position : "+obj2.p2pos);
		System.out.println();
		try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		if(obj2.Playercheck(obj2.p2pos))
		{
			System.out.println(obj.Player2name+"'s Position : "+obj2.getPlayer2pos(tempval));
			System.out.println(obj.Player2name+" Wins");
			break;
		}
	}
	}
	

	@Override                                         // Overriding  isstring function which checks the input
	public boolean isstring(String s)
	{
		  for(int i=0;i<s.length();i++)
	    {
			  
	    	char tmp=s.charAt(i);
	    	if(Character.isLetter(tmp)||Character.isWhitespace(tmp)) 
	    	{
	    		continue;
	    	}
	    	else {
	    		System.out.println("Invalid Name. Please try again");
	    		return true;
	    	}
	    }
		return false;
	}
	
 }
 
 







