package introduction;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner pickgrades;
        pickgrades = new Scanner(System.in);
        System.out.println("Please enter your marks");
        int marks= pickgrades.nextInt();

        if (marks> 90 && marks<100){
            System.out.println("You have a A");
        }
        else if (marks>80 && marks<=90){
            System.out.println("You have a B");
        }else if (marks>70 && marks<=80){
            System.out.println("You have a C");
        }else if (marks>60 && marks<=70){
            System.out.println("You have a C");
        }else if (marks<50 && marks>0){
            System.out.println("Redo the paper");
        }
    }
}


