package Q_10;
import java.util.*;


public class Midchar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Here:");
        String sentence= scan.next();
        System.out.println(sentence.charAt(sentence.length()/2));

    }
}
