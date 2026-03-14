package com.fsad;

import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class StudentDAO {

    public void addStudent(Student s) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        session.save(s);

        tx.commit();
        session.close();
    }

    public List<Student> getStudents() {

        Session session = HibernateUtil.getSessionFactory().openSession();

        List<Student> list = session.createQuery("from Student").list();

        session.close();

        return list;
    }
}
