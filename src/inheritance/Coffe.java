package inheritance;

public class Coffe extends Beverage {

    public void black(){
        System.out.println("You ordered black coffee");
    }

    public void white(){
        System.out.println("You ordered white coffee");
    }
    public void addSeeds(int cubes){
        System.out.println("You added "+cubes+" cubes of coffee");
    }

    public static void main(String[] args) {

        Coffe order1=new Coffe();


        order1.addSugar(3);
        order1.isFull();
        order1.addSeeds(4);
        order1.white();

    }
}

