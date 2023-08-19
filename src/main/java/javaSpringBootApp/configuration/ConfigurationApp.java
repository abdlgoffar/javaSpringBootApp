package javaSpringBootApp.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//contoh cara memasukkan bean atau component ke dalam container spring boot application
@Configuration
@ComponentScan(
        basePackages = {
                "javaSpringBootApp.components"
        }
)
public class ConfigurationApp {
}
