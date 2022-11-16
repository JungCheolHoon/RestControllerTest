package kr.kwangan2.rest.person.domain;

import lombok.Data;

@Data
public class Person {
	private int pid;
	private String pname;
	private String page;
	
	public Person() {
		this.page = "1";
		this.pname = "2";
	}
}
