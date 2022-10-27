import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class gpa {
    public static void main(String[] args){
        Scanner ui = new Scanner(System.in);
        double gpa=0.0;
        ArrayList<String> grades=new ArrayList<String>();
        System.out.println("How many classes are you takeing?");
        int loop=ui.nextInt();
        for (int i = 0; i < loop; i++) {
            System.out.println("whats your grade A,B,C,D,F");
            grades.add(ui.next());
        }
        for (int i = 0; i < grades.size(); i++) {
            if(grades.get(i).equals("A")){
                gpa+=4;
            }else if(grades.get(i).equals("B")){
                gpa+=3;
            }
            else if(grades.get(i).equals("C")){
                gpa+=2;
            }
            else if(grades.get(i).equals("D")){
                gpa+=1;
            }
        }
        System.out.println("Your gpa is... "+(gpa/grades.size()));
    }
    
}
