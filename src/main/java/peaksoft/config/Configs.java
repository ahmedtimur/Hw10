package peaksoft.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("peaksoft")
@PropertySource("classpath:application.properties")
public class Configs {

}
