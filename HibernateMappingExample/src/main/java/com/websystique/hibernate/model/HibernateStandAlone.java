package com.websystique.hibernate.model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.websystique.hibernate.model.Student;
import com.websystique.hibernate.model.University;

public class HibernateStandAlone {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Student student1 = new Student("robin", "Disilva", "Maths");
        Student student2 = new Student("john", "Brill", "Science");
        Student student3 = new Student("joel", "Pan", "Physics");
        
        University university = new University("STANFORD", "USA");
        List<Student> allStudents = new ArrayList<Student>();
 
        student1.setUniversity(university);
        student2.setUniversity(university);
        student3.setUniversity(university);
 
        allStudents.add(student1);
        allStudents.add(student2);
        allStudents.add(student3);
 
        university.setStudent(allStudents);
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
 
        session.persist(university);// Students will be presisted automatically, thanks to CASCADE.ALL defined on students
                                    // property of University class.
 
        @SuppressWarnings("deprecation")
		List<Student> students = (List<Student>) session.createQuery(
                "from Student ").list();
        for (Student s : students) {
            System.out.println("Student Details : " + s);
            System.out.println("Student University Details: "
                    + s.getUniversity());
        }
 
        // Note that now you can also access the relationship from University to Student
 
        session.getTransaction().commit();
        session.close();

	}

}
