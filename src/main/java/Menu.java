import java.util.ArrayList;

public class Menu {
    
    private  ArrayList<Smoothie> smoothiesList = new ArrayList<Smoothie>();

    public Menu() {
        smoothiesList = new ArrayList<Smoothie>();
    }

    public void addDrink(Smoothie Smoothie) {
        smoothiesList.add(Smoothie);
    }

    public void showOrder() {
    
    System.out.println("");
    
        
    if(smoothiesList.size()>0){
        System.out.println("+++Show Order+++");
        for(int i = 0 ; i < smoothiesList.size() ; i++)
        {   
        System.out.println((i+1) + ". " + smoothiesList.get(i).toString());
        }
        showTotalPrice();
    }else{
        System.out.println("+++No Drink in order+++");
    }
    
    System.out.println("+++++++++++++++");

    }

    public void showTotalPrice() {
        int totalPrice = 0;
        for (Smoothie smoothie : smoothiesList) { //loop
            totalPrice += smoothie.getPrice();
        }
        System.out.println("Total price: " + totalPrice +"$");
    }
    public void clearList() {
        smoothiesList.clear();
    }
}
