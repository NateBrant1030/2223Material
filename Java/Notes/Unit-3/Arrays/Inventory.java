import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Inventory {
    public static void main(String[] args){
        Scanner ui = new Scanner(System.in);
        ArrayList<String> iceCreamList = new ArrayList<String>();
        int index=0;
        String input = "0";
        while(!input.equals("q")){
            
            System.out.println("Would you like to (a)dd, (i)nsert, (r)emove, Re(p)lace, (c)lear or (q)uit?");
            input = ui.nextLine();
            System.out.println(iceCreamList);
            if(input.equals("a")){
                System.out.println("What whould you like to add?");

                input = ui.nextLine();
                System.out.println("added "+input+ " to ice cream list");
                iceCreamList.add(input);
            }
            else if(input.equals("r")){
                System.out.println("what item (by number) would you like to change");
                index = ui.nextInt();
                if(index<iceCreamList.size() && index>0){
                System.out.println("What flavor would you like to change it to");
                input = ui.next();
                iceCreamList.set(index-1, input);}else{System.out.println("No Item Found");}}
            
            
            else if(input.equals("i")){
                System.out.println("what item (by number) would you like to add to");
                index = ui.nextInt();
                if(index<iceCreamList.size() && index>0){
                System.out.println("What flavor would you like to add");
                input = ui.next();
                iceCreamList.add(index-1, input);}else{System.out.println("No Item Found");
            }

            }

            
            else if(input.equals("c")){
                iceCreamList.clear();
            }
            
            else if(input.equals("r")){
                System.out.println("what item (by number) would you like to Remove");
                index = ui.nextInt();
                if(index<iceCreamList.size() && index>0){
                
                iceCreamList.remove(index-1, input);}else{System.out.println("No Item Found");
            }
            }


        }
    }
    
}
