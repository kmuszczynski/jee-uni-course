package ug.kap.tje.lab04.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ug.kap.tje.lab04.domain.Person;

@Component
public class PersonManagerService {

    private final Person prezes;
    private final Person wiceprezes;
    private final Person sekretarka;

    public PersonManagerService(@Autowired @Qualifier("prezes") Person prezes,
            @Autowired @Qualifier("wiceprezes") Person wiceprezes,
            @Autowired @Qualifier("sekretarka") Person sekretarka)
    {
        System.out.println("Service creates prezes, wice, and sekretarka");
        this.prezes = prezes;
        this.wiceprezes = wiceprezes;
        this.sekretarka = sekretarka;
    }

    public Person getPrezes() {
        System.out.println("Service returns prezes");
        return prezes;
    }

    public Person getWiceprezes() {
        System.out.println("Service returns wiceprezes");
        return wiceprezes;
    }

    public Person getSekretarka() {
        System.out.println("Service returns sekretarka");
        return sekretarka;
    }
}
