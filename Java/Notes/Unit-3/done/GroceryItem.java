public class GroceryItem {
    private String name;
    private double cost;
    public GroceryItem(String name, double cost){
        this.name = name;
        this.cost=cost;

    }
    public String getName() {
        return this.name;
    }

    public double getCost() {
        return this.cost;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public void setCost(double Name) {
        this.cost = Name;
    }


    @Override
    public String toString() {
        return this.name + " cost: " + String.valueOf(this.cost);

    
}
}