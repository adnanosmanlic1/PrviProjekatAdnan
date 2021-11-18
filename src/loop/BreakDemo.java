package loop;

import javax.swing.*;

public class BreakDemo {
    public static void main(String[] args) {
        int[] nizBrojeva = {23, 14, 123, 56, 76, 45677, 34};
        String uneseniBrojText = JOptionPane.showInputDialog("Unesi neki cijeli broj");
        int uneseniBroj = Integer.parseInt(uneseniBrojText);
        boolean foundIt = false;
        for (int number : nizBrojeva){
            if(uneseniBroj == number ){
               foundIt = true;
                break;
            }
        }
        if(foundIt){
            JOptionPane.showMessageDialog(null, "BINGOOOO!!!");
        }else{
            JOptionPane.showMessageDialog(null, "IZVINJAVAMO SE STO STE NESRETNI...");
        }
    }
}
