package practice;

public class StudentStaticMain {
    public static void main(String[] args) {

        StudentStatic studentStatic1 = new StudentStatic();
        StudentStatic studentStatic2 = new StudentStatic();

        System.out.println("student1 = " + studentStatic1.marks);
        System.out.println("student2 = " + studentStatic2.marks);

        System.out.println();

        studentStatic2.marks = 80;
        System.out.println("student1 = " + studentStatic1.marks);
        System.out.println("student2 = " + studentStatic2.marks);

        System.out.println();
      StudentStatic.age = 29;
        System.out.println("student1 = " + StudentStatic.age);
        System.out.println("student2 = " + StudentStatic.age);
    }
}
