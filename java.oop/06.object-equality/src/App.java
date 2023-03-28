public class App {
  public static void main(String[] args) throws Exception {
      
      Pointer3D p1 = new Pointer3D(100, 200, 300);
      Pointer3D p2 = new Pointer3D(100, 200, 300);
 
      System.out.println(p1.equals(p2));

    
  }
}