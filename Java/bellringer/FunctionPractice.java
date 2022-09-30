import java.util.Scanner;

public class FunctionPractice {
    public static void main(String[] args) {

        // addTwoNum();

        while (true) {
            long time = System.currentTimeMillis();
            System.out.println((time));
        }

    }

    // private-onky this class can see this function
    // static- no need for an object of the class to be instantuated
    // void no return data
    private static void addTwoNum() {
        Scanner ui = new Scanner(System.in);
        System.out.println("first number");
        double x = ui.nextDouble();
        System.out.println("seconed number");
        double y = ui.nextDouble();
        System.out.println(x + y);
        ui.close();
    }
}
// rules of thumbs
// who needs acceses? public or private
// do i need an object to use this method?
// am i returing Info
// will i have different data types???

// functions should be named some type of verb
