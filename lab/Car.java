package lab;

public class Car {
	public String name;
    String model;
    private int year = 1999;

    public Car(String cName, String cModel) {
        name = cName;
        model = cModel;
    }

    public void setYear(int cYear) {
        year = cYear;
    }

    public void setName(String cName) {
        name = cName;
    }

    public void setModel(String cModel) {
        name = cModel;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    

    public void printCar() {
        System.out.println("name: " + name);
        System.out.println("model: " + model);
        System.out.println("year: " + year);
    }

    

    public static void main(String[] args) {
        Car car = new Car("car1", "sedan");

        System.out.println("car name " + car.name);
        System.out.println("car model " + car.model);
        System.out.println("car year " + car.year);

        car.printCar();

    }

}
