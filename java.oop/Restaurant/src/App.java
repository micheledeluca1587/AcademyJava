public class App {
    
    public static void main(String[] args) throws Exception{


        Dish d1 = new Dish("Carbonara" , 15);
        Dish d2 = new Dish("Cacio e Pepe" , 20);

        Drink drink1 = new Drink("Gin Tonic" , 12);
        Drink drink2 = new Drink("Americano" , 17);

        Dish [] tuttipiatti = new Dish[] {d1 ,d2};
        Drink [] tuttidrinks = new Drink[] {drink1 , drink2};

        Restaurant restaurant = new Restaurant("Ristorante", tuttipiatti , tuttidrinks);
     
        restaurant.stampamenu();
    } 

    

}
