import java.io.Console;
import java.lang.*;
public class StringLoops {

    public static void main(String[] args) {


howmany("giggling","g");

        spaceReplacer("1  2  3  4");

        removeconst("banana");
passwordCrack("123456");

    }
private static void passwordCrack(String s){
String guess="";
int count=0;
while(!guess.equals(s)){
    count++;
    guess=String.valueOf(count);
    if(s.equals(guess)){
        System.out.println("Found it");
    }
}







}

 private static void removeconst(String s){
    String cont="aeiou";
    boolean working=false;
    String noval="";
    for (int i = 0; i < s.length(); i++) {
        
    
     for (int j = 0; j < cont.length(); j++) {
        if(cont.substring(j,j+1).equals(s.substring(i,i+1))){
            working =true;
        }
        if(working==true){
            noval+=s.substring(i,i+1);
            System.out.println(noval);
        }
    }}

 }


    private static void spaceReplacer(String s){
        s=s.replaceAll("  "," ");
        System.out.println(s);
    }


    private static void howmany(String s,String v){
        int count =0;
        s=s.toUpperCase();
        v=v.toUpperCase();
        for (int i = 0; i < s.length(); i++) {
            if(s.substring(i,i+1).equals(v)){
                count++;
            }
        }
        System.out.println(count);
    }

}