package ug.kap.tje.lab04.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ug.kap.tje.lab04.domain.Person;

@Configuration
public class MyAppConfig {

    @Bean
    @Qualifier("prezes")
    public Person createPrezes(){
        System.out.println("Creating bean prezes");
        return new Person("Chrystal", "Havoc", "chavocr@yahoo.com", "Mymm");
    }

    @Bean
    @Qualifier("wiceprezes")
    public Person createWiceprezes(){
        System.out.println("Creating bean wiceprezes");
        return new Person("Halley", "Gadaud", "hgadaud9@sohu.com", "Oyope");
    }

    @Bean
    @Qualifier("sekretarka")
    public Person createSekretarka(){
        System.out.println("Creating bean sekretarka");
        return new Person("Kirbie", "Wrettum", "kwrettumj@slideshare.net","Browsertype");
    }
}
