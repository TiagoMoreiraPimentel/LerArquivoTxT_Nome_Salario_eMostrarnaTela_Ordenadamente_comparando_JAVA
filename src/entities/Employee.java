package entities;

// classe funcionarios com metodo de comparação implementado
public class Employee implements Comparable<Employee> {
	
	String name;
	Double salary;
	
	public Employee() {
	}

	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	// polimorfismo de comparação
	@Override
	public int compareTo(Employee o) {
		return name.compareTo(o.getName());
	}
}
