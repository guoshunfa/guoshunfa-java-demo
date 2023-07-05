package code8.service.impl;

import code8.entity.Person;
import code8.service.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @className: CriteriaSingle
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
