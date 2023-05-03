import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        
        Menu menu = new Menu();
        boolean MachineOn = true;
        File HistoryFile = new File("History.txt");
        
        try {
            HistoryFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
  
        

        whileloop:
        while(MachineOn) {

            int Select;
            System.out.println("");
            System.out.println("===Smoothie Vending machine===");
            System.out.println("1.Order");
            System.out.println("2.show order");
            System.out.println("3.confirm order and pay");
            System.out.println("4.Exit");
            System.out.println("5.view order history");
            System.out.println("==============");
            
            Scanner keyboard = new Scanner(System.in);				
            System.out.print("Choose 1-5: ");
            
            try {
                Select = keyboard.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                keyboard.nextLine();
                continue whileloop;
            }
            
            if(Select==4) {
                System.out.print("Machine is turning off.. Goodbye!!");
                MachineOn=false;

            }else if(Select==1) {
                //create new smoothie and add to menu
                Smoothie drink = CreateNewDrink();
                System.out.println("");
                System.out.println("Add new drink to order");
                System.out.println(drink.toString());                   
                menu.addDrink(drink);
    
            }else if(Select==2) {
                menu.showOrder();

    
            }else if(Select==3) {
                menu.showOrder();
                System.out.println("Please pay and wait for your order Thank you!!");
                menu.clearList(HistoryFile);
    
            
            }else if(Select==5) {
                MenuReadWrite.loadOrder(HistoryFile);

            }else{
                System.out.print("Wrong Input Please Choose 1-4: ");
                continue whileloop;
            }
            
            
    
        }



    }

    static Smoothie CreateNewDrink()
    {
        Smoothie newDrink = new Smoothie();

        boolean CreateDrink=true;
        int stage=1;

        whileloop:
        while(CreateDrink)
        {
            if(stage==1)
            {
                System.out.println("");
                System.out.println("===Select Fruit===");
                System.out.println("1.Strawberry");
                System.out.println("2.Banana");
                System.out.println("3.Orange");
                int Select;
                Scanner keyboard = new Scanner(System.in);				
                System.out.print("Choose 1-3: ");
                
                try {
                    Select = keyboard.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    keyboard.nextLine();
                    continue whileloop;
                }

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
                    System.out.println("Wrong Input Please Choose 1-3: ");
                continue whileloop;
                }

            }
            if(stage==2)
            {
                System.out.println("");
                System.out.println("===Select sweet level===");
 
                int Select;
                Scanner keyboard = new Scanner(System.in);				
                System.out.print("Choose 1-4: ");
                
                try {
                    Select = keyboard.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    keyboard.nextLine();
                    continue whileloop;
                }

                if(Select >=1 && Select <= 4) {
                    newDrink.setSweetLevel(Select);
                    stage++;
                }else{
                    System.out.println("Wrong Input Please Choose 1-4: ");
                continue whileloop;
                }
            }
            if(stage==3)
            {
                System.out.println("");
                System.out.println("===Select Cup size===");
                System.out.println("1.S");
                System.out.println("2.M");
                System.out.println("3.L");
                int Select;
                Scanner keyboard = new Scanner(System.in);				
                System.out.print("Choose 1-3: ");
                
                try {
                    Select = keyboard.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    keyboard.nextLine();
                    continue whileloop;
                }
                
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
                    System.out.println("Wrong Input Please Choose 1-3: ");
                continue whileloop;
                }
            }
            if(stage==4)
            {
                System.out.println("");
                System.out.println("===Select topping===");
                System.out.println("1.None");
                System.out.println("2.Nut");
                System.out.println("3.DryFruit");
                System.out.println("4.ChocolateChip");
                int Select;
                Scanner keyboard = new Scanner(System.in);				
                System.out.print("Choose 1-4: ");
                
                try {
                    Select = keyboard.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    keyboard.nextLine();
                    continue whileloop;
                }

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
                    System.out.println("Wrong Input Please Choose 1-4: ");
                continue whileloop;
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

