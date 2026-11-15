package Tasks;

/** FLAWED design: strengthens the precondition (w must equal h), violating LSP. */
public class Square extends Rectangle {
    @Override
    public void setDimensions(int w, int h) {
        if (w != h) {
            throw new IllegalArgumentException("Square requires w == h, got w=" + w + ", h=" + h);
        }
        super.setDimensions(w, h);
    }
}
