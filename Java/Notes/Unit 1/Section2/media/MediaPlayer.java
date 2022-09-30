public class MediaPlayer {
    public static void main(String[] args){
        Songs c = new Songs("test","test");
        Songs s = new Songs("test","test");

        System.out.println(c.getRating());


        if(c.getName()==s.getName()){System.out.println("same");}else{System.out.println("Not same");}

    }

    
}
