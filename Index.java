import java.util.Scanner;
import java.util.Random;


public class Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Game Rules");
        System.out.println("Rock stands for 1");
        System.out.println("Paper stands for 2");
        System.out.println("Scissor stands for 3");

        System.out.println("Enter no of rounds");
        int NoOfRounds = sc.nextInt();

        int i = 0;
        int myScore = 0;
        int computerScore = 0;
        while(i<NoOfRounds)
        {
            System.out.println("Enter your choice for the game: ");
            int myChoice = sc.nextInt();

            System.out.println("Computer's choice of the game is: ");
            int rand = random.nextInt(1,4);

            if(myChoice==1 && rand==1)
            {
                System.out.println("Ohh Swap! Game tied");
            }
            else if(myChoice==1 && rand==2)
            {
                System.out.println("Computer Wins");
                computerScore++;
            }
            else if(myChoice==1 && rand==3)
            {
                System.out.println("Computer Wins");
                computerScore++;
            }
            else if(myChoice==2 && rand==1)
            {      
                System.out.println("You Win");
                myScore++;
            }
            else if(myChoice==2 && rand==2)
            {
                System.out.println("Ohh Swap! Game tied");
                computerScore++;
            }
            else if(myChoice==2 && rand==3)
            {
                System.out.println("Computer Wins");
                computerScore++;
            }
            else if(myChoice==3 && rand==1)
            {
                System.out.println("Computer Wins");
                computerScore++;
            }
            else if(myChoice==3 && rand==2)
            {
                System.out.println("Computer Wins");
                computerScore++;
            }
            else if(myChoice==3 && rand==3)
            {
                System.out.println("Ohh Swap! Game tied");
                computerScore++;
            }
            i++;
        }
    }
}
