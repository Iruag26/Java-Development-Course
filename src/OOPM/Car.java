package OOPM;

class Car {
    String color;
    String model;
    int engineCapacity;

    //non-parameterized constructor
    public Car(){

    }

    //parameterized constructor
    public Car(String c, int ec) {
        this.engineCapacity = ec;
        color = c;
    }
    void details(){
        System.out.println(color+ " "+engineCapacity);
    }

    int mileageCalculator(int endingOdometer, int startingOdometer, int fuelUsed) {
        return (endingOdometer - startingOdometer) / fuelUsed;
    }


}