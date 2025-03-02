package Q_03;
import javax.print.DocFlavor;
import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        String FirstName;
        String MiddleName;
        String LastName;
        System.out.println("Enter your Firstname:");
        FirstName=Scanner.next();
        System.out.println("Enter your Middlename:");
        MiddleName=Scanner.next();
        System.out.println("Enter your Last Name:");
        LastName=Scanner.next();
        char[]middle=MiddleName.toUpperCase().toCharArray();
        String fullname=FirstName+" "+middle[0]+" "+LastName;
        System.out.println(fullname);

    }



}
