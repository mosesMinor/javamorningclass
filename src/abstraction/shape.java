package abstraction;

abstract class Shapes {
    String color;
    abstract double area();

    public abstract String toString();
    public Shapes (String color) {
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

