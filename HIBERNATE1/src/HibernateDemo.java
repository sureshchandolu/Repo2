import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pack.StudentHiber;

public class HibernateDemo {
	public static void main(String[] args) {
		
		StudentHiber student=new StudentHiber();
		student.setStudentId(44);
		student.setStudentFirstName("samba");
		student.setStudentLastName("ssr");
		
	
		 SessionFactory factory=new Configuration().configure().buildSessionFactory();
		 Session session=factory.openSession();
		 
		
      
		 session.beginTransaction();
		 session.save(student);
		 session.getTransaction().commit();
		 session.close();
	
	}

}
