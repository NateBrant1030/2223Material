import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;

public class hw2 {
    public static void main(String[] args){

        Scanner ui= new Scanner(System.in);
        
        String input = "go";
        while(!input.equals("quit")){
            System.out.println("triangleArea,midpoint,yearCon,triVolume,quit");
            input = ui.nextLine();
            if (input.equals("triangleArea")){
                triangleArea();
            }
            else if (input.equals("midpoint")){
                midpoint();
            }
            else if (input.equals("yearCon")){
                yearCon();
            }
            else if (input.equals("triVolume")){
                triVolume();
            }
            else if (input.equals("quit")){
                break;
            }



        
        }
    }
    
public static void triangleArea(){
    Scanner ui= new Scanner(System.in);
    ArrayList<Integer> points= new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0));


    for (int i = 0; i < points.size(); i++) {
        System.out.println("input "+i);
        points.set(i,ui.nextInt());
    }


    points.set(0,points.get(0)-points.get(4));
    points.set(2,points.get(2)-points.get(4));
    points.set(1,points.get(1)-points.get(5));
    points.set(3,points.get(3)-points.get(5));
    double s = ((points.get(0)*points.get(3))-(points.get(2)*points.get(1))/2);
    // damn hate math
    System.out.println(s);
}

public static void midpoint(){
    Scanner ui= new Scanner(System.in);
    System.out.println("cord1 x,y");
    String cord1 = ui.next();
    System.out.println("cord2");
    String cord2 = ui.next();
    
    int endx = Integer.valueOf(cord1.substring(0, 1))+Integer.valueOf(cord2.substring(0, 1))/2;
    int endy = Integer.valueOf(cord1.substring(2, 3))+Integer.valueOf(cord2.substring(2, 3))/2;
    System.out.println("("+String.valueOf(endx)+", "+String.valueOf(endy)+")");



}

public static void yearCon(){
    Scanner ui = new Scanner(System.in);
    System.out.println("input mins");
    double input = ui.nextDouble();
    double year = (((input/60)/24)/365);
    double days = ((year)-((int)year))*365;
    double hours= ((days)-((int)days))*24;
    double min= ((hours)-((int)hours))*60;

    System.out.println("years: " + (int)year+ " days: "+ (int)(days)+" hours: "+ (int)(hours)+" Min: "+ (int)(min));

     
}

public static void triVolume(){

    Scanner ui = new Scanner(System.in);
    System.out.println("lenght of sides: ");
    double lenOfSide= ui.nextDouble();
    double area = (Math.sqrt(3)/4)*(Math.pow(lenOfSide, 2));
    double vol= area*lenOfSide;
    System.out.println("your triVolume is: "+ vol);



}




}