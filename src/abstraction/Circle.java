package abstraction;

public class Circle extends Shapes {
    double radius;

    public Circle(String color,double radius) {
        super(color);
        this.radius=radius;
    }

    @Override
    double area() {
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle color is "+super.color + " Area is " +area();
    }

    public static void main(String[] args) {
        Circle yanu=new Circle("blue",9);
        yanu.getColor();
        System.out.println(yanu.toString());
    }
}

