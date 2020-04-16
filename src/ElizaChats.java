/*
import scanner
declare class
declare method
greet user
prompt for name
prompt user's day
prompt why
end chat
 */

import java.util.Scanner;

public class ElizaChats {
    public static void main(String[] args) {
        String name;
        String userFeeling;
        String feelingReason;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to ElizaChats! My name is Eliza, what's your name?\n");
        name = input.next();

        System.out.printf("Nice to meet you, %s. How has your day been?\n", name);
        userFeeling = input.next().toLowerCase();

        System.out.printf("Okay. Anything in particular that makes you feel %s?\n", userFeeling);
        name = input.next();

        System.out.println("Okay. Well it has been my pleasure to speak with you. Have a nice day!\n");
    }

}
