package Task4_07;

public class Car extends Vehicle{
    public Car() {
        this.price = 20000;
        this.speed = 140;
        this.year = 2023;
    }
    public Car(int price, double speed, int year) {
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public String showInfo() {
        return "\n-----Car-----" +
                "\nprice=" + price +
                ", \nspeed=" + speed +
                ", \nyear=" + year;
    }
}
