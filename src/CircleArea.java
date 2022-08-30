public class CircleArea {

    public CircleArea(int r){
        this.x=r;
    }

    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double calcCircleArea(){
        return x * x * 3.14;

    }
}
