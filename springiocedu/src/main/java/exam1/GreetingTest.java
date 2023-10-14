package exam1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.time.LocalDateTime;

public class GreetingTest {
    public static void main(String[] args) {
        ApplicationContext factory
                = new ClassPathXmlApplicationContext("exam1.xml");
        Greeting mo = (Greeting) factory.getBean("morning");
        Greeting af = (Greeting) factory.getBean("afternoon");
        Greeting ev = (Greeting) factory.getBean("evening");
        Greeting ni = (Greeting) factory.getBean("night");

        LocalDateTime currentDateTime = (LocalDateTime) factory.getBean("currentDateTime");
        String hour = currentDateTime.toString().substring(11, 13);

        if (Integer.parseInt(hour) >= 6 && Integer.parseInt(hour) <= 12) {
            mo.greet();
        } else if (Integer.parseInt(hour) > 12 && Integer.parseInt(hour) <= 17) {
            af.greet();
        } else if (Integer.parseInt(hour) >= 17 && Integer.parseInt(hour) <= 22) {
            ev.greet();
        } else {
            ni.greet();
        }
    }
}