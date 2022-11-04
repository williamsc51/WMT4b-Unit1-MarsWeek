import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public GuessingGame(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Hi, welcome to the game");
        System.out.println("Please enter your name:");
        String name = scan.nextLine();

        Random rand = new Random();
        int randomNumber = rand.nextInt(1, 100);
        System.out.println("Enter an integer between 1 - 100");
        int userNumber = 0;
        int numberOfGuesses = 0;


        while(randomNumber != userNumber){
            try {
                userNumber = scan.nextInt();
            }catch (InputMismatchException e){
                String bad_input = scan.next();
                System.out.println( bad_input + " is not a valid integer\n" + "You did not enter an integer please try again:");
                continue;
            }

            if (userNumber < 1 || userNumber > 100) {
                System.out.println(userNumber + " is not a valid number, try again");
                continue;
            }

            numberOfGuesses++;

            if (userNumber < randomNumber) {
                System.out.println("Too low");
            } else if (userNumber > randomNumber) {
                System.out.println("Too high");
            }
            else {
                System.out.println("Well done " + name);
                System.out.println("You found my number in " + numberOfGuesses + " tries!");
            }
        }

    }
    public static void main(String args[]){
        new GuessingGame();
    }

}
