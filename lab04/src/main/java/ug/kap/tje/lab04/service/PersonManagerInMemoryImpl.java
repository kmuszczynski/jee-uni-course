package ug.kap.tje.lab04.service;

import org.springframework.stereotype.Service;
import ug.kap.tje.lab04.domain.Person;

import java.util.*;

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
        Person personToFetch = null;

        for (int i = 0; i < db.size(); i++) {
            if (Objects.equals(db.get(i).getId(), id)) {
                personToFetch = db.get(i);
            }
        }

        return personToFetch;
    }

    @Override
    public Person updatePerson(String id, Person person) {
        Person personToUpdate = new Person(id, person.getFirstName(), person.getLastName(), person.getEmail(), person.getCompanyName());
        int indexToUpdate = -1;
        for (int i = 0; i < db.size(); i++) {
            if (Objects.equals(db.get(i).getId(), id)) {
                indexToUpdate = i;
            }
        }
        if (indexToUpdate != -1) {
            db.remove(indexToUpdate);
            db.add(personToUpdate);
        }
        return personToUpdate;
    }

    @Override
    public boolean removePerson(String id) {
        int indexToRemove = -1;
        for (int i = 0; i < db.size(); i++) {
            if (Objects.equals(db.get(i).getId(), id)) {
                indexToRemove = i;
            }
        }
        if (indexToRemove != -1) {
            db.remove(indexToRemove);
            return true;
        } else {
            return false;
        }

    }

    @Override
    public List<Person> getAllPersons() {
        return db;
    }
}
