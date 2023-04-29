

public class Smoothie {

   private fruitType fruit;
   private int sweetLevel;
   private cupSize size;
   private topping top;
   private int price;

   Smoothie(fruitType fruit, int sweetLevel, cupSize size, topping top) {
        this.fruit = fruit;
        this.sweetLevel = sweetLevel; //(level 1-4)
        this.size = size; 
        this.top = top; 
        this.price = calculatePrice();
   }

   Smoothie(){

   }

   public void setFruit(fruitType fruit) {
       this.fruit = fruit;
   }

   public void setSize(cupSize size) {
       this.size = size;
   }

   public void setSweetLevel(int sweetLevel) {
       this.sweetLevel = sweetLevel;
   }

   public void setTop(topping top) {
       this.top = top;
   }

public int calculatePrice() {
    
   int cal_price=0;
   
   switch (fruit)
   {
         case Strawberry:
         cal_price += 5;
         break;

         case Banana:
         cal_price += 4;
         break;

         case Orange:
         cal_price += 6;
         break;

         case Mixedberry:
         cal_price += 7;
         break;

         default:
         System.out.println("no fruit");
         break;
   }

   switch (size)
   {
         case S:
         cal_price += 10;
         break;

         case M:
         cal_price += 15;
         break;

         case L:
         cal_price += 20;
         break;

         case XL:
         cal_price += 30;
         break;

         case XXL:
         cal_price += 40;
         break;

         default:
         System.out.println("no cup size");
         break;
   }

   switch (top)
   {
         case Nut:
         cal_price += 5;
         break;

         case DryFruit:
         cal_price += 4;
         break;

         case ChocolateChip:
         cal_price += 6;
         break;

         case None:
         cal_price += 0;
         break;

         default:
         break;
   }
        
   return cal_price;
   
   }

public int getPrice() {
      calculatePrice();
      return this.price;
   }
public String toString() {
      calculatePrice();

    String string =

    fruit.toString() + " Smoothie "
    + "SweetLevel: " + sweetLevel 
    + " Cupsize: " + size.toString() 
    + " with topping: " + top.toString() 
    + " Price: " + price + "$" ;

    return string;
   }
}

enum fruitType {
   Strawberry, 
   Banana, 
   Orange, 
   Mixedberry;
}

enum cupSize {
   S, M, L, XL, XXL;
}

enum topping {
   None,
   Nut, 
   DryFruit, 
   ChocolateChip;
}