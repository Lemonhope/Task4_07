package Task4_07;

public class Plane extends Vehicle{
    private double height;
    private int passengerNum;

    public Plane() {
        this.price = 15000;
        this.speed = 200;
        this.year = 1999;
        this.height = 10.5;
        this.passengerNum = 100;
    }

    public Plane(int price, double speed, int year, double height, int passengerNum) {
        this.price = price;
        this.speed = speed;
        this.year = year;
        this.height = height;
        this.passengerNum = passengerNum;
    }

    public String showInfo() {
        return "\n-----Plane-----" +
                "\nheight=" + height +
                ", \npassengerNum=" + passengerNum +
                ", \nprice=" + price +
                ", \nspeed=" + speed +
                ", \nyear=" + year;
    }
}
