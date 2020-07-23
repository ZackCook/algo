package main;

import java.util.Scanner;

public class GolferScoresTree {

    public static void main(String[] args){
        boolean run = true;

        Scanner cockandballs = new Scanner(System.in);
        int choice = 0;

        while(run){
            displayMenu();
            choice = cockandballs.nextInt();

            switch(choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
            }//end switch

        }//end while(run)
    }//end main

    private static void displayMenu(){
        System.out.println("Make a selection");
        System.out.println("1. Display list of all golfers stats (ordered by last name)");
        System.out.println("2. Display the golfers in current tree format (use displayAsTree())");
        System.out.println("3. Find and display one individual golfers stats");
        System.out.println("4. Update an individual golfers stats");
        System.out.println("5. Remove a golfer from the database");
        System.out.println("6. Add a new golfer to the database");
        System.out.println("7. Quit and update datafile");
    }
}//end class