package practice;
import java.util.*;
public class ListToArrayExample {
    public static void main(String[] args) {
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Mango");
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        //Converting ArrayList to Array
        String[] array = fruitList.toArray(new String[fruitList.size()]);
        System.out.println("Println Array: " +Arrays.toString(array));
        System.out.println("Println list: " +fruitList);
    }
}

