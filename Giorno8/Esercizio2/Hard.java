package Esercizio2;

import java.util.Scanner;

//! scrivere un programma che prenda in input un numero, 
//! che crei un array di lunghezza pari al numero inserito, 
//!che chieda un numero di elementi pari al numero inserito 
//!e ne faccia la sommatoria



class Hard {
  
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci i numeri che vuoi che si ripetano");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println("Il numero è " + number);

        int[] arraynumbers = new int[number];

        for (int i = 0; i < number; i++) {

            System.out.println("Inserisci il numero");
            arraynumbers[i] = Integer.parseInt(sc.nextLine()); 
            
        }

        int position = 0;
        int largest = arraynumbers[0];
        for (int i = 0; i < arraynumbers.length; i++) {
            if(arraynumbers[i] > largest){
                largest = arraynumbers[i];
                position = i;
            }
        }

        System.out.println("bla bla bla " + largest + ' ' + position);

    }
    
}
