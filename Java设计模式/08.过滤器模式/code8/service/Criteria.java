package code8.service;

import code8.entity.Person;

import java.util.List;

/**
 * @className: Criteria
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
