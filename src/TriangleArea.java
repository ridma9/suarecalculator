public class TriangleArea {

    public TriangleArea(int height, int base){
        this.height=height;
        this.base=base;
    }

    private int height;
    private int base;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public double calcTriangleArea() {
        return 0.5*height*base;
    }
}
