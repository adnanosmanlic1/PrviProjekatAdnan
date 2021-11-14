package four;

import javax.swing.*;

/**
 * Kontrola toka
 *prost tip podataka
 * 1. Int --> java.lang.Integer
 * 2.short--> Short
 * 3. double--> Double
 */


public class SwitchDemo {
    public static void main(String[] args) {
        //sitch-case-break
        //ime dana u sedmici na Engleskom
        String brojDanaText = JOptionPane.showInputDialog("Unesi broj dana u sedmici");
        //"2" -->2
        int brojDana = Integer.parseInt(brojDanaText);
        String imeDana = null; //null
        switch (brojDana){
            case 1:
                imeDana = "Montag"
                break;
            case 2:
                imeDana = "Dienstag"
                break;
            case 3:
                imeDana = "Mittwoch"
                break;
            case 4:
                imeDana = "Donnerstag"
                break;
            case 5:
                imeDana = "Freitag"
                break;
            case 6:
                imeDana = "Samstag"
                break;
            case 7:imeDana = "Sonntag"
                break;
            default:
                System.out.println("Sedmica ima 7 dana i upravo zbog toga jeste sedmica");
        }
        if()


    }
}

