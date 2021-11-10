package ug.kap.tje.lab04.service;

import org.springframework.stereotype.Service;
import ug.kap.tje.lab04.domain.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@Service
public class PersonManagerInMemoryImpl implements PersonManager{
    List<Person> db = new ArrayList<>();

    @Override
    public Person addPerson(Person person) {
        Person personToAdd = new Person(UUID.randomUUID().toString(), person.getFirstName(), person.getLastName(), person.getEmail(), person.getCompanyName());
        db.add(personToAdd);
        return personToAdd;
    }

    @Override
    public Person getPerson(String id) {
        Iterator<Person> iterator = db.iterator();
        Person personToFetch = null;
        while(iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getId() == id) {
                personToFetch = person;
            }
        }
        return personToFetch;
    }

    @Override
    public Person updatePerson(String id, Person person) {
        Person personToUpdate = new Person(id, person.getFirstName(), person.getLastName(), person.getEmail(), person.getCompanyName());
        for (int i = 0; i < db.size(); i++) {
            if (db.get(i).getId() == id ) {
                db.remove(i);
                db.add(personToUpdate);
            }
        }
        return personToUpdate;
    }

    @Override
    public Person removePerson(Person person) {
        db.remove(person);
        return person;
    }

    @Override
    public List<Person> getAllPersons() {
        return db;
    }
}
