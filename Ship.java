package Task4_07;

public class Ship extends Vehicle{
    private int passengerNum;
    private String portName;

    public Ship(int price, double speed, int year, int passengerNum, String portName) {
        this.passengerNum = passengerNum;
        this.portName = portName;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public Ship() {
        this.passengerNum = 200;
        this.portName = "Odesa";
        this.price = 25000;
        this.speed = 140;
        this.year = 2000;
    }

    public String showInfo() {
        return "\n------Ship------" +
                "\npassengerNum=" + passengerNum +
                ", \nportName='" + portName + '\'' +
                ", \nprice=" + price +
                ", \nspeed=" + speed +
                ", \nyear=" + year;
    }
}
