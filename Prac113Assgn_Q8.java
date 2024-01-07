import java.util.*;
public class Prac113Assgn_Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = (int)(Math.random()*(10-1+1))+1;
		
		
		
		while(true) {
			System.out.println("Enter a number between 1-10");
			int n2 = sc.nextInt();
			System.out.println("Computer guess: "+n1);
			if(n2>n1) {
				System.out.println("Too High, try again");
			}
			else if(n2<n1) {
				System.out.println("Too low, try again");
			}
			else {
				System.out.println("Correct guess");
				break;
			}
		}
	
	}

}
