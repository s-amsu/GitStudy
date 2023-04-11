package practice;

public class SplitArrayExample {
    public static void main(String[] args) {
        String name = "John,Ali,Mathew,Abrham";
        String[] nameArray = name.split(",");
        for(String person: nameArray) {
            System.out.println("Person name is: " + person);
        }
        String sentence = "I live in NewYork";
        String[] words = sentence.split(" ");
        for(String word: words){
            System.out.println("Word is: " + word);
        }
        String reverse = "";
        for(int i = words.length -1; i >=0;i--){
            reverse += words[i] + " ";
        }
        System.out.println("Sentence is: " + reverse);


        String[] reverseWords = reverse.split(" ");
        System.out.println("5");

    }
}
