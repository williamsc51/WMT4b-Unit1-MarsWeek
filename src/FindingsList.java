import java.util.*;

public class FindingsList {

    public FindingsList() throws InterruptedException {

        Thread.sleep(500);
        System.out.println("Welcome back");

        ArrayList<String> rocks = new ArrayList<>();
        System.out.println("Rock data downloaded.");

        rocks.add("rock");
        rocks.add("weird rock");
        rocks.add("smooth rock");
        rocks.add("not rock");

        System.out.println(rocks);

        System.out.println("Wait a second that last on is not a rock we need to delete that one from the list");

        rocks.remove("not rock");

        System.out.println(rocks);

        Thread.sleep(1000);

        HashMap<String, String> fossilInfo = new HashMap<String, String>();

        fossilInfo.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossilInfo.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossilInfo.put("Tooth Fossil", "The tooth from an unknown fossil");

        System.out.println("Fossil data downloaded");

        System.out.println("Which of the fossils would you like to learn more about? (Bird Fossil, Fish Fossil, or Tooth Fossil)?");

        Scanner input = new Scanner(System.in);

        String fossilChoice = input.nextLine();

        if (fossilChoice.equalsIgnoreCase("Bird Fossil")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilInfo.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Fish Fossil")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilInfo.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Tooth Fossil")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilInfo.get(fossilChoice));
        }

        Thread.sleep(700);

        HashSet<String> roadKit = new HashSet<>();

        roadKit.add("Phone");
        roadKit.add("Car Keys");
        roadKit.add("Wallet");

        roadKit.remove("Wallet");

        Iterator itr = roadKit.iterator();

        System.out.println("Needed items before I leave my house");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void main(String args[]) throws InterruptedException{
        new FindingsList();
    }
}
