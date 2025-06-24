package day16;

public class Car {
    private String brandCar;
    private String modelCar;
    private int yearOfCar;
    private double milesPerGallon;
    private double milesDriven;
    private double fuelCapacity;
    private double fuelRemaining;

    //constructor

    public Car(String brandCar, String modelCar, int yearOfCar, double milesPerGallon, double milesDriven, double fuelCapacity, double fuelRemaining) {
        this.brandCar = brandCar;
        this.modelCar = modelCar;
        this.yearOfCar = yearOfCar;
        this.milesPerGallon = milesPerGallon;
        this.milesDriven = milesDriven;
        this.fuelCapacity = fuelCapacity;
        this.fuelRemaining = fuelRemaining;
    }

    public Car() {
    }

    public Car(String modelCar) {
        this.modelCar = modelCar;
    }
    //    public Car(String make, String model, int year, double mpg, double milesDriven, double fuelCapacity, double fuelRemaining) {
//        this.brandCar = make;
//        this.modelCar = model;
//        this.yearOfCar = year;
//        this.milesPerGallon = mpg;
//        this.milesDriven = milesDriven;
//        this.fuelCapacity = fuelCapacity;
//        this.fuelRemaining = fuelRemaining;
//    }


    public void fillTank(double g) {
        if (g < 0) return;
        fuelRemaining += g;
        if (fuelRemaining > fuelCapacity) {
            fuelRemaining = fuelCapacity;
        }
    }

    public void drive(double m) {
        double usedGallon = m/milesPerGallon;
        if(fuelRemaining >= usedGallon ){
            milesDriven += m;
            fuelRemaining -= usedGallon;
        }
    }

    //anytime when you need to String format of Car's information, call toString
    //but it's called automatically when you print the object of Car


    @Override
    public String toString() {
        return "Car{" +
                "brandCar='" + brandCar + '\'' +
                ", modelCar='" + modelCar + '\'' +
                ", yearOfCar=" + yearOfCar +
                ", milesPerGallon=" + milesPerGallon +
                ", milesDriven=" + milesDriven +
                ", fuelCapacity=" + fuelCapacity +
                ", fuelRemaining=" + fuelRemaining +
                '}';
    }

    public double getFuelRemaining() {
        return fuelRemaining ;
    }

    //method overloading
    //different amount,type,order
    public void test1(){
        System.out.println("test1 with no parameter");
    }
    public void test1(int x){
        System.out.println("test1 with 1 int parameter:"+x);
    }
    public void test1(String x){
        System.out.println("test1 with 1 String parameter:"+x);
    }
    public void test1(int x,String y){
        System.out.println("test1 with 2 parameters:"+x+","+y);
    }
    public void test1(String x,int y){
        System.out.println("test1 with 2 parameters:"+x+","+y);
    }
}
