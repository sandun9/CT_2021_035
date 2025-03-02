package Q_05;
import java.util.Date;
import java.text.SimpleDateFormat;


public class DayDissplay {
    public static void main(String[] args) {
        SimpleDateFormat formatter=new SimpleDateFormat("EEEE, d MMM,yyyy");
        Date today=new Date();
        System.out.println("Todsy's date :"+formatter.format(today)+".");


    }

}
