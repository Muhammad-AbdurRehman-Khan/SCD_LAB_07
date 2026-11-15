package Tasks;

public class FixedRectangle implements Shape {
    private final int width;
    private final int height;

    public FixedRectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int area() {
        return width * height;
    }
}
