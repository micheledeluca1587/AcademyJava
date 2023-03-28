package Esercizio7;
import java.util.Scanner;

//! Scrivere un programma che prenda in input un numero 
//! e ritorni se il numero è pari o dispari

class Pari {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Insersci numero pari o dispari");
        int numb = sc.nextInt();
            
            if(numb % 2 == 0){
                System.out.println(numb + " è un numero pari");
            }else {
                
                System.out.println(numb + " è un numero dispari");
                
            }
            
        
        
        
        
    }
    
}
