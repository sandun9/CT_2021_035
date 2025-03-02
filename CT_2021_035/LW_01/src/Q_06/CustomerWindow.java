package Q_06;
import java.util.*;
import javax.swing.*;

public class CustomerWindow {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String title;
        int Width;
        int Height;
        System.out.println("Enter your window title:");
        title=scanner.nextLine();
        System.out.println("Enter your window width:");
        Width=scanner.nextInt();
        System.out.println("Enter Window Height:");
        Height=scanner.nextInt();
        JFrame window=new JFrame();
        window.setSize(Width,Height);
        window.setTitle(title);
        window.setVisible(true);
    }
}
