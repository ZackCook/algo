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
        return 0;
    }

    @Override
    public String toString() {
        return "Golfer{" +
                "lastName='" + lastName + '\'' +
                ", numberOfRounds=" + numberOfRounds +
                ", avgScore=" + avgScore +
                ", handicap=" + handicap +
                '}';
    }


}//end class
