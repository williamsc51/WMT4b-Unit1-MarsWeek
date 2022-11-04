import java.util.Scanner;

public class GuessingGame {

    public GuessingGame(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Hi, welcome to the game");
        System.out.println("Please enter your name:");
        String name = scan.nextLine();
        System.out.println(name);


    }

}
