public class Car {
    private int maxSpeed;
    private String name;
    private CarType carType;

    public Car(int maxSpeed, String name, CarType carType) {
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.carType = carType;
    }

    public void p1(){
        carType.getValue();
    }
}