package Esercizio6;

import java.util.Scanner;

//! scrivere un programma che prenda in input un numero,
//! che crei un array di lunghezza pari al numero inserito, 
//! che chieda un numero di elementi pari al numero inserito
//!  e ritorni il valore massimo inserito

class Maxarray2 {
    
    public static void main(String[] args){
        
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci numero");
        int numbers = Integer.parseInt(sc.nextLine());
        int[] newNumb = new int[numbers];
        for (int i = 0; i < numbers; i++) {

            System.out.println("Inserisci il numero");
            newNumb[i] = Integer.parseInt(sc.nextLine());
            
        }

        int largest = newNumb[0];
        for (int i = 0; i < newNumb.length; i++) {

            if(newNumb[i] > largest){
                largest = newNumb[i];

            }

            
        }

        System.out.println("Il valore massimo inseriro all'interno dell'array è " + largest);

    }
    
}
