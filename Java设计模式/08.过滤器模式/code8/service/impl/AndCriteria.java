package code8.service.impl;

import code8.entity.Person;
import code8.service.Criteria;

import java.util.List;

/**
 * @className: AndCriteria
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
