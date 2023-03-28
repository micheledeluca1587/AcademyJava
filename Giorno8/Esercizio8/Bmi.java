//! Scrivere un programma che prenda in input dall’utente un numero peso e un numero altezza
//! e calcoli il BMI. Formula BMI => peso / (altezza * altezza) * 703
//! scrivere un programma che prenda in input un numero, 
//! che crei un array di lunghezza pari 


package Esercizio8;

import java.util.Scanner;

class Bmi {
 
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci il tuo peso in kg: ");
        double peso = input.nextDouble();
        System.out.print("Inserisci la tua altezza in metri: ");
        double altezza = input.nextDouble();
        double bmi = peso / (altezza * altezza)*703;
        System.out.println("Il tuo BMI è " + bmi);
    }

    }
    
