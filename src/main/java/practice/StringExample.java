package practice;

public class StringExample {
    public void indexOf(){
        String myStr = "Hello planet earth, you are a great planet.";
        System.out.println(myStr.indexOf("planet"));}

        public void showSubstring(){
            String str = "JavaPoint";
            String subStr = str.substring(2);
            System.out.println(subStr);



    }
    public void showSubstring1() {
        String str = "JavaPoint";
        String subStr = str.substring(0, 4);
        System.out.println(subStr);

        String emptyString = "";
    }
    public void showTrim(){
        String myStr = "    Hello World!   ";
        System.out.println(myStr);
        System.out.println(myStr.trim());

    }

}
