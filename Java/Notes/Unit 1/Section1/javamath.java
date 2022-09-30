import java.lang.*;
import java.util.Random;
public class javamath {
public static void main(String[] args){
    // two ints = int
    // float/int = float

    System.out.println(18/5); 
    System.out.println(18.0/5);
    
    System.out.println(18.0/5.0);    
    System.out.println(18/5);

    System.out.println(Integer.MAX_VALUE);  System.out.println(Double.MAX_VALUE);  System.out.println(Long.MAX_VALUE);


    // "14"+5,""*4 2**2 nono
    System.out.println(Math.pow(1,32));

    System.out.println(Math.tan(32)/Math.sqrt(9));


    // create var
    int age = 17;
    double ages = 321; // object data type
    Double year = 20.04; // class type object- non-Primitive
    // python += whatever
    year ++;
    year +=5;
    // withs with all * / + - 



    //Ranodm
    System.out.println(Math.random());


    System.out.println((int)(Math.random()*10));


    System.out.println("42-56:"+((int)(Math.random()*56-42)+42));


    Random rand = new Random();
    int randomInt = rand.nextInt(10);
    System.out.println(randomInt);
    double randomD = rand.nextDouble();
    System.out.println(randomD);
}    
}
