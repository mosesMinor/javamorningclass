
package abstraction;

public class Rectangle extends Shapes {
    double length,width;
    public Rectangle(String color,double length,double width) {
        super(color);
        this.length=length;
        this.width=width;
    }

    @Override
    double area() {
        return length*width;
    }

    @Override
    public String toString() {
        return "Rectangle color is " +super.color +":And area of rectangle is " +area();
    }

    public static void main(String[] args) {
        Rectangle mine=new Rectangle("blue",12,12);
        System.out.println(mine.toString());
    }
}


