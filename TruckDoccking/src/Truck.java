public class Truck {

    // Truck represents
    private String type; 
    private double weight;

    //Constructur 
    public Truck(String type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    public String getType() {
        return type;               // returns type of Truck
    }

    public double getWeight() {
        return weight;            // returns weight of Truck
    }
}
