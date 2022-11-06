import java.util.Scanner;

import javax.xml.transform.Templates;

import java.util.Arrays;
import java.util.ArrayList;

/*
     Things to add:
          // addItem(GroceryItem item)
          // removeItem(GroceryItem item)
          // findItem() -> returns String -> "item#\titemName\titemCost"
          // totalCost() -> returns double
          // modifyCost(newCost)
          sortItemsByCost()

*/

public class GroceryListRev2 {
     public static void main(String[] args) {
          clearScreen();
          // Build a grocery list
          Scanner ui = new Scanner(System.in);
          System.out.println("Add,remove,find,total,changeCost,sort,quit?");
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

                    System.out.println("What would you like to find");
                    input = ui.next();
                    findItem(groceryList, input);
               } else if (input.equals("changeCost")) {
                    System.out.println("What would you like to change the cost of");
                    input = ui.next();
                    System.out.println("What would you like to change the cost to");
                    Double input2 = ui.nextDouble();
                    cost(groceryList, input, input2);
               } else if (input.equals("sort")) {
                    groceryList = sort(groceryList);
               }
               clearScreen();
               print(groceryList);
               System.out.println("Add,remove,find,total,changeCost,sort,quit?");
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
          double total = 0;
          for (int i = 0; i < arr.size(); i++) {
               total += arr.get(i).getCost();
          }
          System.out.println("total: " + total);
     }

     public static void removeItem(ArrayList<GroceryItem> arr, String name) {
          Boolean temp = false;
          for (int i = 0; i < arr.size(); i++) {
               if (arr.get(i).getName().equals(name)) {
                    arr.remove(i);
                    System.out.println("Removed " + name + " From List");
                    temp = true;
               }
          }
          if (temp == false) {
               System.out.println(name + " Not found in List");
          }

     }

     private static void addItem(ArrayList<GroceryItem> groceryList, String name, double cost) {

          groceryList.add(new GroceryItem(name, cost));
     }

     private static void findItem(ArrayList<GroceryItem> groceryList, String name) {
          Boolean temp = false;
          for (int i = 0; i < groceryList.size(); i++) {
               if (name.equals(groceryList.get(i).getName())) {
                    System.out.println("found: " + groceryList.get(i));
                    temp = true;
               }
          }
          if (temp == false) {
               System.out.println(name + " Not found in List");
          }

     }

     private static void cost(ArrayList<GroceryItem> groceryList, String name, Double input2) {
          Boolean temp = false;
          for (int i = 0; i < groceryList.size(); i++) {
               if (name.equals(groceryList.get(i).getName())) {
                    groceryList.get(i).setCost(input2);
                    System.out.println("changed to: " + groceryList.get(i));
                    temp = true;
               }
          }
          if (temp == false) {
               System.out.println(name + " Not found in List");
          }

     }

     private static ArrayList<GroceryItem> sort(ArrayList<GroceryItem> groceryList) {
          double smallest = Integer.MAX_VALUE;
          int small = 0;
          ArrayList<GroceryItem> tempList = new ArrayList<GroceryItem>();
          for (int c = 0; c < groceryList.size(); c++) {
          for (int i = 0; i < groceryList.size(); i++) {
               if (groceryList.get(i).getCost() < smallest) {
                    smallest = groceryList.get(i).getCost();
                    small = i;
               }
          
          smallest = Integer.MAX_VALUE;
          System.out.println(tempList);
          System.out.println(groceryList);}
          tempList.add(groceryList.get(small));
          groceryList.remove(small);}
          tempList.add(groceryList.get(0));
          return tempList;

     }

     // clears the console out to make easyer to read
     public static void clearScreen() {
          for (int i = 0; i < 100; ++i)
               System.out.println();
     }

}
