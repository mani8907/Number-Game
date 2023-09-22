import java.util.Scanner;
 class Numbergame {
	public static void main(String[] args)
	{
		int a=67;   //given number
		System.out.println("Guess any number from 1 to 100");
		System.out.println("who have only three chances to guess the number");
		int score=10;
		
		if(a>=1 && a<=100)
		{
			for(int i=1;i<=3;i++)
			{
				//System.out.println("chance -"+i);
				System.out.println("enter the number:");
				Scanner s=new Scanner(System.in);
				int g=s.nextInt();   //guess number
				int x=a-g;
				
				if(x==0) {
					System.out.println("Your guess is correct");
					score=score;
					break;
				}
				else if(x<=-1) {
					System.out.println("Your guess is too high");
					System.out.println("Your had another "+(3-i)+" chance");
                    System.out.println("******************");
					score=score-2;
				}
				else if(x>=1) {
					System.out.println("Your guess is too low");
					System.out.println("Your had another "+(3-i)+" chance");
					System.out.println("******************");
					score=score-2;
				}
					
			}
			if(score==4) {
				System.out.println("sorry ,You lost the game");
			}
			else {
				System.out.println("Your score:"+score);
				
			}	
				
		}
	}
}

