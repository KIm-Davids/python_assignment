public class Position {
    private int column;
    private int row;

    public Position(int row, int column){
        this.column = column;
        this.row = row;
    }

    public boolean equals(Object position){
        Position anotherPosition = (Position) position;
        if(this == anotherPosition) return true;
        else return false;
    }

    public void columnAndRow(int numberOfSteps){
        this.row += numberOfSteps;
        if(this.row == 0) this.column += numberOfSteps;
    }

    public String toString(){
        return "Current position is " + column + " " + row;
    }

}
