public class Character {
    // attributes nouns and adjectves
    // 1. any and all constrouctors
    String name;
    int age;
    String school;
    boolean drive;

    // 2. any and all constructors
    public Character() {
    } // no-arg constructor
    // 3. any and all methods

    public Character(String n) {
        this.name = n;
    }

    public Character(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public Character(String n, int a, String s, boolean d) {
        this.name = n;
        this.age = a;
        this.school = s;
        this.drive = d;
    }
    // methods = verbs
    @Override
    public String toString() {return this.name;}
}
