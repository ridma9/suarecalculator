public class CircleArea {

    public CircleArea(int radius){
        this.radius=radius;
    }

    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double calcCircleArea(){
        return radius * radius * 3.14;

    }
}
