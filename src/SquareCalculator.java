public class SquareCalculator {
    private int x;  //length
    private int y;  //width

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int calcSquare(int x, int y){
        System.out.println(x*y);
        return x*y;
    }
}
