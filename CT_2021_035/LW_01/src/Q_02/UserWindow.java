package Q_02;
import java.util.*;
import javax.swing.*;


public class UserWindow {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        String Firstnane;
        String SecoundName;
        System.out.println("Enter First Name:");
        Firstnane=Scanner.next();
        System.out.println("Enter Your Secound Name:");
        SecoundName=Scanner.next();
        String FullName=Firstnane+"  "+SecoundName;
        JFrame window=new JFrame();
        window.setSize(800,600);
        window.setTitle(FullName);
        window.setVisible(true);
    }
}
