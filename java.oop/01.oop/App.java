class App {
    public static void main(String[] args) {
        
        String name = "James";
        String surname = "Bond";
        saluta(name, surname);
        name = "Michele";
        surname = "De Luca";
      
        saluta(name, surname);
    }

    
    public static void saluta(String name, String surname){
       
        System.out.println("Il mio nome è " + surname + ", " + name + " " + surname);
    }

}