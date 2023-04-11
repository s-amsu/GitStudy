package method_overriding;

public class B extends A {
    //display()
    @Override
    void display(){
        super.display();
        System.out.println("Inside B class");

    }

    }

