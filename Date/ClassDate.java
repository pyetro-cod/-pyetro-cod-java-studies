package Date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClassDate {
    public static void main(String[] args) {

        var date = new Date();
        System.out.println(date);

        DateFormat format = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss");
        System.out.println(format.format(date));
    }
}
