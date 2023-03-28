package Esercizio4;
import java.util.Scanner;

class MediaofArray {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci numeri");
        int numbers = Integer.parseInt(sc.nextLine());
        int[]arr = new int[numbers];
        for (int i = 0; i < numbers; i++) {
           
            System.out.print("Inserisci il " + (i+1) + "° numero: ");
            arr[i] = sc.nextInt();
            
        }

        double sum = 0;
        for (int i = 0; i < numbers; i++) {
            sum += arr[i];
        }
        double media = sum / numbers;
        System.out.println("La media dei numeri inseriti è " + media);


    }

    
}
