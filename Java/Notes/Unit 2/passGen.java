import java.util.Scanner;
import java.math.*;

public class passGen {
    public static void main(String[] args) {
        boolean running = true;
        boolean change = false;
        Scanner ui = new Scanner(System.in);
        System.out.println("How many Characters do you want");
        int characters = ui.nextInt();
        System.out.println("How many Numbers do you want");
        int numbers = ui.nextInt();
        System.out.println("How many Special Characters do you want");
        int sCharacters = ui.nextInt();
        while (running) {
            if(change=true){
                change=false;
                System.out.println("How many Characters do you want");
                characters = ui.nextInt();
                System.out.println("How many Numbers do you want");
                numbers = ui.nextInt();
                System.out.println("How many Special Characters do you want");
                sCharacters = ui.nextInt();
            }
            String password = passGen(characters, numbers, sCharacters);
            if (passCheck(password)) {
                System.out.println("Your new password is " + password);
                System.out.println("Is this okay with you? (y/n)");
                String ask = ui.nextLine();
                if (ask.equals("y")) {
                    running = false;
                    System.out.println("Ok " + password + " is your new password");
                } else {
                    System.out.println("would you like to retry or change critira (retry/change");
                    ask = ui.nextLine();
                    if (ask.equals("change")) {
                        change = true;
                    }
                    else{
                        System.out.println("retrying");
                    }
                }
            }else{ 
            System.out.println("Failed check try again");            
            System.out.println("How many Characters do you want");
            characters = ui.nextInt();
            System.out.println("How many Numbers do you want");
            numbers = ui.nextInt();
            System.out.println("How many Special Characters do you want");
            sCharacters = ui.nextInt();}

        }
    }
    private static String passGen(int characters, int number, int sCharacters) {
        int length = characters + number + sCharacters;
        String out = "";
        String specialCharacters = "!@$%^&*()_-+={[}]|:;'<,>.?";
        while (length > 0) {
            int random = (int) (Math.random() * 3 + 1);
            if (random == 1 && characters > 0) {
                int temp = 0;
                int cap = (int) (Math.random() * 2);
                if (cap > 1) {
                    temp = (int) (Math.random() * 26 + 96);
                } else {
                    temp = (int) (Math.random() * 26 + 64);
                }
                out += (char) temp;
                // System.out.println((char) temp);
                characters--;
            } else if (random == 2 && number > 0) {
                int temp = (int) (Math.random() * 10);
                out += temp;
                // System.out.println(temp);
                number--;
            } else {
                int temp = (int) (Math.random() * specialCharacters.length());
                out += specialCharacters.substring(temp, temp + 1);
                // System.out.println(specialCharacters.substring(temp, temp + 1));
                sCharacters--;
            }
            length--;
        }
        return out;
    }
    private static boolean passCheck(String pass){
        if(pass.length()>=8){
            return true;
        }


        return false;
    }
}