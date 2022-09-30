import java.util.*;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("How many: ");
        int howMany = ui.nextInt();
        String[] shoppingList = new String[howMany];

        for (int i = 0; i < shoppingList.length; i++) {
            System.out.println("Add an item: ");
            shoppingList[i] = ui.next();

        }
        printHor(shoppingList);

    }

    private static void printArray(String[] arr){
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
