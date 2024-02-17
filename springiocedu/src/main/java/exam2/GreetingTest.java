package exam2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import sampleanno3.Car;

import java.time.LocalDateTime;

public class GreetingTest {
    public static void main(String[] args) {
        ApplicationContext factory
                = new ClassPathXmlApplicationContext("exam2.xml");
        Greeting morning=factory.getBean("morning", MorningGreetingImpl.class);
       Greeting afternoon = factory.getBean("afternoon", AfternoonGreetingImpl.class);
        Greeting evening = factory.getBean("evening", EveningGreetingImpl.class);
        Greeting night = factory.getBean("night", NightGreetingImpl.class);

        LocalDateTime currentDateTime = (LocalDateTime) factory.getBean("currentDateTime");
        String hour = currentDateTime.toString().substring(11, 13);

        if (Integer.parseInt(hour) >= 6 && Integer.parseInt(hour) <= 12) {
            morning.greet();
        } else if (Integer.parseInt(hour) > 12 && Integer.parseInt(hour) <= 17) {
            afternoon.greet();
        } else if (Integer.parseInt(hour) >= 17 && Integer.parseInt(hour) <= 22) {
            evening.greet();
        } else {
            night.greet();
        }
    }
}