package example;

import java.util.Scanner;

public class Splitter {
    public static void main(String[] args) {
        System.out.println("Enter a sentence specified by spaces only: ");
        Scanner input = new Scanner(System.in);
        String[] line = input.nextLine().trim().split("\\s+");
        for (String word : line)
            System.out.println(word);
        input.close();
    }
}
