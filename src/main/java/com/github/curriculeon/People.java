package com.github.curriculeon;
import java.util.*;

public class People {
    private List<Person> personList = new ArrayList<Person>();

    public People(){
    }

    public void add(Person newPerson){
        personList.add(newPerson);
    }

    public Person findById(long id){
        for(Person p:personList){
            if(p.getId() == id)
                return p;
        }
        return null;
    }

    public Boolean contains(Person person){
        return personList.contains(person);
    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void remove(long id){
        personList.remove(findById(id));
    }

    public void removeAll(){
        personList.clear();
    }

    public int count(){
        return personList.size();
    }

    public Person[] toArray(){
        return (Person[]) personList.toArray();
    }

    public Iterator<Person> iterator(){
        return personList.iterator();
    }

}
