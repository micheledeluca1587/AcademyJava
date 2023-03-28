public class App {
    public static void main(String[] args) throws Exception {

        Person p1 = new Person("Michele", "De Luca");
        Person p2 = p1; 

        
        stampanome(p1.name);
        cambianome(p1);
        stampanome(p1.name);
    }

    
    public static void stampanome(String name){ System.out.println(name); }
  
    public static void cambianome(Person p) { p.name = "Giovanni"; }

   

}
