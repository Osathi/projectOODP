

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 

public class MenuReadWrite {
    
    public static void saveOrder(ArrayList<Smoothie> smoothiesList, File inputFile)
    {
        //date time
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();

        //file
        File myFile = inputFile;

                try (PrintWriter writer = new PrintWriter(new FileWriter(myFile, true))) {
            
                    for(Smoothie Drink : smoothiesList)
                    {
                        //write order + date and time
                        writer.println(Drink.toString() + " " + dtf.format(now));
                    }
                
                } catch(IOException e) {
                    System.out.println("Error: " + e.getMessage());
                }



    
    }

    public static void loadOrder(File inputFile) 
    {

        File myFile = inputFile;

        System.out.println("----------Order History----------");

            try (Scanner scanner = new Scanner(myFile)) {
                while (scanner.hasNextLine()) {
                    System.out.println(scanner.nextLine());
                }
                } catch (IOException e) {
                    System.out.println("Error: " + e.getMessage());
                }

        System.out.println("--------------------------------");
    }


}
