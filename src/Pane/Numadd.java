package Pane;

import javax.swing.*;

public class Numadd {
    public static void main(String[] args) {
        String fnum,snum;
        double fnumCon,snumCon,aswer;
        fnum= JOptionPane.showInputDialog("Enter First Number");
        snum= JOptionPane.showInputDialog("Enter Second Number");
        fnumCon=Double.parseDouble(fnum);
        snumCon=Double.parseDouble(snum);
        aswer=fnumCon +snumCon;

        JOptionPane.showMessageDialog(null,String.valueOf(aswer));

    }
}