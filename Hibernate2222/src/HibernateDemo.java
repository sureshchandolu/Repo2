import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pack.StudentHiber;

public class HibernateDemo {
	public static void main(String[] args) {
		
		StudentHiber student=new StudentHiber();
		student.setStudentId(99);
		student.setStudentFirstName("ch");
		student.setStudentLastName("suresh");
		
	
		 SessionFactory factory=new Configuration().configure().buildSessionFactory();
		 Session session=factory.openSession();
		 
		
      
		 session.beginTransaction();
		// session.save(student);
		// session.update(student);
		 
		 
	 
		 String hql = "FROM StudentHiber S";
		 Query query = session.createQuery(hql);
		 List<StudentHiber> results = query.getResultList();
		  results.forEach(s->System.out.println(s.getStudentFirstName()));
	 
	 
	 
		 
		
		 String hql1 = "FROM StudentHiber S WHERE S.id = 34";
		 Query query1 = session.createQuery(hql1);
		 List<StudentHiber> results1 =query1.getResultList();
		  results1.forEach(s->System.out.println(s.getStudentFirstName()));
		  
		  
		  
		  String hql2 = "FROM StudentHiber S WHERE S.id = :student_id";
		  Query query2 = session.createQuery(hql2);
		  query2.setParameter("student_id",3);
		  
		  List<StudentHiber> results2=  query2.getResultList();
		  
		  results2.forEach(s->System.out.println(s.getStudentFirstName()));
		 
		  
		  
		 
		
		 session.getTransaction().commit();
		 session.close();
	
	}

}
