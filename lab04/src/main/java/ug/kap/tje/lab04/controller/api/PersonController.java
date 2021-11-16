package ug.kap.tje.lab04.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ug.kap.tje.lab04.domain.Person;
import ug.kap.tje.lab04.service.PersonManager;

import java.util.List;

@RestController
public class PersonController {

    private final PersonManager personManager;

    public PersonController(@Autowired PersonManager personManager) { this.personManager = personManager; }

    @PostMapping("/api/person")
    Person addPerson(@RequestBody Person person) { return personManager.addPerson(person); }

    @GetMapping("/api/person")
    List<Person> getAll() { return personManager.getAllPersons(); }

    @GetMapping("/api/person/{id}")
    Person getPerson(@PathVariable String id) { return personManager.getPerson(id); }

    @PutMapping("/api/person/{id}")
    Person updatePerson(@PathVariable String id, @RequestBody Person person) { return personManager.updatePerson(id, person); }

    @DeleteMapping("/api/person/{id}")
    boolean removePerson(@PathVariable String id) { return personManager.removePerson(id); }
}
