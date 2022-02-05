package lists;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public void processList(List<String> list) {

        // Find the Yak
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("Yak"))
                System.out.println("Found a Yak at " + i);
        }

        // Remove "pig" from the list
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("pig")) {
                list.remove(i);
                i--;
            }
        }

        // Print out all the animals except for those contains o's
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("o"))
                System.out.println("I'm scared of o's!");
            else
                System.out.println(list.get(i));
        }

        // If the animal starts with an uppercase letter swap its position with
        // the previous animal, if there is one
        for (int i = 1; i < list.size(); i++) {
            String animal = list.get(i);
            if (Character.isUpperCase(animal.charAt(0))) {
                list.set(i, list.get(i-1));
                list.set(i-1, animal);
                i++;
            }
        }
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("fish");
        list.add("duck");
        list.add("Cow");
        list.add("goat");
        list.add("pig");
        list.add("Yak");

        ListExample example = new ListExample();

        example.processList(list);

        System.out.println(list);
    }
}
