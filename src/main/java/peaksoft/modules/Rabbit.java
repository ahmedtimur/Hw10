package peaksoft.modules;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import peaksoft.interfaces.Animal;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Component
public class Rabbit implements Animal {

    @Value("${rabbit.name}")
    private String name;

    @Value("${rabbit.breed}")
    private String breed;

    @Value("${rabbit.age}")
    private int age;

    @Override
    public void animalPlus() {
        System.out.println("RABBIT...PLUS METHOD");
    }

    @Override
    public void animalMinus() {
        System.out.println("RABBIT...MINUS METHOD");
    }
}
