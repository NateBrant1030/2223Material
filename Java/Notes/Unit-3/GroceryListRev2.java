import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

/*
     Things to add:
          addItem(GroceryItem item)
          removeItem(GroceryItem item)
          findItem() -> returns String -> "item#\titemName\titemCost"
          totalCost() -> returns double
          modifyCost(newCost)
          sortItemsByCost()

*/

public class GroceryListRev2 {
     public static void main(String[] args) {
          // Build a grocery list
          Scanner ui = new Scanner(System.in);
          System.out.println("Add,remove,find,total,quit?");
          String input = ui.next();
          ArrayList<GroceryItem> groceryList = new ArrayList<GroceryItem>();
          while (!input.equals("quit")) {
               if (input.equals("add")) {
                    System.out.println("name: ");
                    String name = ui.next();
                    System.out.println("cost: ");
                    double cost = ui.nextDouble();
                    addItem(groceryList, name, cost);
               } else if (input.equals("remove")) {
                    System.out.println("what would you like to remove by name");
                    removeItem(groceryList, ui.next());
               } else if (input.equals("find")) {
                    findItem("test");
               } else if (input.equals("print")) {
                    print(groceryList);
               }
               print(groceryList);
               System.out.println("Add,remove,find,print,quit?");
               input = ui.next();
          }
     }
     // for(int i=0;i<groceryList.length;i++){
     // System.out.println("name: ");
     // String name=ui.next();
     // // why use next?... Google it. If you want to learn more

     // System.out.println("cost: ");
     // double cost=ui.nextDouble();

     // groceryList[i]=new GroceryItem(name, cost);
     // }

     private static void print(ArrayList<GroceryItem> arr) {
          // item,item,item,item,item
          System.out.println("Current list ");
          for (int i = 0; i < arr.size(); i++) {

               System.out.println(arr.get(i));
          }
     }

     public static void removeItem(ArrayList<GroceryItem> arr, String name) {
          for (int i = 0; i < arr.size(); i++) {
               String temp = "0";
               if (arr.get(i).getName().equals(name)) {
                    arr.remove(i);
                    System.out.println("Removed " + name + " From List");
                    break;
               }
          }
          System.out.println(name + " Not found in List");

     }

     private static void addItem(ArrayList<GroceryItem> groceryList, String name, double cost) {
          // groceryList[i]=new GroceryItem(name, cost);

          groceryList.add(new GroceryItem(name, cost));
     }

     private static void findItem(String name) {
          System.out.println(name);
     }

}
