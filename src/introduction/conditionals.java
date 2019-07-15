package introduction;
import java.util.Scanner;
public class conditionals {
    public static void main(String[] args) {
        Scanner chukua;
        int age;
        chukua =new Scanner(System.in);
        System.out.println("Enter your age");
        age=chukua.nextInt();


        if (age<18) {
            System.out.println("YOUNG PERSON");
        }else if(age>18) {
            System.out.println("ADULT");

        }

    }


}

