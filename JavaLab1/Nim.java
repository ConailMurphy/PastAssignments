import java.util.Random;
import java.util.Scanner;

class Nim {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random() ;
        int matchsticks = rand.nextInt(91);
        matchsticks = matchsticks + 10;
        int order =rand.nextInt(2);

        System.out.println("This game of Nim has " + matchsticks + " matchsticks.");
        System.out.println("You must pickup a number of matchsticks between 1 and half the total number of matchsticks.");

        if (order == 0){
            System.out.println("The player will go first");
        } else {
            System.out.println("The computer will go first");
        }

        while (matchsticks > 1) {
            if (order == 0) {
                System.out.println("How many matchsticks will you pickup:");
                int playerpickup = sc.nextInt();
                if (playerpickup > 0 && playerpickup <= matchsticks/2) {
                    System.out.println("You have picked up " + playerpickup + " matchsticks.");
                    matchsticks = matchsticks - playerpickup;
                    System.out.println ("There are " + matchsticks + " matchsticks left.");
                    System.out.println("");
                    order = 1;
                } else {
                    System.out.println("Invalid input. Please choose a new number:");
                    System.out.println("");
                }
            } else {
                int computerpickup = rand.nextInt(matchsticks/2) + 1;
                System.out.println("The computer has chosen to pick up " + computerpickup + " matchsticks.");
                matchsticks = matchsticks - computerpickup;
                System.out.println("There are " + matchsticks + " matchsticks left.");
                System.out.println("");
                order = 0;
            }
        }

        if (order == 0) {
            System.out.println("Congratulations, you win!");
        } else {
            System.out.println("Hard luck, the computer won.");
        }
    }
}