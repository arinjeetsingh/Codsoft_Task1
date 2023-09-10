import java.util.*;

public class task1 {

    public static void main(String[] args) {
        NumGuess();
    }

    public static void NumGuess() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Welcome \n");
        System.out.println("Rules :");
        System.out.println("1. You have to guess number between 1 to 100.");
        System.out.println("2. For every wrong input 4 points will be deducted");
        System.out.println("3. The points will be out of 100 points.");
        System.out.println("4. You will be given only 10 attempts to correctly guess the number. \n");
        int RandomNumber = (int) (Math.random() * 100);
        int UsersNumber = 0;
        int score = 100;
        int count = 1;
        while (UsersNumber != RandomNumber) {
            System.out.println("Guess the number - ");
            UsersNumber = sc.nextInt();
            System.out.println("Attempt no : "+count);
            count++;
            if (UsersNumber > RandomNumber) {
                System.out.println("Very High!");
                score -= 4;
            } else if (UsersNumber < RandomNumber) {
                System.out.println("Very Low!");
                score -= 4;
            } else if (UsersNumber == RandomNumber) {
                System.out.println("You Won!!");
                System.out.println("Total Attempts taken : " + count);
                System.out.println("Score : " + score + " / 100.\n");
                break;
            }
            {
                if (count == 10) {
                    System.out.println("Game Over ----- You ran out of attempts. \n");
                    System.out.println("The number was : "+RandomNumber);
                    break;
                }
            }
        }
        sc.close();
        }
        
    }
