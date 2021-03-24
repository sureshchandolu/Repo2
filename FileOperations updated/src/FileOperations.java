import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;

class MyFileOps {

	List<String> jsonStrings = new ArrayList<>();

	public void objectToJson(List<Employee> employeeList) {
		for (Employee employee : employeeList) {

			String json = JsonUtils.objectToJson(employee);

			jsonStrings.add(json);
		}

		jsonStrings.forEach(string -> System.out.println(string));

	}

	void takeFile() {
		try {
			// FileInputStream fis = new FileInputStream("D:\\employees.csv");
			FileReader fis = new FileReader("D:\\names.txt");

			// BufferedInputStream buffererreader=new BufferedInputStream(fis);

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
			// empList.forEach(emp->System.out.println(emp.getId()+" "+emp.getName()+"
			// "+emp.getRole()+" "+emp.getSalary()));
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
