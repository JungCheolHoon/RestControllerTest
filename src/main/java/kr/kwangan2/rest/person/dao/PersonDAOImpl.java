package kr.kwangan2.rest.person.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.kwangan2.rest.person.Service.PersonService;
import kr.kwangan2.rest.person.domain.Person;
import kr.kwangan2.rest.person.mapper.PersonMapper;
import lombok.Setter;

@Service
public class PersonDAOImpl implements PersonService  {
	
	@Setter(onMethod_= @Autowired)
	private PersonMapper mapper;
	
	@Override
	public List<Person> personVOList() {
		return mapper.personVOList();
	}

	@Override
	public int insertPersonVO(Person person) {
		mapper.insertPersonVO(person);
		return 0;
	}

	@Override
	public Person selectPersonVO(int pid) {
		return mapper.selectPersonVO(pid);
	}

	@Override
	public int deletePersonVO(int pid) {
		return mapper.deletePersonVO(pid);
	}

	@Override
	public int updatePersonVO(Person person) {
		return mapper.updatePersonVO(person);
	}
}
