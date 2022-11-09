import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.File;

public class BufferWriter {
    private static final String DATA_FILE = "myMedia.txt";
    private static Scanner in;
    private static BufferedWriter out;

    public static void writeString(String s) {

        if (out == null) {
            try {
                out = new BufferedWriter(new FileWriter(DATA_FILE));
            } catch (Exception e) {
                System.out.println("Cant open file: ");
                e.printStackTrace();
            }
            try {
                out.write(s);
                out.close();
                // out.flush();
            } catch (Exception e) {
                System.out.println("Cant write to file: ");
                e.printStackTrace();
            }
        }

    }

    public static void saveAndClose() {
        if(in!=null){
            try{
                in.close();
                in = null;
            }catch (Exception e){
                System.out.println("Cant close file: ");
                e.printStackTrace();
    
        }
        }
        if (out!= null) {
            try {
                out.close();
                out= null;
            } catch (Exception e) {
                System.out.println("Cant close file: ");
                e.printStackTrace();
            }
        }


    }

    public static String readString() {
        if (in==null){
        try {
            in = new Scanner(new File(DATA_FILE));
        } catch (Exception e) {
            System.out.println("Cant close file: ");
            e.printStackTrace();}

        }
        try {
            if(in.hasNext()) {
                String s = in.nextLine();
                return s;
            }
        }catch(Exception e){
            System.out.println("Cant read from file: ");
            e.printStackTrace();

        }
        
        return null;

    }
}
