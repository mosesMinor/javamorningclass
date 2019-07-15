package javamethods;

public class Dog {

    int age;



    public Dog (int age){
       age=this.age;
    }

    public  void  bark (){
        System.out.println("Woof");
    }

    public  void run (int km ){
        System.out.println(" your dog ran " +km);
    }

    public static void main(String[] args) {

        Dog spike=new Dog( 7 );
        spike.bark();
        spike.run( 7);
    }

}
