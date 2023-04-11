package test;
import java.util.Arrays;
import java.util.Collections;

public class LearnArray {
    public void StringArray() {
        String list1 = "Florida";
        String list2 = "California";
        String list3 = "Georgia";
        String list4 = "Texas";
        //System.out.println(list2);

        String[] myList = {"Florida","California","Georgia","Texas"};
        //System.out.println(mylist[1]);

        for(int i=0; i<myList.length; i++)
        {
            System.out.println("State Name is; "+ myList[i]);
        }

    }
    public void sortArrayInDescendingOrder(){
        String[] states = {"Florida", "California", "Philadelphia", "Texas"};
        Arrays.sort(states, Collections.reverseOrder());
        System.out.println(Arrays.toString(states));
    }
}
