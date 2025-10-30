package com.campusdual.classroom;



import java.util.ArrayList;
import java.util.List;

public class Exercise {

    public static List<Person> getPeopleList() {
        List<Person> people = new ArrayList<>();

        people.add(new Person("John", "Smith"));
        people.add(new Teacher("Maria", "Montessori", "Educacion"));
        people.add(new PoliceOfficer("Jake", "Peralta", "B-99"));
        people.add(new Doctor("Gregory", "House", "Nefrologia e infectologia"));

        return people;


    }

    public static void showPeopleDetails(List<Person> stringList) {
        for (Person person : stringList) {
            person.getDetails();
        }

    }

    public static void main(String[] args) {
        List<Person> stringList = getPeopleList();
        showPeopleDetails(stringList);
    }



}
