import java.util.Scanner;

import static java.lang.Character.toLowerCase;

public class MarsExpedition {
    Scanner input = new Scanner(System.in);
    public MarsExpedition() throws InterruptedException{
        System.out.println("Sit tight while we boot the system");
        System.out.println("loading...........................25%");
        Thread.sleep(1000);
        System.out.println("loading...........................75%");
        Thread.sleep(2000);
        System.out.println("Ready");

        System.out.println("Please enter you name to get started: ");
        String name = input.nextLine();
        System.out.println("Hi " + name + "! Welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N");
        String begin = input.nextLine();

        if (begin.equalsIgnoreCase("Y")){
            System.out.println("I knew you would say that. You are team leader for a reason.");
        } else {
            System.out.println("Too bad you are team leader. You have to go.");
        }

        System.out.println("How many people do you want on your expedition team? (Input an int number)");
        int teamNumber = input.nextInt();
        input.nextLine();

        if (teamNumber > 2) {
            System.out.println("That's way to many people. We can only send 2 more members");
            teamNumber = 2;
        } else if (teamNumber < 2) {
            System.out.println("That's not enough people. We need you and 2 more members.");
            teamNumber = 2;
        } else if (teamNumber == 2){
            System.out.println("That's a perfect sized team. Good job.");
        }

        System.out.println("You are allowed to bring one snack with you. What do you bring?");
        String snack = input.nextLine();
        System.out.println("Nice choice, you will be bringing a " + snack + " with you");

        String vehicleChoice = vehicleSelection();

        System.out.println("Your expedition team is now ready" +
                "\nLed by " + name + " with " + teamNumber + " teammates." +
                "\nTo explore the surface of Mars using " + vehicleChoice + "." +
                "\nExploration team heads out in");
        countDown(5);
        System.out.println("GO GO GO!");

    }

    public String vehicleSelection(){
        System.out.println("You have the choice of 3 vehicles" +
                "\nA: A Mars Rover" +
                "\nB: A Chevy Silverado" +
                "\nC: A Honda Civic");
        String choice = input.nextLine().toUpperCase();

        switch(choice){
            case "A":
                choice = "a Mars Rover";
                break;
            case "B":
                choice = "a Chevy Silverado";
                break;
            case "C":
                choice = "a Honda Civic";
                break;
            default:
                choice = "Your feet";
                break;
        }

        return choice;
    }

    public void countDown(int num) throws InterruptedException{
        int x = 0;

        do {
            System.out.println(num + "....");
            Thread.sleep(1000);
            num--;
        }while (num > x);
    }

    public static void main(String args[]) throws InterruptedException {
        new MarsExpedition();
    }
}
