package ca.ankur.countingrooms;


/**
 * Created by Ankur Sood on 6/28/2017.
 */

public class RoomModel {

    private static final int WIDTH = 4;
    private static final int HEIGHT = 5;

    private int steps = 0;

    private int xPosition = 0;
    private int yPosition = 0;

    public boolean canMoveNorth() {
        if (yPosition <= 0)
        {return false;}
        else {return true;}
    }

    public boolean canMoveSouth() {
        if (yPosition >= 5)
        {return false;}
        else {return true;}
    }

    public boolean canMoveWest() {
        if (xPosition <= 0)
        {return false;}
        else {return true;}
    }

    public boolean canMoveEast() {
        if (xPosition >= 5)
        {return false;}
        else {return true;}
    }

    public void moveNorth() {
        if (canMoveNorth()) {
            yPosition--;
            steps++;
        }
    }

    public void moveSouth() {
        if (canMoveSouth()) {
            yPosition++;
            steps++;
        }
    }

    public void moveWest() {
        if (canMoveWest()) {
            xPosition--;
            steps++;
        }
    }

    public void moveEast() {
        if (canMoveEast()){
            xPosition++;
            steps++;
       }
    }

    public int getSteps(){
        return steps;
    }
}
