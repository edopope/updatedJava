package TurtleGraphics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurtleTestTest {
    @Test
    public void turtleExistTest() {
        Turtle wiseOne = new Turtle();
        assertNotNull(wiseOne);
    }

    @Test
    public void turtleCanMovePen() {
        Turtle wiseOne = new Turtle();
        wiseOne.penUp();
        assertTrue(wiseOne.isPenUp());
    }

    @Test
    public void turtleCanMovePenDown() {
        Turtle wiseOne = new Turtle();
        wiseOne.penDown();
        assertFalse(wiseOne.isPenUp());
    }

    @Test
    public void turtleCanTurnRightWhileFacingEast() {
        Turtle wiseOne = new Turtle();
        assertEquals(Direction.EAST, wiseOne.getCurrentDirection());
        wiseOne.turnRight();
        assertEquals(Direction.SOUTH, wiseOne.getCurrentDirection());

    }

    @Test
    public void turtleCanTurnRightWhileFacingSouth() {
        Turtle wiseOne = new Turtle();
        wiseOne.turnRight();
        assertEquals(Direction.SOUTH, wiseOne.getCurrentDirection());
        wiseOne.turnRight();
        assertEquals(Direction.WEST, wiseOne.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRightWhileFacingWest() {
        Turtle wiseOne = new Turtle();
        wiseOne.turnRight();
        assertEquals(Direction.SOUTH, wiseOne.getCurrentDirection());
        wiseOne.turnRight();
        assertEquals(Direction.WEST, wiseOne.getCurrentDirection());
        wiseOne.turnRight();
        assertEquals(Direction.NORTH, wiseOne.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRightWhileFacingNorth() {
        Turtle wiseOne = new Turtle();
        wiseOne.turnRight();
        assertEquals(Direction.SOUTH, wiseOne.getCurrentDirection());
        wiseOne.turnRight();
        assertEquals(Direction.WEST, wiseOne.getCurrentDirection());
        wiseOne.turnRight();
        assertEquals(Direction.NORTH, wiseOne.getCurrentDirection());
        wiseOne.turnRight();
        assertEquals(Direction.EAST, wiseOne.getCurrentDirection());
    }

    @Test
    public void turtleTurnLeftWhileFacingEast() {
        Turtle wiseOne = new Turtle();
        assertEquals(Direction.EAST, wiseOne.getCurrentDirection());
        wiseOne.turnLeft();
        assertEquals(Direction.NORTH, wiseOne.getCurrentDirection());
    }

    @Test
    public void turtleTurnLeftWhileFacingNorth() {
        Turtle wiseOne = new Turtle();
        assertEquals(Direction.EAST, wiseOne.getCurrentDirection());
        wiseOne.turnLeft();
        assertEquals(Direction.NORTH, wiseOne.getCurrentDirection());
        wiseOne.turnLeft();
        assertEquals(Direction.WEST, wiseOne.getCurrentDirection());
    }

    @Test
    public void turtleTurnLeftWhileFacingWest() {
        Turtle wiseOne = new Turtle();
        assertEquals(Direction.EAST, wiseOne.getCurrentDirection());
        wiseOne.turnLeft();
        assertEquals(Direction.NORTH, wiseOne.getCurrentDirection());
        wiseOne.turnLeft();
        assertEquals(Direction.WEST, wiseOne.getCurrentDirection());
        wiseOne.turnLeft();
        assertEquals(Direction.SOUTH, wiseOne.getCurrentDirection());
    }

    @Test
    public void turtleTurnLeftWhileFacingSouth() {
        Turtle wiseOne = new Turtle();
        assertEquals(Direction.EAST, wiseOne.getCurrentDirection());
        wiseOne.turnLeft();
        assertEquals(Direction.NORTH, wiseOne.getCurrentDirection());
        wiseOne.turnLeft();
        assertEquals(Direction.WEST, wiseOne.getCurrentDirection());
        wiseOne.turnLeft();
        assertEquals(Direction.SOUTH, wiseOne.getCurrentDirection());
        wiseOne.turnLeft();
        assertEquals(Direction.EAST, wiseOne.getCurrentDirection());
    }
    @Test
    public void turtleCanMoveForwardWhileFacingEast(){
        Turtle wiseOne = new Turtle();
        assertEquals(new Position(0,0), wiseOne.getCurrentDirection());
        wiseOne.move(5);
        assertEquals(new Position(0, 5), wiseOne.getCurrentPosition);
    }

}
