package inheritance;

public class Beverage {

    public Beverage() {
    }

    public void addSugar(int spoons){
        System.out.println("You added "+spoons+" spoons of sugar ");
    }
    public void isFull(){
        System.out.println("Your order is full");
    }

    public static void main(String[] args) {
        Beverage bev1=new Beverage();
        bev1.addSugar(3);
        bev1.isFull();


    }
}