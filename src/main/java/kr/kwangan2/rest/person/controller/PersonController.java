package kr.kwangan2.rest.person.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.kwangan2.rest.person.Service.PersonService;
import kr.kwangan2.rest.person.domain.Person;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RestController
@Log4j
public class PersonController {

	@Setter(onMethod_ = @Autowired)
	private PersonService personService;

	@GetMapping(value="/person",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public List<Person> PersonVOList() {
		List list = personService.personVOList();
		log.info("@@@list@@@"+list);
		return list;
	}
	
	@GetMapping(value="/person/1")
	public Person personVOSelect(int pid) {
		return personService.selectPersonVO(pid);
	}
	
	@PostMapping(value="/person/insert")
	public String personVOInsert(Person person) {
		personService.insertPersonVO(person);
		return "Insert success!";
	}
	
	@PutMapping("/person/5")
	public String personVOUpdate(Person person) {
		personService.updatePersonVO(person);
		return "Update success!";
	}
	
	@DeleteMapping("/person/5")
	public String personVODelete(int pid) {
		personService.deletePersonVO(pid);
		return "Delete success!";
	}
}
