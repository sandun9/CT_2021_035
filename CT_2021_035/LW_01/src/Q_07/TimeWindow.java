package Q_07;
import javax.swing.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class TimeWindow {
    public static void main(String[] args) {
        LocalTime currentTime=LocalTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("hh:mm:ss a");
        String formattime=currentTime.format(formatter);
        JFrame timeWindow=new JFrame();
        timeWindow.setSize(400,500);
        timeWindow.setTitle(formattime);
        timeWindow.setVisible(true);

    }

}
