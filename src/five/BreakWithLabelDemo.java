package five;

import javax.swing.*;

/**
 * 1. Proste
 * byte, short, int, long, float, double, char, boolean
 * 2. Složene tipove(Objektni, Instancni)
 *  niz
 */
public class BreakWithLabelDemo {
    public static void main(String[] args) {
       int[][] numbers = {
               {32,23,13,876},
               {12,10076,2000,80,16},
               {765,345,2,123}
       };
       int uneseniBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj : "));

       MOJA:for(int i=0; i<numbers.length;i++){
           for(int j = 0;j<numbers[i].length; j++){
               int brojNiza = numbers[i][j];
               if(brojNiza == uneseniBroj){

                   System.out.format("Uneseni broj %s se nalazi na  poziciji %s, %s" , uneseniBroj,i,j);
                   break MOJA;
               }

           }

           }
       }

    }

