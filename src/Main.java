public class Main {
    public static void main(String[] args) {

        SquareCalculator sqcal = new SquareCalculator(10,6);
        //sqcal.setX(10);
        //sqcal.setY(5);
        System.out.println(sqcal.calcSquare());

        CircleArea a=new CircleArea(5);
        System.out.println(a.calcCircleArea());

        TriangleArea b=new TriangleArea(4,2);
        System.out.println(b.calcTriangleArea());
    }
}