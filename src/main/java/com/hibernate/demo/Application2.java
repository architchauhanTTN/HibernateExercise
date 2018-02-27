package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Application2 {

    public static void main(String[] args) {

        SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

//        Author author = new Author("Archit" , "Chauhan" , 23);
//        Author author1 = new Author("Pushkar" , "Katiyar" , 23);
//        Author author2 = new Author("Swapnil" , "Khanna" , 21);
//        Author author3 = new Author("Payal" , "Nigam" , 22);

        // CRUD OPerations

//        session.save(author);
//        session.save(author1);
//        session.save(author2);
//        session.save(author3);

//        session.getTransaction().commit();
       /* // READ
        Author readAuthor = session.get(Author.class , 1);
        System.out.println(readAuthor.toString());*/

        // UPDATE
        Author readAuthor = session.get(Author.class , 1);
        readAuthor.setFirstName("Karan");
        session.update(readAuthor);


        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        System.out.println("TASK COMPLETED SUCCESSFULLY !! ! ! !!");
    }
}
