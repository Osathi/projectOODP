import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        
        Menu menu = new Menu();
        boolean MachineOn = true;

        while(MachineOn) {

            int Select;
            System.out.println("===Smoothie Vending machine===");
            System.out.println("1.Order");
            System.out.println("2.show order");
            System.out.println("3.confirm order and pay");
            System.out.println("4.Exit");
            System.out.println("==============");
            
            Scanner keyboard = new Scanner(System.in);				
            System.out.print("Choose 1-4: ");
            Select = keyboard.nextInt();
            
            if(Select==4) {
                System.out.print("Machine is turning off.. Goodbye!!");
                MachineOn=false;

            }else if(Select==1) {
                //create new smoothie and add to menu
                Smoothie drink = CreateNewDrink();             
                menu.addDrink(drink);
    
            }else if(Select==2) {
                menu.showOrder();;
    
            }else if(Select==3) {
                menu.showTotalPrice();
    
            }else{
                System.exit(0);
            }
            
            
    
        }



    }

    static Smoothie CreateNewDrink()
    {
        Smoothie newDrink = new Smoothie();

        boolean CreateDrink=true;
        int stage=1;

        while(CreateDrink)
        {
            if(stage==1)
            {
                System.out.println("===Select Fruit===");
                System.out.println("1.Strawberry");
                System.out.println("2.Banana");
                System.out.println("3.Orange");
                int Select;
                Scanner keyboard = new Scanner(System.in);				
                System.out.print("Choose 1-3: ");
                Select = keyboard.nextInt();

                if(Select==3) {
                    newDrink.setFruit(fruitType.Orange);
                    stage++;
                }else if(Select==1) {
                    newDrink.setFruit(fruitType.Strawberry);
                    stage++;
                }else if(Select==2) {
                    newDrink.setFruit(fruitType.Banana);
                    stage++;
                }else{
                    System.exit(0);
                }

            }
            if(stage==2)
            {
                System.out.println("===Select sweet level===");
 
                int Select;
                Scanner keyboard = new Scanner(System.in);				
                System.out.print("Choose 1-4: ");
                Select = keyboard.nextInt();

                if(Select >=1 && Select <= 4) {
                    newDrink.setSweetLevel(Select);
                    stage++;
                }else{
                    System.exit(0);
                }
            }
            if(stage==3)
            {
                System.out.println("===Select Cup size===");
                System.out.println("1.S");
                System.out.println("2.M");
                System.out.println("3.L");
                int Select;
                Scanner keyboard = new Scanner(System.in);				
                System.out.print("Choose 1-3: ");
                Select = keyboard.nextInt();

                if(Select==3) {
                    newDrink.setSize(cupSize.L);
                    stage++;
                }else if(Select==1) {
                    newDrink.setSize(cupSize.S);
                    stage++;
                }else if(Select==2) {
                    newDrink.setSize(cupSize.M);
                    stage++;
                }else{
                    System.exit(0);
                }
            }
            if(stage==4)
            {
                System.out.println("===Select topping===");
                System.out.println("1.None");
                System.out.println("2.Nut");
                System.out.println("3.DryFruit");
                System.out.println("4.ChocolateChip");
                int Select;
                Scanner keyboard = new Scanner(System.in);				
                System.out.print("Choose 1-3: ");
                Select = keyboard.nextInt();

                if(Select==1) {
                    newDrink.setTop(topping.None);
                    stage++;
                }else if(Select==2) {
                    newDrink.setTop(topping.Nut);
                    stage++;
                }else if(Select==3) {
                    newDrink.setTop(topping.DryFruit);
                    stage++;
                }else if(Select==4) {
                    newDrink.setTop(topping.ChocolateChip);
                    stage++;
                }else{
                    System.exit(0);
                }

            }
            if(stage>4)
            {
                CreateDrink=false;
            }

        }

        return newDrink;

    }
    
}

