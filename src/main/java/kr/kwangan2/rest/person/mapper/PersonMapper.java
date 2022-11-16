package kr.kwangan2.rest.person.mapper;

import java.util.List;

import kr.kwangan2.rest.person.domain.Person;

public interface PersonMapper {

	public List<Person> personVOList();
	
	public int insertPersonVO(Person person);
	
	public Person selectPersonVO(int pid);
	
	public int deletePersonVO(int pid);
	
	public int updatePersonVO(Person person);
	
}
