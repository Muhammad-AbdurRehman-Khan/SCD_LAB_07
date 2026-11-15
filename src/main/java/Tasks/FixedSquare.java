package Tasks;

public class FixedSquare implements Shape {
    private final int side;

    public FixedSquare(int side) {
        this.side = side;
    }

    @Override
    public int area() {
        return side * side;
    }
}
