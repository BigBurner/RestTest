package com.rushi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rushi.repos.PersonRepository;

@RestController
public class PersonController {

	@Autowired
	PersonRepository personRepository;
	
    @RequestMapping("/person")
    public Iterable<Person> greeting(@RequestParam(value="name", defaultValue="World") String name) {
    	Person p = new Person();
    	p.setFirstName("Rushi");
    	p.setLastName("Jukar");
    	personRepository.save(p);
    	return personRepository.findAll();
//        return new Greeting(counter.incrementAndGet(),
//                            String.format(template, name));
    }

}
