
import java.util.Scanner;
import java.math.*;
import java.util.*;
import java.io.*;
import java.nio.*;
import java.io.IOException; 


public class login {
    public static void main(String[] args) {
        boolean run=true;
        Scanner ui = new Scanner(System.in);
        // FileWriter fw = new FileWriter("log.txt");
        
        String input="";
        while (run) {
            
            while (true) {
                System.out.println("(Login) or (Create) Account.");
                input = ui.nextLine();
                System.out.println(input);
                if(!input.equals("Login") && !input.equals("Create")){System.out.println("Try Again");}else{break;}
            }
            if(input.equals("Login")){
                try { 
                    FileReader output= new FileReader("login.txt"); 
                    BufferedReader read = new BufferedReader(output);
                    for (int i = 0; i < read.l; i++) {
                        
                    }
                    System.out.println(read.readLine());

                    output.close();
                    read.close();
                } 
          
                catch (Exception e) { 
                    e.getStackTrace(); 
                }
            }else if(input.equals("Create")){
            System.out.println("Create Accout");
            System.out.println("Username");
            String username=ui.nextLine();
            System.out.println("Password");
            String password=ui.nextLine();
            System.out.println("Account Made, ReLog in");
            try { 
                FileWriter output= new FileWriter("login.txt",true); 
                output.write(username+","+password); 
                output.close(); 
                // read.close();
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
