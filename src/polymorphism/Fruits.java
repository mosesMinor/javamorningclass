package polymorphism;

public class Fruits extends Food {

    int size;
    public Fruits(int price, int size){
        super(price);
        this.size=size;
    }
    public void wash(){
        System.out.println("We have cleaned fruits");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Fruits(int price) {
        super(price);
    }

    @Override
    public void eat() {
        System.out.println("This fruits is yummy");

    }

    @Override
    public String toString() {
        return "Fruits{" +
                "size=" + size +
                '}';
    }

    public static void main(String[] args) {
        Fruits orange=new Fruits(30);
        Food mango=new Fruits(40);
        orange.setSize(3);
        mango.eat();
        ((Fruits) mango).setSize(4);
        System.out.println(mango.toString());
    }

}

