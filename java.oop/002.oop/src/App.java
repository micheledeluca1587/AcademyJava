public class App {
    public static void main(String[] args) throws Exception {

        Person p = new Person();
        p.name = "Michele";
        p.surname ="De Luca";

        p.saluta();


        Person p2 = new Person();
        p2.name = "Giovanni";
        p2.surname ="De Rossi";

        p2.saluta();

      
     
    }

    // public static void saluta(Person persona){
    //     System.out.println("Ciao il mio nome è " + persona.name + " " + persona.surname);
    // }

    



}
