package four;

import java.util.Scanner;

public class SwitchDemo2 {
    public static void main(String[] args) {
        //mjesec, godina
        System.out.println("Unesi broj mjeseca");
        int brojMjeseca = new Scanner(System.in).nextInt();
        System.out.println("Unesi broj godine");
        int brojGodine = new Scanner(System.in).nextInt();
        //rezultat: broj dana u mjseceu
        int brojDanaMjeseca = 0;
        switch (brojMjeseca){
            case 1:
            case 3:
            case 5:
            case 8:
            case 12:
                brojDanaMjeseca = 31;
                break;
            case 4:
                case 6:
                    case 9:
                        case 11:
                brojDanaMjeseca = 30;
                break;
            case 2:
                if((brojGodine%4 ==0 && brojGodine%100 != 0) || (brojGodine %400 == 0)){
                    brojDanaMjeseca = 29;
                }else{
                    brojDanaMjeseca = 28;
                }
                break;
            default:
                System.out.println("Godina ima 12 mjeseci");
                break;


        }
        System.out.println("Broj dana u mjesecu " + brojMjeseca + " i godini" + brojGodine + "je jednak:"+brojDanaMjeseca );


    }
}

