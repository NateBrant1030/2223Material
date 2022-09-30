import java.util.*;
public class GAN {
    public static void main(String[] args){
    int hnum = 4;
    Scanner ui = new Scanner(System.in);
    System.out.println("Guess a number 0-10");
    int num = ui.nextInt();
    if(hnum==num){  System.out.println("you got it");}
    else if(hnum > num){    System.out.println("To high");}
    else{    System.out.println("To low");}


}
    }
