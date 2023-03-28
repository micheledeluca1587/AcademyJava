package Esercizio3;
import java.util.Scanner;

class reversedigits {
  
    public static void main(String[] agrs){

        int reverse = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci numero");

        int number = sc.nextInt();


        while(number != 0){

            int digit = number % 10;
             reverse = (reverse * 10) + digit;
             number = number / 10;

        }

        System.out.println("I numeri che hai inserito, hanno cambiato posto eccoli qui " +  reverse);
    }
    
}
