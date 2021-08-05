package AccesModifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle(){

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(2, "Blue");
        Circle circle2 = new Circle();
        System.out.println(circle1.getRadius());
        System.out.println(circle2.getRadius());
    }

    static class TestCircle{
        public static void main(String[] args) {
            Circle circle1 = new Circle(2 ,"Blue");
            Circle circle2 = new Circle();
        }
    }
}
