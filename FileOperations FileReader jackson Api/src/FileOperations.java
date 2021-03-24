import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;

class MyFileOps {
	  ObjectMapper objectMapper=new ObjectMapper();
	  List<String>jsonStrings=new ArrayList<>();
	  
	  public List<String> objectToJson(List<Employee> employeeList){
		  for(Employee employee:employeeList) {
			  try {
				String json=  objectMapper.writeValueAsString(employee);
				
				
				jsonStrings.add(json);
				  
				  
			  }
			 catch(Exception e) {
				 
			 }
			  jsonStrings.forEach(string->System.out.println(string));
			  
		  }
		  
		
		  
		return null;
		  
	  }
	
	

	void takeFile() {
		try {
			// FileInputStream fis = new FileInputStream("D:\\myprofile.txt");
			FileReader fis = new FileReader("D:\\employees.csv");

			// BufferedInputStream bis=new BufferedInputStream(fis);

			BufferedReader buffererreader = new BufferedReader(fis);
			
			String line = null;

			List<Employee> empList = new ArrayList<>();
			while ((line = buffererreader.readLine()) != null) {
				Scanner scanner = new Scanner(line);
				scanner.useDelimiter(",");

				Employee employee = new Employee();

				employee.setId(Integer.parseInt(scanner.next()));
				employee.setName(scanner.next());
				employee.setRole(scanner.next());
				employee.setSalary(scanner.next());

				empList.add(employee);

			}
			//empList.forEach(emp->System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getRole()+" "+emp.getSalary()));
			 objectToJson(empList);
		}

		catch (IOException e) {
			System.out.println(e);

		}

	}

}

public class FileOperations {
	public static void main(String[] args) {
		MyFileOps ops = new MyFileOps();
		ops.takeFile();

	}

}
