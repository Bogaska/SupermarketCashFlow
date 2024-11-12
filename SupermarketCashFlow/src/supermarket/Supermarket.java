package supermarket;

public class Supermarket {
    private String name;
    private String location;

    // Konstruktor
    public Supermarket(String name, String location) {
        this.name = name;
        this.location = location;
    }

    // Gettery i Settery
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
