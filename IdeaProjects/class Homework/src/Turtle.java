public class Turtle {

    private TurtleDirection currentDirection = TurtleDirection.EAST;
    private boolean penIsUp;
    private Position position = new Position(0,0);

    public boolean penIsUp() {
         return this.penIsUp = true;
    }

    public boolean putPenUp(){
        return penIsUp;
    }

    public void putPenDown(){
        this.penIsUp = false;
    }

    private void setPenIsUpStateTo(boolean state){
        this.penIsUp = state;
    }

    public boolean penIsDown() {
         return penIsUp;
    }

    public void turnRight() {
        if(currentDirection == TurtleDirection.WEST) currentDirection = TurtleDirection.NORTH;
        if(currentDirection == TurtleDirection.SOUTH) currentDirection = TurtleDirection.WEST;
        if(currentDirection == TurtleDirection.EAST) currentDirection = TurtleDirection.SOUTH;

    }

    public void turnLeft(){
        if(currentDirection == TurtleDirection.WEST) currentDirection = TurtleDirection.SOUTH;
        if(currentDirection == TurtleDirection.NORTH) currentDirection = TurtleDirection.WEST;
        if(currentDirection == TurtleDirection.EAST) currentDirection = TurtleDirection.NORTH;
    }

    public void moveForward(int numberOfSteps){
        new Position( 0, numberOfSteps - 1);
        if(currentDirection == TurtleDirection.SOUTH | currentDirection == TurtleDirection.NORTH) new Position(numberOfSteps - 1, 0) ;
    }


    public Position getCurrentPosition() {
        return position;
    }
}
