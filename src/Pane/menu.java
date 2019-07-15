package Pane;
import javax.swing.*;
public class menu {
    public static void main(String[] args) {
      String order ;
        order= JOptionPane.showInputDialog("place your order");
        char A=order.charAt(0);
        JOptionPane.showMessageDialog(null,String.valueOf("Here is your order"));
        switch (A){
            case 'A':
                System.out.println("You have ordered for ugali and Nyama");
                break;
            case 'B':
                System.out.println("You have ordered for Chapati and Nyama");
                break;
            case 'C':
                System.out.println("You have ordered for Matoke and Salad");
                break;
            case 'D':
                System.out.println("You have ordered for Rice and Nyama");
                break;
            case 'E':
                System.out.println("You have ordered for cassava and tea");
                break;
        }
    }
    }

