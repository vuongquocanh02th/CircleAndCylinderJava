public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "Red");
        System.out.println(circle.toString());
        circle.setRadius(7.0);
        circle.setColor("Blue");
        System.out.println(circle.toString());
    }
}
