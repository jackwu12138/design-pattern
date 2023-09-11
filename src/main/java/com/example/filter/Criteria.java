package com.example.filter;

import java.util.List;

/**
 * @author jackwu
 */
public interface Criteria {

    List<Person> meetCriteria(List<Person> persons);
}
