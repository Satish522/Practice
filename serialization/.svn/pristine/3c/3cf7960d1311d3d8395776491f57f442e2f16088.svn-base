package test.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = "time.xml";
	    Employee e = new Employee("Lars", "Vogel",45);

	    // save the object to file
	    FileOutputStream fos = null;
	    ObjectOutputStream out = null;
	    //SerializationUtil.serialize(data, fileName);
	    
	    // read the object from file
	    // save the object to file
	    Employee e1=null;
	    FileInputStream fis = null;
	    ObjectInputStream in = null;
	    try {
	      fis = new FileInputStream(filename);
	      in = new ObjectInputStream(fis);
	      e1 = (Employee) in.readObject();
	      in.close();
	    } catch (Exception ex) {
	      ex.printStackTrace();
	    }
	    System.out.println(e1.id+"   "+e1.name+"  "+e1.salary);
	}

}
