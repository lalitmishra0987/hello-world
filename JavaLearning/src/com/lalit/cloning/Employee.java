package com.lalit.cloning;

public class Employee extends TestAbstract implements Cloneable{

	private int employeeId;
	private String name;
	private final Department department;
	
	public Employee(int empId,String name, Department dept){
		
		this.employeeId = empId;
		this.name = name;
		this.department = dept;
		
	}
	//CopyConstructor Example
	public Employee(Employee emp) throws CloneNotSupportedException{
		this.employeeId = emp.employeeId;
		this.name = emp.name;
		this.department = (Department)emp.department.clone();
		
	}
	
	public Object clone() throws CloneNotSupportedException{
		Employee cloned = (Employee)super.clone(); 
		//For deep cloning
		//cloned.setDepartment((Department)cloned.getDepartment().clone());
		
		return cloned;
	}
	
	public int getEmployeeId() {
		
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDepartment() {
		return department;
	}
	
}
