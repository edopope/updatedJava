package Chapter3;

public class CarClass {
    private String model;
    private String year;
    private double price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public CarClass(String models, String years, double prices){
        this.model = models;
        this.year = years;
        this.price = prices;
    }

}
