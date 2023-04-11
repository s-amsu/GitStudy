package practice;

public class ReverseStringExample {
    public static void main(String[] args) {
        String str = "The quick brown fox";
        String rstr = "";
        char ch;
        for(int i = 0;i<str.length();i++){
            ch = str.charAt(i);
            rstr = ch + rstr;

        }
        System.out.println("Reverse string: " + rstr);
    }
}
