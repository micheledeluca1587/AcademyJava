//! scrivere un programma che chieda all utente una stringa 
//! e ritorni le iniziali di ogni parola con il . 
//*Esempio: “Ciao sono una stringa” => c.s.u.s

package Esercizio10;

import java.util.Scanner;

class Es10 {
 
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci una parola");
        String stringa = sc.nextLine();
        String[] parole = stringa.split(" ");
        for (String parola : parole) {
            System.out.print(parola.charAt(0) + ".");
        }
    

    }

   

}
