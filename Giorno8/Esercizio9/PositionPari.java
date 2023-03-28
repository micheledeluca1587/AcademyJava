package Esercizio9;

import java.util.Scanner;

class PositionPari {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci un numero intero: ");
        int num = sc.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Inserisci il " + (i+1) + "° numero: ");
            array[i] = sc.nextInt();
        }
        System.out.print("Gli elementi in posizione pari sono: ");
        for (int i = 0; i < num; i += 2) {
            System.out.print(array[i] + " ");

    }


}
}
