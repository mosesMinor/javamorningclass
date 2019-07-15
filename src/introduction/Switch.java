package introduction;

import java.util.Scanner;

public class Switch {


    public static void main(String[] args) {
        Scanner menu;
        char order;

        menu=new Scanner(System.in);
        System.out.println("please enter your order");
        order=menu.next().charAt(0);


        switch (order){

            case 'A':
            System.out.println("you have ordered for chapati");
               break;

            case 'B':
                System.out.println("you have ordered for tea");
                break;

            case 'C':
                System.out.println("you have ordered for rice");
                break;

            case 'D':
                System.out.println("you have ordered for chips");
                break;

            default:System.out.println("that's not ready yet");


        }

    }
}
