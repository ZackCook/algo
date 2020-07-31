package main;

public class Golfer implements Comparable<Golfer>{

    private String lastName;
    private int numberOfRounds;
    private double avgScore;
    private int handicap;

    public Golfer(String l, int r, double a, int h){
        this.lastName = l;
        this.numberOfRounds = r;
        this.avgScore = a;
        this.handicap = h;
    }

    public Golfer(String l){
        this.lastName = l;
        this.numberOfRounds = -1;
        this.avgScore = -1;
        this.handicap = -1;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNumberOfRounds(int numberOfRounds) {
        this.numberOfRounds = numberOfRounds;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    public void setHandicap(int handicap) {
        this.handicap = handicap;
    }

    public int getNumberOfRounds() {
        return numberOfRounds;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public int getHandicap() {
        return handicap;
    }

    /*
        comparisons based on last name
     */
    @Override
    public int compareTo(Golfer o) {
        int result = 0;
        String oName = o.getLastName().toLowerCase();
        char oLetter = oName.charAt(0);

        String thisName = this.getLastName().toLowerCase();
        char thisLetter = thisName.charAt(0);

        if( oLetter > thisLetter){
            result = -1;
        }
        else if (oLetter < thisLetter){
            result = 1;
        }

        return result;
    }

    @Override
    public String toString() {
        return this.lastName;
    }

    public static void main(String[] args){
        Golfer g = new Golfer("a");
        Golfer g2 = new Golfer("b");

        System.out.println(g.compareTo(g2));
    }


}//end class
