package introduction;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        double num1,num2;

        Scanner pickvalues=new Scanner(System.in);

        System.out.println("enter your first num");
        num1=pickvalues.nextDouble();
            double result=0;
        System.out.println("enter your second num");
        num2=pickvalues.nextDouble();

        System.out.println("enter your operators");
        char oparator=pickvalues.next().charAt(0);

        pickvalues.close();

        switch (oparator){

            case '+':
                result=num1+num2;
                break;
            case '-':
                result=num1-num2;
                break;

            case '*':
                result=num1*num2;
                break;

            case '/':
                result=num1/num2;
                break;

            case '%':
                result=num1%num2;
                break;
            default:
                System.out.println("you have entered the wrong oparations");

        }

        System.out.println("the result is" +result);

    }





}
