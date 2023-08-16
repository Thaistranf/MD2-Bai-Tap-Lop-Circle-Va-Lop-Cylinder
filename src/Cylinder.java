public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }

    @Override
    public void setRadius(double radius) {
        super.setRadius(radius);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public double area() {
        return super.area();
    }
    public double volume(){
        return super.area() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + super.getRadius() +
                ", height=" + height +
                ", color='" + super.getColor() + '\'' +
                '}';
    }
}
