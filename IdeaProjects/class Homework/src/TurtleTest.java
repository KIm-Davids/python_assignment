import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TurtleTest {
    Turtle turtle = new Turtle();

    @Test
    public void testThatThePenIsUp(){

        assertTrue(turtle.penIsUp());
    }

    @Test
    public void testThatThePenIsDown(){
        assertFalse(turtle.penIsDown());
    }

    @BeforeEach
    public void testTOCheckCurrentTurtleDirection(){
        assertEquals(TurtleDirection.EAST,turtle.getCurrentPosition());
    }

    @Test
    public void testThatTurtleCanFaceSouthWhileFacingEast() {
        turtle.turnRight();
        assertSame(TurtleDirection.SOUTH, turtle.getCurrentPosition());
    }

    @Test
    public void testThatTurtleCanTurnWestWhileFacingNouth(){
        turtle.turnRight();
        assertSame(TurtleDirection.SOUTH,turtle.getCurrentPosition());
        turtle.turnRight();
        assertSame(TurtleDirection.WEST, turtle.getCurrentPosition());
    }

    @Test
    public void testThatTurtleCanTurnNorthWhileFacingWest(){
        turtle.turnRight();
        assertSame(TurtleDirection.SOUTH,turtle.getCurrentPosition());
        turtle.turnRight();
        assertSame(TurtleDirection.WEST, turtle.getCurrentPosition());
        turtle.turnRight();
        assertSame(TurtleDirection.NORTH, turtle.getCurrentPosition());

    }

    @Test
    public void testThatTurtleCanTurnNorthWhileFacingEast(){
        turtle.turnLeft();
        assertSame(TurtleDirection.NORTH, turtle.getCurrentPosition());
    }


    @Test
    public void testThatTurtleCanTurnWestWhileFacingNorth(){
        turtle.turnLeft();
        assertSame(TurtleDirection.NORTH, turtle.getCurrentPosition());
        turtle.turnLeft();
        assertSame(TurtleDirection.WEST, turtle.getCurrentPosition());
    }

    @Test
    public void testThatTurtleCanTurnSouthWhileFacingWest(){
        turtle.turnLeft();
        assertSame(TurtleDirection.NORTH, turtle.getCurrentPosition());
        turtle.turnLeft();
        assertSame(TurtleDirection.WEST, turtle.getCurrentPosition());
        turtle.turnLeft();
        assertSame(TurtleDirection.SOUTH, turtle.getCurrentPosition());
    }

    @Test
    public void testThatTurtleCanMoveFiveSteps(){
        turtle.moveForward(5);
        assertSame(new Position(0,5), turtle.getCurrentPosition());
    }

//    @Test
//    public void testThatTurtleCanMoveForwardByTakingSteps(){
//        turtle.moveForward(5);
//        assertEquals(new Position(0,5), turtle.getCurrentPosition());
//    }
//


}
