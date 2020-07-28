package com.github.curriculeon;
import java.util.*;

abstract public class People<E extends Person> implements Iterable<E>{
    List<E> personList;

    public People(){
        this.personList = new ArrayList<E>(); //instantiate a field in constructor
    }

    public void add(E e){
        personList.add(e);
    }

    public E findById(long id){
        for(E p:personList){
            if(p.getId() == id)
                return p;
        }
        return null;
    }

    public Boolean contains(E person){
        return personList.contains(person);
    }

    public void remove(E person){
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

    abstract public E[] toArray();
//    public Person[] toArray(){
//        Person[] newArray = new Person[personList.size()]; //could not instantiate a generics type: E
//        return personList.toArray(newArray); //arrayList to array
//    }

    public Iterator<E> iterator(){
        return personList.iterator();
    }

}
