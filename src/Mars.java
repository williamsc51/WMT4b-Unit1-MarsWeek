public class Mars {
    public static void main(String[] args) {
        String colonyName = "Courtney";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = landingCheck(10);

        meals = meals - (shipPopulation * 0.75);
        System.out.println(meals);
        meals = meals + (meals * .5);
        shipPopulation = shipPopulation + 5;

        String landingLocation = "The Hill";

        if (landingLocation.equalsIgnoreCase("The Plain")){
            System.out.println("Bbzzz Landing on the Plain");
        }
        else{
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }
    }

    public static boolean landingCheck(int minutesLeft) {
        for (int minute = 0; minute <= minutesLeft; minute++){
            if (((minute % 2) == 0) && ((minute % 3) == 0)){
                System.out.println("Keep Center");
            } else if (minute % 2 == 0) {
                System.out.println("Right");
            } else if (minute % 3 == 0){
                System.out.println("Left");
            }else {
                System.out.println("Calculating");
            }

            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Landed");
        return false;
    }
}