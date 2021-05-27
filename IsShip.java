
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class IdShip
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();//reading testcases
		while(T!=0) {
		    char ch = sc.next().charAt(0);
		    switch(ch) {
		        case 'b' : System.out.println("BattleShip");
		                   break;
		        case 'B' : System.out.println("BattleShip");
		                   break;
		        case 'c' : System.out.println("Cruiser");
		                   break;
		        case 'C' : System.out.println("Cruiser");
		                   break;
		        case 'd' : System.out.println("Destroyer");
		                   break;
		        case 'D' : System.out.println("Destroyer");
		                   break;
		        case 'f' : System.out.println("Frigate");
		                   break;
		        case 'F' : System.out.println("Frigate");
		                   break;
		    }  
		    T--;
		}
		
	}
}
