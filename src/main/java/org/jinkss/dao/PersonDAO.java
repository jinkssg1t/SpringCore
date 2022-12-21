package org.jinkss.dao;

import org.jinkss.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {

    private static int COUNTER;
    private List<Person> people;

    {
        people = new ArrayList<>();
        people.add(new Person(++COUNTER, "Tom"));
        people.add(new Person(++COUNTER, "Mike"));
        people.add(new Person(++COUNTER, "Bob"));
        people.add(new Person(++COUNTER, "Lisa"));
    }

        public List<Person> index(){
            return people;
        }

        public Person show(int id){
        return  people.stream().filter(person -> person.getId()==id).findAny().orElse(null);
        }


}
