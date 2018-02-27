package com.hibernate.demo;

import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Author {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id ;
    @Column(name = "First")
    private String firstName ;
    @Column(name = "Last")
    private String lastName ;
    @Column(name = "Age")
    private Integer age;
    @Column(name = "Tareekh")
    private String date;
    @ElementCollection
    private List < String > subjects = new ArrayList<>();
    @ManyToMany @org.hibernate.annotations.Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List <Book> list ;


    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }


    public Author(String firstName, String lastName, Integer age, String date, List<String> subjects, List<Book> list, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.date = date;
        this.subjects = subjects;
        this.list = list;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", date='" + date + '\'' +
                ", subjects=" + subjects +
                ", list=" + list +
                ", address=" + address +
                '}';
    }

    public List<Book> getList() {
        return list;
    }

    public void setList(List<Book> list) {
        this.list = list;
    }

    private Address address;
    public Author() {

    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
