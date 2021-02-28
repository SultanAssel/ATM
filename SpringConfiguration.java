package models;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;
@Configuration
@ComponentScan("models")
@PropertySource("application.properties")

public class SpringConfiguration {
}
