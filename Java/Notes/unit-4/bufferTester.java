import java.util.ArrayList;
import java.io.File;
public class bufferTester{
    public static void main(String[] args){
        BufferWriter.writeString("hello");
        BufferWriter.saveAndClose();
        System.out.println(BufferWriter.readString());


    }
}