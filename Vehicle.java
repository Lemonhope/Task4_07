package Task4_07;

public class Vehicle {
    protected int price;
    protected double speed;
    protected int year;

    public String showInfo() {
        return "\n-----Car-----" +
                "\nprice=" + price +
                ", \nspeed=" + speed +
                ", \nyear=" + year;
    }
}
