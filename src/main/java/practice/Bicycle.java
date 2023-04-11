package practice;
//base class
public class Bicycle {
    // the Bicycle class has one Fields
    public int gear = 3;
    public int speed = 15;
    public Bicycle(){

    }
    // the Bicycle class has one constructor
    public Bicycle(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;

    }
    // the Bicycle class has three methods
    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }
    public void speedUp(int increment)
    {
        speed += increment;
    }
    // toString () method to print info of Bicycle
    public String toString()
    {
        return("No of gears are "+ gear + ", speed is "+ speed);
    }
}
