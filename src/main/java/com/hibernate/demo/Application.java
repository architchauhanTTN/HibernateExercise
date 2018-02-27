package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List < Book > bookList = new ArrayList<>();
      //  List < Book > bookList1 = new ArrayList<>();
        Book book = new Book("RS AGRAWAL");
        bookList.add(book);
        Book book1 = new Book("JDYADAV");

        bookList.add(book1);

//        bookList1.add(new Book("RD SHARMA"));
//        bookList1.add(new Book("NandLal DayaRam"));
//        bookList1.add(new Book("ML KKHANNA"));

        List< String > list = new ArrayList<>();
        list.add("DS");
        list.add("ALGORITHMS");
        List < String > list1 = new ArrayList<>();
        list1.add("DBMS");
        list1.add("COA");
//        Author author = new Author("ABCD" , "IJKL" , 21 , "19-09-1987" ,  list , new Book("RS Agarwal") , new Address("Noida" , 122));
//        Author author1 = new Author("EFGH" , "MNOP" , 19 , "9-10-1999" , list1 , new Book("RD SHARMA") , new Address("Delhi" , 22));
        Author author = new Author("Akash" , "Gupta"  ,21 , "19-09-1999" ,  list ,bookList  ,  new Address("Noida" , 122));
        book.setAuthor(author);
        book1.setAuthor(author);
        session.save(book);
        session.save(book);
        session.save(book1);
        session.save(author);
//        session.save(author1);
//        session.save(author2);
//        session.save(author3);
//        session.save(author4);
//        Author readAuthor = session.get(Author.class , 1);
//        readAuthor.setFirstName("Karan");
//        session.update(readAuthor);
//        Author a = session.get(Author.class,1);
//
//        session.delete(a);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        System.out.println("TASK COMPLETED SUCCESSFULLY !! ! ! !!");
    }
}
