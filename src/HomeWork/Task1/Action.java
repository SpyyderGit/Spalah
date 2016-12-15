package HomeWork.Task1;

import java.util.Scanner;

/**
 * Created by User on 15.12.2016.
 */
public class Action {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want go in bar? y/n");

        if (sc.next().equals("y")) {
            System.out.println("Gooood. let's party");
            System.out.println("Do you drink bear? y/n");
            if (sc.next().equals("y")) {
                System.out.println("cool");
            } else {
                System.out.println("rom/vodka/wisckey? y/n");
                if (sc.next().equals("y")) {
                    System.out.println("ohhh yeah....");
                } else {
                    System.out.println("Lets's go drink tea");
                }
            }
        } else {
            System.out.println("so bad.Bye");
        }

    }
}
