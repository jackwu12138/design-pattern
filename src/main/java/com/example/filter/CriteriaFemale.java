package com.example.filter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author jackwu
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream().filter(item -> "FEMALE".equalsIgnoreCase(item.getGender()))
            .collect(Collectors.toList());
    }
}
