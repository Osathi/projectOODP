import java.lang.reflect.Constructor;
import java.util.function.Function;

public class smoothie {
     Constructor(fruitType, sweetLevel, cupSize, topping) {
        this.fruitType = fruitType; //(Strawberry, Banana, Orange, Mixed berry
        this.sweetLevel = sweetLevel; //(level 1-4)
        this.cupSize = cupSize; //(S M L XXL)
        this.topping = topping; // (Nut, Dry Fruit, Chocolate chip)
        this.price = calculatePrice();
   }
public void calculatePrice() {
    ______
   }
public int getPrice() {
    return this.price;
   }
public String toString() {
    return _______
   }
}