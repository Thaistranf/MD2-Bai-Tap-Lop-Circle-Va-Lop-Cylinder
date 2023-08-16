public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.6, "red");
        System.out.println(circle.toString());
        System.out.println("Area = " + circle.area());

        Cylinder cylinder = new Cylinder(15.2, 3.5,"blue");
        System.out.println("\n" + cylinder.toString());
        System.out.println("Volume = " + cylinder.volume());
    }
}