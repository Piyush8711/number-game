import java.util.*;
public class randomgame {
   


	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int secretNumber = (int) (Math.random()*100+1);
		
		System.out.println("Press S to start");
		
		char ch = sc.next().charAt(0);
		int guess = -1;
		if (ch =='s' || ch == 'S'){
		   while (guess!=secretNumber){
		       System.out.println("Guess a number");
		       guess = sc.nextInt();
		       if (guess > secretNumber){
		           System.out.println("Guessed number is Greater");
		       }else if (guess <secretNumber){
		           System.out.println("Guessed number is Smaller");
		       }else {
		           System.out.println("Guess number is correct");
		          
		       
		       }
		   }
		}else {
		    System.out.println("Game Ends");
		}
	}
}



