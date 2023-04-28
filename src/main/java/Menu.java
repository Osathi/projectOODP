import java.lang.reflect.Constructor;
import java.util.ArrayList;

public class Menu {
    
    private  ArrayList<Smoothie> smoothiesList = new ArrayList<Smoothie>();

    public Menu() {
        smoothiesList = new ArrayList<Smoothie>();
    }

    public void addDrink(Smoothie smoothie) {
        smoothiesList.add(smoothie);
    }

    public void showOrder() {
    smoothiesList.size();
    smoothiesList.get(0).toString();
	smoothiesList.get(1).toString();
    /*System.out.println("Order:");
    for (int i = 0; i < smoothiesList.size(); i++) {
        System.out.println((i+1) + ". " + smoothiesList.get(i).toString());  
    } */ 
    }

    public void showTotalPrice() {
        double totalPrice = 0;
        for (Smoothie smoothie : smoothiesList) { //loop
            totalPrice += smoothie.getPrice();
        }
        System.out.println("Total price: " + totalPrice);
    }
    public void clearList() {
        smoothiesList.clear();
    }
}
