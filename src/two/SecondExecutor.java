package two;

/**
 * staticlly type lnguage
 * Tipovi podataka:
 * 1.prosti i 2. složeni
 *
 * Prosti tipovi:
 * 1. byte(-128 0 127)
 * 2. short(-32768 0 32767)
 * 3. int
 * 4. long
 * 5. float-DECIMALNI-32bit
 * 6. double-DECIMALNI-64bit
 * 7. char -karakteri
 * 8. boolean - true or false

            TIP varijablom
 */
public class SecondExecutor {
    public static void main(String[] args) {
      //tip varijabla = podatak:
        byte firstNumber = 127;// 8 bitni zapis
        short secondNumber = 32_767;// 16 bitni zapis
        int thirdNubmer = 55000;// 32-bitni zapis , podrazumijevani cijelobrojni tip podatka
        long fourthNubmer = 55000L; //64--> 64

       int intNumber = 32000;
       long longNumber = intNumber;


       long longNumber2 = 32000L;//32000
       int intNumber2 = (int) longNumber2;

       //tip varijabla = podatak
       float floatNumber = 2.3F;
       double doubleNumber = 2.3;
       double decimalNumber = 123.4;
       double decimalNumber2 = 1.234e2;
        System.out.println(decimalNumber);
        System.out.println(decimalNumber2);

        System.out.println();

        int specijalnBroj1 = 26; // dekadni od 0 do 10
        System.out.println(specijalnBroj1);
        int specijalanBroj2 = 0x1a;//hex
        System.out.println(specijalanBroj2);
        int specijalniBroj3 = 0b11010;//binarni
        System.out.println(specijalniBroj3);


        //char --> jednostruke navodnike
        char charVariable = 'a';
        char charVar = 87;
        System.out.println(charVar);
        int intNumber3 = charVariable;
        System.out.println(intNumber3);

        //boolean
        boolean condition = true;
        System.out.println(condition);







    }
}