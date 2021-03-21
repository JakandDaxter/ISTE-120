public class Seafood {

    private String seafoodtype;
    private double weight;
    private double costPerPound;
    private final double CONVERSION = .0625;
    private final double MARKUP = 1.4;

    public Seafood(String seafoodtype, double weight, double costPerPound) {
        this.seafoodtype = seafoodtype;
        this.weight = weight;
        this.costPerPound = costPerPound;
    }

    public Seafood() {
        this.seafoodtype = "Unknown";
        this.weight = 0.0;
        this.costPerPound = 0.0;
    }


    public String getSeafoodtype() {
        return seafoodtype;
    }

    public void setSeafoodtype(String seafoodtype) {
        this.seafoodtype = seafoodtype;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCostPerPound() {
        return costPerPound;
    }

    public void setCostPerPound(double costPerPound) {
        this.costPerPound = costPerPound;
    }

    public double sellingPrice(){
        if(weight <= 0){
            return -999.0;
        }
        else{
            return (weight * CONVERSION) * costPerPound * MARKUP;
        }
    }

}
