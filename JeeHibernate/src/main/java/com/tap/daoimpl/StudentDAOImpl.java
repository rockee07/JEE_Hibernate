package com.tap.daoimpl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tap.dao.StudentDAO;
import com.tap.entity.Student;

public class StudentDAOImpl implements StudentDAO {
	Session session=null;
	
	public StudentDAOImpl() {
		session = new Configuration().
				configure().
				addAnnotatedClass(Student.class).
				buildSessionFactory().openSession();
				
	}

	@Override
	public int add(Student s) {
		Transaction t = session.beginTransaction();
		session.persist(s);
		t.commit();
		return 1;
	}

	public Student fetch(String email) {
        try {
            String hql = "FROM Student WHERE email = :email";  // Query to fetch by email
            Query query = session.createQuery(hql);
            query.setParameter("email", email);  // Set email parameter
            return (Student) query.uniqueResult();  // Fetch the student with the given email
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
	

}
