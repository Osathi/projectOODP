import java.lang.reflect.Constructor;
import java.util.function.Function;

public class Smoothie {

   private String fruitType;
   private int sweetLevel;
   private int cupSize;
   private String topping;
   private int price;

   Smoothie(String fruitType, int sweetLevel, int cupSize, String topping) {
        this.fruitType = fruitType; //(Strawberry, Banana, Orange, Mixed berry
        this.sweetLevel = sweetLevel; //(level 1-4)
        this.cupSize = cupSize; //(S M L XXL)
        this.topping = topping; // (Nut, Dry Fruit, Chocolate chip)
        this.price = calculatePrice();
   }
public int calculatePrice() {
    return 0;
   }
public int getPrice() {
    return this.price;
   }
public String toString() {
    return "--";
   }
}