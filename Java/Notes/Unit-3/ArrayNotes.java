

public class ArrayNotes{
    public static void main(String[] args){
        int[] number={0,1,2,3,4,5,6,7,8,9};
        printhor(number);
    }
    private static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);           
        }
    }
    private static void printhor(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+',');           
        }
    }
}