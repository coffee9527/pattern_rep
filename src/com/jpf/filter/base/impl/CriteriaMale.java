package com.jpf.filter.base.impl;

import java.util.ArrayList;
import java.util.List;

import com.jpf.filter.base.Criteria;
import com.jpf.filter.base.Person;

public class CriteriaMale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> personList) {
		List<Person> malePersons = new ArrayList<Person>();
		if(personList.isEmpty()) {
			return null;
		}
		for(Person person : personList) {
			if("MALE".equalsIgnoreCase(person.getGender())) {
				malePersons.add(person);
			}
		}
		return malePersons;
	}

}
