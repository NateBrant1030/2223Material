public class Songs {
    private String name, artist;
    double rating;

    // classes or constructors
    public Songs() {
        this.name = "none found";
        this.artist = "none found";
    }

    public Songs(String artist, String name) {
        this.artist = artist;
        this.name = name;
    }

    public Songs(String artist, String name, double rating) {
        this.artist = artist;
        this.name = name;
        this.rating = rating;
    }

    // getters and setters
    // accessors and mutators
    public String getName() {
        return this.name;
    }

    public String getArtist() {
        return this.artist;
    }

    public double getRating() {
        return this.rating;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public void setArtist(String Name) {
        this.artist = Name;
    }

    public void setRating(double Name) {
        this.rating = Name;
    }

    
    @Override
    public String toString() {
        return this.name + " by " + this.artist;

    @Override
    public boolean equals(Object o){
        if(o.getName().equals(this.name)){return true;}else{return false;}
 } }
