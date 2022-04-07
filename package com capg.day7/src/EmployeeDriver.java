import java.util.HashMap;

public class EmployeeDriver {
	public static void main(String[] args) {
		HashMap<Employee,String>employeeMap=new HashMap<Employee,String>();
		Employee employee1=new Employee();
		employee1.setId(1);
		employee1.setName("goutam");
		employee1.setDateOfBirth(1982,3,2);
		employee1.setSalary(new BigDecimal(100000));
		employeeMap.put(empolyee1,"India");
		Employee employee2=new Employee();
		employee2.Id(1);
		employee2.Name("Rahul");
		employee2.DateOfBirth(1987,1,2);
		employee2.setSalary(new BigDecimal(100000));
		employeeMap.put(empolyee2,"Japan");
		System.out.println("employeeMap");
	}

}
