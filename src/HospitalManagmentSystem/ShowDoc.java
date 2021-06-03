package HospitalManagmentSystem;

import java.sql.*;
import java.util.*; 

public class ShowDoc {

	public void showdoc() {
	    try
	    {
	      String myUrl = "jdbc:mysql://127.0.0.1:3310/hospital_db";
	      Connection con = DriverManager.getConnection(myUrl, "root", "admin");
	     
	      String query = "SELECT * FROM doctor";

	      Statement st = con.createStatement();
	      
	      ResultSet rs = st.executeQuery(query);
	      
	      while (rs.next())
	      {
	        String id = rs.getString("ID");
	        String Name = rs.getString("Name");
	        String Department = rs.getString("Department");
	        int age = rs.getInt("Age");
	        
	        System.out.format("%s, %s, %s, %s\n", id,Name,Department,age);
	      }
	      st.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
	     
	    	 Main_Menu main_obj= new Main_Menu();
	          main_obj.tryMain_Menu();
	    }
	
	}
	