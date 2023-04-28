import java.lang.reflect.Constructor;
import java.util.ArrayList;

public class menu {
    private ArrayList<Smoothie> smoothies;

    public Menu() {
        smoothies = new ArrayList<Smoothie>();
    }

    public void addDrink(Smoothie smoothie) {
        smoothies.add(smoothie);
    }
}