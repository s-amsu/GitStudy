package practice;

import java.sql.SQLOutput;

public class ConditionalStatementExample {
    public void IfStatement() {
        int x = 30;

        if (x < 20) {
            System.out.println("This is If statement");
        } else {
            System.out.println("This is Else statement");
        }
    }

    public void NestedIfStatements() {
        int x = 30;
        int y = 18;
        if (x < 35) {
            if (y < 15) {
                System.out.println("X = " + x + " Y = " + y);
            }
        }
    }

    public void IfWithoutStatement() {
        char grade = 'C';
        if (grade == 'A')
            System.out.println("Excellent");
        if (grade == 'B')
            System.out.println("Well done");
        if (grade == 'C')
            System.out.println("Well done");
        if (grade == 'D')
            System.out.println("Passed");
        if (grade == 'F')
            System.out.println("Better try again");


        System.out.println("You grade is " + grade);
    }
    public void SwitchStatement() {
        char grade = 'C';
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
            case 'C':
                System.out.println("Well done");
                break;
            case 'D':
                System.out.println("You passed");
                break;
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid");
        }
        System.out.println("You grade is " + grade);
    }
    public void IfOperator(){
        int a, b;
        a = 10;
        if(a==1){
            b = 20;
        }
        else{
            b = 30;
        }
    }
    public void ConditionalOperator(){
        int a, b;
        a = 10;
        b = (a==1) ? 20 : 30;

    }

        }




