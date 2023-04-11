package practice;
// derived class
public class MountainBike extends Bicycle {
    //the MountainBike subclass adds one more field
    public int seatHeight = 17;
    //the MountainBike subclass has one constructor
    public MountainBike(int gear, int speed, int seatHeight)
    {
      this.gear = gear;
      this.speed = speed;
      this.seatHeight = seatHeight;

    }
    public void setSeatHeight(int newValue)
    {
        seatHeight = newValue;
    }
    public String toString()
    {
        return("No of gears are " + gear + " Speed is " + speed + ", Seat Height is " + seatHeight);
    }

}
