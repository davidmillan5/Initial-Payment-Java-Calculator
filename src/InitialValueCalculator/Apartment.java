package InitialValueCalculator;

public class Apartment extends Properties{

    private Double measure;
    private int rooms;
    private Boolean hasBalcony;
    private int restrooms;
    private int floor;

    public Apartment() {
    }


    public Apartment(int id, String projectName, String location, Double price, int months, String builder, Double measure, int rooms, Boolean hasBalcony, int restrooms, int floor) {
        super(id, projectName, location, price, months, builder);
        this.measure = measure;
        this.rooms = rooms;
        this.hasBalcony = hasBalcony;
        this.restrooms = restrooms;
        this.floor = floor;
    }

    public Double getMeasure() {
        return measure;
    }

    public void setMeasure(Double measure) {
        this.measure = measure;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public Boolean getHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(Boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public int getRestrooms() {
        return restrooms;
    }

    public void setRestrooms(int restrooms) {
        this.restrooms = restrooms;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
