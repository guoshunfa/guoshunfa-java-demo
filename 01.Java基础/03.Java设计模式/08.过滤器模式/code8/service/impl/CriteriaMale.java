package code8.service.impl;

import code8.entity.Person;
import code8.service.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @className: CriteriaMale
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
