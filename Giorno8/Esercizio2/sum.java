package Esercizio2;
import java.util.Scanner;

//!scrivere un programma che prenda in input un numero e ritorni la sommatoria delle cifre che lo compongono es: 123 => 6

class sum {
 
    
    public static void main(String [] args){

        int sum = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Inserisci la password la quale vuoi la sommatoria");
        
        int number = Integer.parseInt( sc.nextLine());

        while(number != 0){

            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;

        }

        System.out.println("la tua sommatoria dei numeri inseriti è " + sum);



    }

}
