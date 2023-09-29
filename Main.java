// Створіть проект з класом Main.java.
//Створити клас Vehicle. У тілі класу створіть поля: координати та параметри суден (ціна, швидкість, рік випуску).
// Створіть 3 похідних класи Plane, Саг та Ship. Для класу Plane має бути визначена висота та кількість пасажирів.
// Для класу Ship – кількість пасажирів та порт приписки.
// Написати програму, яка виводить на екран інформацію про кожен засіб пересування.
package Task4_07;

public class Main {
    public static void main(String[] args) {
        Car myCar=new Car(12000, 100.9, 1880);
        System.out.println(myCar.showInfo());
        Plane myPlane=new Plane();
        System.out.println(myPlane.showInfo());
        Ship myShip=new Ship();
        System.out.println(myShip.showInfo());
    }
}
