package com.lalit.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDeserializeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Employee emp = new Employee();
     Address address = new Address();
     address.setStreet("Royal Palms");
     address.setCity("Mumbai");
     address.setState("Maharashtra");
     emp.setId(565127);
     emp.setName("lalit");
     emp.setAddress(address);
     
     try {
		FileOutputStream fos = new FileOutputStream("emp.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);
		oos.close();
		fos.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
     try {
 		FileInputStream fis = new FileInputStream("emp.ser");
 		ObjectInputStream ois = new ObjectInputStream(fis);
 		Employee employee = (Employee)ois.readObject();
 		ois.close();
 		fis.close();
 		System.out.println("Employee Details\t"+employee.getName()+"\t"+employee.getId()+"\n"+employee.getAddress());
 		
 	} catch (FileNotFoundException e) {
 		// TODO Auto-generated catch block
 		e.printStackTrace();
 	} catch (IOException e) {
 		// TODO Auto-generated catch block
 		e.printStackTrace();
 	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
