package Pane;

import javax.swing.*;

public class calculator {
    public static void main(String[] args) {
        double num1Con,num2Con,result=0;
        char operatorCon;
        String num1,num2,operator;
        num1= JOptionPane.showInputDialog("Enter your first number");
        num2=JOptionPane.showInputDialog("Enter your second number");
        operator=JOptionPane.showInputDialog("Enter your operator");

        num1Con=Double.parseDouble(num1);
        num2Con=Double.parseDouble(num2);
        operatorCon=operator.charAt(0);

        switch(operatorCon){
            case '+':
                result=num1Con+num2Con;
                break;
            case '-':
                result=num1Con-num2Con;
                break;
            case'*':
                result=num1Con*num2Con;
                break;
            case '/':
                result=num1Con/num2Con;
                break;
            case '%':
                result=num1Con%num2Con;
                break;
            default:

                JOptionPane.showMessageDialog(null,String.valueOf("You have entered a wrong operator"));
        }

        System.out.println("This is the result"+result);

    }
}