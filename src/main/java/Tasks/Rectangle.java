package Tasks;

/** Given base class. Contract: any w and h may be set independently. */
public class Rectangle {
    protected int width;
    protected int height;

    public void setDimensions(int w, int h) {
        this.width = w;
        this.height = h;
    }

    public int getWidth() {
        return width;
    }
    
    public int getHeight() {
        return height;
    }

    public int area() {
        return width * height;
    }
}
