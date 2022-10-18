import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ALNotes {
    public static void main(String[] args) {
        additionCal();

    }

    private static void additionCal(){
        ArrayList<Double> numbers = new ArrayList<Double>();
        Scanner ui = new Scanner(System.in);
        double input=1.0;
        while(input!=0.0){
            input=ui.nextInt();
            numbers.add(input);
            // System.out.println(numbers);
        }

    double total=0.00;
    for (int i = 0; i < numbers.size(); i++) {
        System.out.print(numbers.get(i)+" ");
        total+=(numbers.get(i));

        
    }
    System.out.printf("Your total is: %f\n",total);
    ui.close();
    }

}
