package Overiding;

public class Son extends Father {

    @Override
    public void eat() {
        System.out.println("Son eats more food");
    }

    @Override
    public void istall() {
        System.out.println("Son is shorter 3,4");
    }

    @Override
    public void Strong() {
        super.Strong();
    }

    public static void main(String[] args) {
        Son Paul=new Son();
        Paul.eat();
        Paul.istall();
        Paul.Strong();
    }
}



