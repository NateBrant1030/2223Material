import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class loopity {
    public static void main(String[] args) {
    /*  while(true){System.out.println("hello");}*/


    // for(int i=0;i<=11;i++){
        //     System.out.print(i);
        //     if(i<11){System.out.print(",");}
        // }
        // List test = new ArrayList<Double>();
        // for(int l=0;l<=10;l++){
            // test.add(l);
            // System.out.println(test);}
            
            minMaxChecker();
        }
        private static void minMaxChecker(){
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            Scanner ui=new Scanner(System.in);
            int num = 0;
            while(num != -1){
                num = ui.nextInt();
                if(num>max){max=num;}
                if(num<min){min=num;}

                
                System.out.println("max "+ max);
                System.out.println("min "+ min);

            }


            
            
    }
}