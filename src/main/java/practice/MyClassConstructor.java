package practice;

public class MyClassConstructor {
    int a;
    int b;
    int c;
    int d;
    int e;
    //First constructor

   public MyClassConstructor(){
      a = 10;
      b = 17;
      c = 20;
      d = 25;
      e = 30;
    }
     // Second constructor
    public MyClassConstructor(int objectA, int objectB, int objectC, int objectD, int objectE){
       a = objectA;
       b = objectB;
       c = objectC;
       d = objectD;
       e = objectE;

    }



    public static void main(String[] args) {

        MyClassConstructor myObj1 = new MyClassConstructor();

        myObj1.a = 10;
        myObj1.b = 15;
        myObj1.c = 20;
        myObj1.d = 25;
        myObj1.e = 30;

        System.out.println("a = " + myObj1.a);
        System.out.println("b = " + myObj1.b);
        System.out.println("c = " + myObj1.c);
        System.out.println("d = " + myObj1.d);
        System.out.println("e = " + myObj1.e);



        MyClassConstructor myObj2 = new MyClassConstructor(101, 103, 119, 125, 137);
        System.out.println("myObj2 a = " + myObj2.a);
        System.out.println("myObj2 b = " + myObj2.b);
        System.out.println("myObj2 c = " + myObj2.c);
        System.out.println("myObj2 d = " + myObj2.d);
        System.out.println("myObj2 e = " + myObj2.e);

         MyClassConstructor myObj3 = new MyClassConstructor(219, 223, 225, 233, 243);
        System.out.println("myObj3 a = " + myObj3.a);
        System.out.println("myObj3 b = " + myObj3.b);
        System.out.println("myObj3 c = " + myObj3.c);
        System.out.println("myObj3 d = " + myObj3.d);
        System.out.println("myObj3 e = " + myObj3.e);
    }
}
