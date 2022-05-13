package peaksoft.modules;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import peaksoft.interfaces.Animal;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@NoArgsConstructor
@Getter @Setter
@ToString
@Component
public class Cat implements Animal {

    @Value("${cat.name}")
    private String name;

    @Value("${cat.breed}")
    private String breed;

    @Value("${cat.age}")
    private int age;

    @Override
    @PostConstruct
    public void animalPlus() {
        System.out.println("CAT...PLUS METHOD");
    }

    @Override
    @PreDestroy
    public void animalMinus() {
        System.out.println("CAT...MINUS METHOD");
    }
}
