public class MainApp {
    public static void main(String[] args) {
        
        Menu menu = new Menu();

        menu.addDrink(new Smoothie(fruitType.Strawberry, 2, cupSize.XL, topping.None));
        menu.showOrder();

        
    }
}
