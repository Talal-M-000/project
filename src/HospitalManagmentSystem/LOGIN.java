package HospitalManagmentSystem;

import java.util.Scanner;
import java.sql.*;

public class LOGIN {

	static java.sql.Connection con;	
	
	 public void tryLogin() {
	
		 try
		    {
		      String myUrl = "jdbc:mysql://127.0.0.1:3310/hospital_db";
		      Connection con = DriverManager.getConnection(myUrl, "root", "admin");
		      
		      Scanner input =new Scanner(System.in);
		      
		      int i=0;
		      
		      while(i<3) {
		      System.out.print("\nEnter ID: ");
		      int id=input.nextInt();
		      System.out.print("\nEnterPASSWORD: ");
		      int password=input.nextInt();
		      
		      String query = "SELECT * FROM login";

		      Statement st = con.createStatement();
		      
		      ResultSet rs = st.executeQuery(query);
		      
		      while (rs.next())
		      {
		        int ID = rs.getInt("ID");
		        int PASSWORD = rs.getInt("PASSWORD");
		        
		  	  
		      if(id==ID && password==PASSWORD) 
		      {
		    	  Main_Menu main_obj= new Main_Menu();
		    	  main_obj.tryMain_Menu();
		      }
		      
		      {
		    	  System.out.print("\nWRONG ID/PASSWORD");
		      }
		        
		      }
		      st.close();
		      i++;
		      }
		      System.out.print("\nMANY WRONG PASSWORD");
		      }
		  
		    catch (Exception e)
		      {
		      System.err.println("Got an exception! ");
		      System.err.println(e.getMessage());
		      }
       
	 }
	 }
	