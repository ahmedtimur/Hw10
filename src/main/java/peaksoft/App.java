package peaksoft;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import peaksoft.config.Configs;
import peaksoft.interfaces.Animal;
import peaksoft.modules.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Configs.class);

        Animal animal = context.getBean("cat", Animal.class);
        System.out.println(animal);

        Animal animal1 = context.getBean("rabbit", Animal.class);
        System.out.println(animal1);

        context.close();
    }
}
