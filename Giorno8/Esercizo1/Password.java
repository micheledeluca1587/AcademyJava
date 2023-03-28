package Esercizo1;
import java.util.Scanner;

class App{

public static void main(String[]args){

    Boolean firstRule = false;
  
    Scanner sc = new Scanner(System.in);
    System.out.println("Inserisci passowrd");
    String password = sc.nextLine();
    System.out.println("Password inserita è " + password);

   
    if(password.length() >= 8) firstRule = true;
    
    if(firstRule && Rules (password)){
        System.out.println("La pwd è corretta");
    } else {
        System.out.println("La password non è corretta");
    }




} 

    
public static boolean Rules (String password){

    Boolean secondRule = false;
    Boolean thirdRule = false;
    Boolean fourthRule = false;

    for (int i = 0; i < password.length(); i++) {

        if(Character.isUpperCase(password.charAt(i))){

             secondRule = true;
        }
        if(Character.isDigit(password.charAt(i))){

            thirdRule = true;
        }

        char ch = password.charAt(i);
        
        if(ch == '!' || ch == '£' || ch == '$' || ch == '%' || ch == '&'){
            
            fourthRule = true;
            break;
        }

        
    }

          return secondRule && thirdRule && fourthRule;

    }

  
}