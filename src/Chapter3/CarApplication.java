package Chapter3;

public class CarApplication {
    public static void main(String[] args) {
        CarClass cars = new CarClass("bmv","2020",122.1);
        CarClass cars1 = new CarClass("xr2019","2019",2.3330000);
        System.out.printf("first car price %f%n second car price %f%n",cars.getPrice(),cars1.getPrice());

        double discount = cars.getPrice() -  0.05;
        double discount2 = cars1.getPrice()- 0.07;
        System.out.println(discount);
        System.out.println(discount2);


    }
}
