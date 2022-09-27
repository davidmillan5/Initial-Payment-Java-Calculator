package InitialValueCalculator;

public class Land extends Properties{
    private Double squareFeet;
    private Double lotSize;
    private String specialFeatures;

    public Land() {
    }

    public Land(int id, String projectName, String location, Double price, int months, String builder, Double squareFeet, Double lotSize, String specialFeatures) {
        super(id, projectName, location, price, months, builder);
        this.squareFeet = squareFeet;
        this.lotSize = lotSize;
        this.specialFeatures = specialFeatures;
    }

    public Double getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(Double squareFeet) {
        this.squareFeet = squareFeet;
    }

    public Double getLotSize() {
        return lotSize;
    }

    public void setLotSize(Double lotSize) {
        this.lotSize = lotSize;
    }

    public String getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }
}
