package nyc.c4q.ac21;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by c4q-john on 3/29/15.
 */
public class PlanetMoons {
    public static void main(String [] args){

        Scanner scanner=new Scanner(System.in);
        String planet;


        System.out.println("Name a planet");
        planet=scanner.next();

        if (!isPlanet(planet)){
            //Will activate branch is user input is not planet.
            System.out.println("Input not a planet!");

        } else {

            System.out.println(getNumberOfMoons().get(planet));

            System.out.println(getNumberOfMoons());
        }


    }
    public static HashMap<String, Integer> getNumberOfMoons() {

        HashMap<String, Integer> numberOfMoons = new HashMap<String,Integer>();

        numberOfMoons.put("Mercury", 0);
        numberOfMoons.put("Venus", 0);
        numberOfMoons.put("Earth", 1);
        numberOfMoons.put("Mars", 2);
        numberOfMoons.put("Jupiter", 67);
        numberOfMoons.put("Saturn", 62);
        numberOfMoons.put("Uranus", 27);
        numberOfMoons.put("Neptune", 14);

        return numberOfMoons;
    }
    public static boolean isPlanet(String name) {

        return getNumberOfMoons().get(name) != null;

    }
}
