
import java.util.Scanner;
import java.math.*;
import java.util.*;
import java.io.*;
import java.nio.*;
import java.io.IOException; 


public class login {
    public static void main(String[] args) {
        boolean run=true,con = true;
        Scanner ui = new Scanner(System.in);
        // FileWriter fw = new FileWriter("log.txt");
       
        String input="";
        while (run) {
            while (con=true) {
                System.out.println("(Login) or (Create) Account.");
                input = ui.nextLine();
                System.out.println(input);
                if(!input.equals("Login") || !input.equals("Create")){System.out.println("working");}
            }
            if(input=="Login"){
                
            }else if(input=="Create"){
            System.out.println("Create Accout");
            System.out.println("Username");
            String username=ui.nextLine();
            System.out.println("Password");
            String password=ui.nextLine();
            System.out.println("Account Made, ReLog in");
            try { 
                // Creates a FileWriter 
                FileWriter output 
                    = new FileWriter("login.txt"); 
      
                // Writes the string to the file 
                output.write(username); 
      
                // Closes the writer 
                output.close(); 
            } 
      
            catch (Exception e) { 
                e.getStackTrace(); 
            } 
            run = false;
            }   
        }
        // try{fw.close();}catch (Exception e){System.out.println(e);}
        
    }

    
}
