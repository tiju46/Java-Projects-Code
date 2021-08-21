import java.text.SimpleDateFormat;
import java.util.Date;

import static com.sun.tools.javac.util.Constants.format;

public class DataandTime {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Current date and time = " +date);

        SimpleDateFormat format = new SimpleDateFormat("hh.mm a");
        String time = format.format(date);
        System.out.println(time);
    }

}
