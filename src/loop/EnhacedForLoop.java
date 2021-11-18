package loop;

public class EnhacedForLoop {
    public static void main(String[] args) {
       // int number = 3;
        //number += 2; // da povećaš number za 2 (number = number + 2;)
        //Enhaced(Npredna)
        int[] numbers = {23, 13, 123, 1234, 45, 67, 78};

      //  for(int i= 0; i< numbers.length; i++ ){
          //  System.out.println("Element na indeksu" + i +":" + numbers[i]);
        //}
        System.out.println();
        System.out.println("Parni brojevi:");
        for(int i = 0; i< numbers.length; i++  ){
            if(numbers[i]%2 != 0){
                System.out.println("Neparan broj na indeksu" + i + "je" + numbers[i]);
            }
        }
        System.out.println();
        System.out.println("Enhaced for loop");
        for(int number : numbers){
            System.out.println(number);
        }
    }
}
