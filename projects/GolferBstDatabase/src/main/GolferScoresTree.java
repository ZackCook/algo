package main;

import java.io.*;
import java.util.Scanner;

public class GolferScoresTree {

    public static void main(String[] args){
        boolean run = true;

        Scanner cockandballs = new Scanner(System.in);
        int choice = 0;

        TreeBag<Golfer> database = new TreeBag<>();


        //fill database from datafile
        String datafilepath = "C:\\Users\\zackm\\Desktop\\6.006\\otherCode\\algorithms\\projects\\GolferBstDatabase" +
                "\\src\\main\\golfers.txt";
        File datafile = new File(datafilepath);
        FileReader reader = null;
        BufferedReader bufferedReader = null;

        try {
            reader = new FileReader(datafile);
            bufferedReader = new BufferedReader(reader);

            String dataline = bufferedReader.readLine();

            while(dataline != null){
                String[] dataArr = dataline.split(" ");

                //parsed golfer data
                String name = dataArr[0];
                int rounds = Integer.parseInt(dataArr[1]);
                int handicap = Integer.parseInt(dataArr[2]);
                double avgScore = Double.parseDouble(dataArr[3]);

                Golfer g = new Golfer(name,rounds,avgScore,handicap);
                database.add(g);
                dataline = bufferedReader.readLine();
            }

        }catch(IOException e){
            e.printStackTrace();
        }
         System.out.println("Database loaded from datafile");



        while(run){
            displayMenu();
            choice = cockandballs.nextInt();

            switch(choice){
                case 1://display list of all golfers.txt ordered by last name
                    //todo
                    break;

                case 2://display the golfers.txt in tree format
                    database.displayAsTree();
                    break;

                case 3://find and display individual stats
                    //NOT WORKING
                    //everything freezes as soon as name is entered
                    //todo
                    System.out.println("Input last name of golfer to be retrieved");
                    String name = cockandballs.next();
                    Golfer retrieval = database.retrieve(new Golfer(name));
                    System.out.println(retrieval.toString());

                    break;

                case 4://update individual stats
                    //todo
                    break;

                case 5://remove a golfer
                    //NOT WORKING
                    //golfer that is entered is not actually removed
                    //todo
                    System.out.println("Input last name of golfer to be removed");
                    String removeName = cockandballs.next();
                    database.remove(new Golfer(removeName));
                    break;

                case 6://add new golfer
                    System.out.println("Input last name of golfer to be added.");
                    String newName = cockandballs.next();
                    database.add(new Golfer(newName));
                    break;

                case 7://quit and update datafile
                    //todo
                    run = false;
                    break;
            }//end switch

        }//end while(run)
    }//end main

    private static void displayMenu(){
        System.out.println("Make a selection");
        System.out.println("1. Display list of all golfers.txt stats (ordered by last name)");
        System.out.println("2. Display the golfers.txt in current tree format (use displayAsTree())");
        System.out.println("3. Find and display one individual golfers.txt stats");
        System.out.println("4. Update an individual golfers.txt stats");
        System.out.println("5. Remove a golfer from the database");
        System.out.println("6. Add a new golfer to the database");
        System.out.println("7. Quit and update datafile");
    }
}//end class