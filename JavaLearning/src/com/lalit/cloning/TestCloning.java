package com.lalit.cloning;

public class TestCloning {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try{ 
	   Department department = new Department(1, "Finance"); 
       Employee employee = new Employee(1, "Lalit", department);
       
       Employee cloned = new Employee(employee);
       cloned.getDepartment().setName("HR".substring(1));
       // both the objects should have different memory address
       System.out.println(employee!=cloned);
       // both objects are of same type
       System.out.println(employee.getClass() == cloned.getClass());
       //Default equals method checks for references so it must be false. to check 
       // need to override equals method
       System.out.println(employee.equals(cloned));
       System.out.println("Original Object Value"+employee.getDepartment().getName());
       System.out.println("Cloned Object Value after deep cloning"+cloned.getDepartment().getName());
       System.out.println("Cloned Object Value after shallow cloning"+cloned.getDepartment().getName());
     }catch(CloneNotSupportedException e){
    	 e.printStackTrace();
     }
	}
}
