public class Restaurant {
    
//! Attributi    
private String name;
private Dish[] dishes;
private Drink [] drinks;




public Restaurant(String name, Dish[] dishes, Drink[] drinks) {
    this.name = name;
    this.dishes = dishes;
    this.drinks = drinks;
}

public void stampamenu(){

    for (Dish d: dishes) {

        System.out.println(d.getName() + ".. " + d.getPrice() );
        
    }

    for (Drink dr: drinks) {

        System.out.println(dr.getName() + ".." + dr.getPrice());
        
    }


}



public String getName() {
    return name;
}




public void setName(String name) {
    this.name = name;
}




public Dish[] getDishes() {
    return dishes;
}




public void setDishes(Dish[] dishes) {
    this.dishes = dishes;
}




public Drink[] getDrinks() {
    return drinks;
}




public void setDrinks(Drink[] drinks) {
    this.drinks = drinks;
}








    
}
