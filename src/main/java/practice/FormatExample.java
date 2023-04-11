package practice;

public class FormatExample {
    public static void main(String[] args) {
        String name = "Jonathan";
        int age = 20;
        int salary = 4000;
        String s = String.format("My name is %s and I am %d years old and my salary is $%d yearly", name, age, salary);
        System.out.println(s);

    }
}
