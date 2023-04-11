package practice;
//overloding in java
public class Sum {
    //overloaded sum().This sum takes two int parameters
    public int sum(int x, int y)
    {
        return (x + y);
    }
    //overloaded sum().This sum takes three int parameters
    public int sum(int x, int y, int z)
    {
        return (x + y + z);
    }
    //overloaded sum().This sum takes two double parameters
    public double sum(double x, double y)
    {
        return (x + y);
    }
     //driver code
    public static void main(String[] args) {
       Sum s = new Sum();
        System.out.println(s.sum(10, 20));
        System.out.println(s.sum(10, 20, 30));
        System.out.println(s.sum(10.5, 20.5));
    }
}
