package Entity;

public class Car {
    private String model;
    private int series;
    private String fuelForEngine;

    public Car() {

    }

    public Car(String model, int series, String fuelForEngine) {
        this.model = model;
        this.series = series;
        this.fuelForEngine = fuelForEngine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getFuelForEngine() {
        return fuelForEngine;
    }

    public void setFuelForEngine(String fuelForEngine) {
        this.fuelForEngine = fuelForEngine;
    }
}
