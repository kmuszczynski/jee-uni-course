package ug.kap.tje.lab04.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
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

    @PostMapping("/api/person/id")
    Person getPerson(@RequestBody String id) { return personManager.getPerson(id); }

    @PostMapping("/api/person/update")
    Person updatePerson(@RequestBody String id, @RequestBody Person person) { return personManager.updatePerson(id, person); }

    @PostMapping("/api/person/remove")
    Person removePerson(@RequestBody Person person) { return personManager.removePerson(person); }
}
