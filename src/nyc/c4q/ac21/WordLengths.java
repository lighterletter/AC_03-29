package nyc.c4q.ac21;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by c4q-john on 3/29/15.
 *
 * Tasha Smith.
 */
public class WordLengths {


    public static void main(String [] args){

        ArrayList<String> stringArray = new ArrayList<String>();


        stringArray.add("Hello");
        stringArray.add("Goodbye");
        stringArray.add("Unicorns");
        stringArray.add("Puppies");
        stringArray.add("Racecar");



        ArrayList<String> words = new ArrayList<String>();
        words.add("banana");
        words.add("pineapple");
        words.add("cantaloupe");

        HashMap<String, Integer> lengths = getLengths(words);


        System.out.println(lengths.get("banana"));      // should print 6
        System.out.println(lengths.get("cantaloupe"));  // should print 10
        System.out.println(lengths.get("broccoli"));    // should print null


    }



    public static HashMap<String, Integer> getLengths(ArrayList<String> strings) {

        Integer letters;

        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        for (String word : strings){

            letters = word.length();

            hashMap.put(word, letters);

        }

        return hashMap;


    }


}
