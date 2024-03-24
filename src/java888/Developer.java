package java888;

import java.math.BigDecimal;

public class Developer {
	
	String name;
	BigDecimal salary;
	int age;
	@Override
	public String toString() {
		return "Developer [name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Developer(String name, BigDecimal bigDecimal, int age) {
		super();
		this.name = name;
		this.salary = bigDecimal;
		this.age = age;
	}
	public Developer(String name2, BigDecimal bigDecimal, int age2) {
		// TODO Auto-generated constructor stub
	}
	
	
	

}
