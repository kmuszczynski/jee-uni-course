package ug.kap.tje.lab04.service;

import ug.kap.tje.lab04.domain.Person;

import java.util.List;

public interface PersonManager {

    Person addPerson(Person person);
    Person getPerson(String id);
    Person updatePerson(String id, Person person);
    Person removePerson(Person person);
    List<Person> getAllPersons();
}
