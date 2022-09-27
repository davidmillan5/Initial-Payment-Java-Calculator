package InitialValueCalculator;

public class House extends Properties{
    private Double dimensions;
    private Boolean hasPool;
    private Boolean hasAccessRoad;
    private Boolean hasAmenities;
    private Boolean isResidential;

    public House() {
    }

    public House(int id, String projectName, String location, Double price, int months, String builder, Double dimensions, Boolean hasPool, Boolean hasAccessRoad, Boolean hasAmenities, Boolean isResidential) {
        super(id, projectName, location, price, months, builder);
        this.dimensions = dimensions;
        this.hasPool = hasPool;
        this.hasAccessRoad = hasAccessRoad;
        this.hasAmenities = hasAmenities;
        this.isResidential = isResidential;
    }

    public Double getDimensions() {
        return dimensions;
    }

    public void setDimensions(Double dimensions) {
        this.dimensions = dimensions;
    }

    public Boolean getHasPool() {
        return hasPool;
    }

    public void setHasPool(Boolean hasPool) {
        this.hasPool = hasPool;
    }

    public Boolean getHasAccessRoad() {
        return hasAccessRoad;
    }

    public void setHasAccessRoad(Boolean hasAccessRoad) {
        this.hasAccessRoad = hasAccessRoad;
    }

    public Boolean getHasAmenities() {
        return hasAmenities;
    }

    public void setHasAmenities(Boolean hasAmenities) {
        this.hasAmenities = hasAmenities;
    }

    public Boolean getResidential() {
        return isResidential;
    }

    public void setResidential(Boolean residential) {
        isResidential = residential;
    }
}
