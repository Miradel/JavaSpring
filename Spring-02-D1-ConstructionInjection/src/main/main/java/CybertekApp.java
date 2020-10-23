import interfaces.Mentor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.FullTimeMentor;

public class CybertekApp {

    public static void main(String[] args)  {

            BeanFactory container = new ClassPathXmlApplicationContext("config.xml");

        /*
        Usually we did with this way  , polymorphic way
         Mentor mentor = new FullTimeMentor();
         */

        Mentor mentor =(Mentor)container.getBean("fullTimeMentor");
        mentor.createAccount();

        Mentor mentor1 =(Mentor) container.getBean("partTimeMentor");
        // Mentor mentor1 =container.getBean("partTimeMentor",Mentor.class);
        mentor1.createAccount();

        ApplicationContext container2 = new ClassPathXmlApplicationContext("config.xml");
        Mentor mentor2 =(Mentor)container2.getBean("fullTimeMentor");
        mentor2.createAccount();

        Mentor mentor3 =container2.getBean("fullTimeMentor",Mentor.class);
        mentor2.createAccount();




    }

}
