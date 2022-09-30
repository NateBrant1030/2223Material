public class Songs {
    String name;
    String artist;
    public Songs(String artist,String name){
        this.artist = artist;
        this.name = name;
    }
    
    @Override
    public String toString() {return this.name+" by "+this.artist;}
}
