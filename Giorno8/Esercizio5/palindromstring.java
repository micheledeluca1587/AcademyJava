package Esercizio5;
import java.util.Scanner;


class palindromstring {
    
    public static void main(String[] args){
        
        String a = "";
        String b = "";
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci parola e controlleremo se è palindroma");
        a = sc.nextLine();
        int leng = a.length();
        for (int i = leng -1; i >= 0; i--) {
            
            b = b + a.charAt(i);
            
            if(a.equalsIgnoreCase(b)){
                
                System.out.println("La stringa è palindroma");
                
            } else {
                
                System.out.println("La stringa non è palindroma");
                
            }
            
            
        }
        
    }
    
}


