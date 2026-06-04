import java.util.Random;
import java.util.Scanner;

//this is a dice roller project in java
public class dice {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //rolling dice
        Random rand = new Random();
        int noofdice;
        int total = 0;
        
        System.out.println("---------------------");
        System.out.println("DICE ROLLER PROJECT");    
        System.out.println("---------------------");
        System.out.print("enter no of dice to be rolled:");
        noofdice = scan.nextInt();
        int roll;
        
        if (noofdice > 0) {
            for (int i = 1; i <= noofdice; i++) {
                roll = rand.nextInt(1, 7);
                printdie(roll);
                System.out.println("you rolled :" + roll);
                total += roll;
            }
            System.out.println("total of dices are :" + total);
        } else {
            System.out.println("dice must greater than zero");
        }
        
        // This is the new code added for your branch:
        scan.close(); 
    }

    static void printdie(int roll) {
        String dice1 = """
             -------
            |       |      
            |   ●   |
            |       |
             -------
            """;
        String dice2 = """
             -------
            | ●     |      
            |       |
            |     ● |
             -------
            """;
        String dice3 = """
             -------
            | ●     |      
            |   ●   |
            |     ● |
             -------
            """;
        String dice4 = """
             -------
            | ●   ● |      
            |       |
            | ●   ● |
             -------
            """; 
        String dice5 = """
             -------
            | ●   ●|      
            |   ●   |
            | ●   ● |
             -------
            """; 
        String dice6 = """
             -------
            | ● ● ● |      
            |       |
            | ● ● ● |
             -------
            """;

        if (roll == 1) {
            System.out.println(dice1);
        } else if (roll == 2) {
            System.out.println(dice2);
        } else if (roll == 3) {
            System.out.println(dice3);
        } else if (roll == 4) {
            System.out.println(dice4);
        } else if (roll == 5) {
            System.out.println(dice5);
        } else if (roll == 6) {
            System.out.println(dice6);
        }
    }
}