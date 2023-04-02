package timer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimerTest {
    public static void main(String[] args) throws ParseException {
        String str = "2023/3/26 16:30:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date dat= sdf.parse(str);

    }
}
