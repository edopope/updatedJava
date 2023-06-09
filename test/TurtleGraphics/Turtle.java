package TurtleGraphics;

import org.junit.jupiter.api.Test;

import static TurtleGraphics.Direction.*;

public class Turtle {
    public Position getCurrentPosition;
    private Pen pen =  pen = new Pen();
    private Direction currentDirection = EAST;

    public Turtle() {
        pen.penUp();
currentDirection = EAST;
getCurrentPosition = new Position(0,0);
    }


    public void penUp() {
        pen.penUp();
    }

    public boolean isPenUp() {
        return pen.isPenUp();
    }

    public void penDown() {
        pen.penDown();
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        switch(currentDirection){
            case SOUTH -> face(WEST);
            case EAST -> face(SOUTH);
            case WEST -> face(NORTH);
            case NORTH -> face(EAST);
        }
 }

    private void face(Direction direction){
        currentDirection = direction;
    }

    public void turnLeft() {
        switch (currentDirection){
            case EAST -> face(NORTH);
            case NORTH -> face(WEST);
            case WEST -> face(SOUTH);
            case SOUTH -> face(EAST);
        }
    }

    public void move(int numberOfSteps) {
    }
    public Position getGetCurrentPosition(){
        return getCurrentPosition;
    }
}
