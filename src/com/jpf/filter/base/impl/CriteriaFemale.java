package com.jpf.filter.base.impl;

import java.util.ArrayList;
import java.util.List;

import com.jpf.filter.base.Criteria;
import com.jpf.filter.base.Person;

public class CriteriaFemale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> personList) {
		List<Person> femalePersons = new ArrayList<Person>();
		if(personList.isEmpty()) {
			return null;
		}
		for(Person person : personList) {
			if("FEMALE".equalsIgnoreCase(person.getGender())) {
				femalePersons.add(person);
			}
		}
		return femalePersons;
	}

}
