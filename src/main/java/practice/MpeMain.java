package practice;

public class MpeMain {
    public static void main (String[] args) {
        //Class_name>object_name = new > Class_name();
        MethodParameterExample mepObject  = new MethodParameterExample();
        int numbers = mepObject.AddNumbers(125,24);
        System.out.println(numbers);
    }
}
