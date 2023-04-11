package practice;

public class LearnException {
    public void summation() {
        try {
            int[] num = {1, 2};
            int result = num[0] + num[1];
            System.out.println("Summation: " + result);
        } catch (Exception e) {
            System.out.println("Encountered Exception: " + e.getMessage());
        }
    }

    public void subtraction() {
        try {
            int[] num = {1, 2};
            int result = num[2] - num[1];
            System.out.println("Subtraction: " + result);
        } catch (Exception e) {
            System.out.println("Encountered Exception: " + e.getMessage());
        }
    }


    public void multiplication() {
        try {
            int[] num = {1, 2};
            int result = num[0] * num[1];
            System.out.println("Multiplication: " + result);
        } catch (Exception e) {
            System.out.println("Encountered Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        LearnException learnException = new LearnException();
       learnException.summation();
       learnException.subtraction();
       learnException.multiplication();
    }

    }






