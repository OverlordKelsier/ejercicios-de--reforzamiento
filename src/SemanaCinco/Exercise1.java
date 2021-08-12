/*
Show two ways to concatenate the following two strings together to get the string "Hi, mom.":
String hi = "Hi, ";
String mom = "mom.";
 */
public class Exercise1 {
    public static void main(String[] args) {
        String hi = "Hi, ";
        String mom = "mom.";
        System.out.println(hi.concat(mom));
        System.out.println(hi + mom);
    }


}