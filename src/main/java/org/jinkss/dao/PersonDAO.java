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
        people.add(new Person(++COUNTER, "Tom", 20, "tommark@yahoo.us"));
        people.add(new Person(++COUNTER, "Mike", 19, "mikesome1@yahoo.us"));
        people.add(new Person(++COUNTER, "Bob", 22, "checkbob@gmail.com"));
        people.add(new Person(++COUNTER, "Lisa", 27, "lisaanderson@azure.com"));
    }

        public List<Person> index(){
            return people;
        }

        public Person show(int id){
        return  people.stream().filter(person -> person.getId()==id).findAny().orElse(null);
        }

        public void save(Person person){
            person.setId(++COUNTER);
            people.add(person);
        }
        public void update(int id, Person updatedPerson){
        Person personToUpdate = show(id);

        personToUpdate.setName(updatedPerson.getName());
        personToUpdate.setAge(updatedPerson.getAge());
        personToUpdate.setEmail(updatedPerson.getEmail());
        }

        public void delete(int id){
        Person toDelete = show(id);

        people.remove(toDelete);
        }


}
