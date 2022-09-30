import java.util.*;

public class ShoppingListRev1 {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("How many: ");
        int howMany = ui.nextInt();
        GroceryItem[] shoppingList = new GroceryItem[howMany];

        for (int i = 0; i < shoppingList.length; i++) {
            System.out.println("Name: ");
            String name = ui.next();
            System.out.println("Cost: ");
            double cost = ui.nextDouble();

            shoppingList[i]=new GroceryItem(name, cost);

        }
        printArray(shoppingList);

    }

    private static void printArray(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);           
        }
    }
    private static void printArray(GroceryItem[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);           
        }
    }
        private static void printHor(String[] arr){
            String end="";

            for (int i = 0; i < arr.length; i++) {
                end+=((arr[i]));
                if(i!=arr.length-1){      
                    end+=(",");
            }
        }
        System.out.println(end);
        }
}
