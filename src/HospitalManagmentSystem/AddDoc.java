package HospitalManagmentSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class AddDoc {

	public void adddoc() 
	{
		    try
		    {
		      String myUrl = "jdbc:mysql://127.0.0.1:3310/hospital_db";
		      Connection con = DriverManager.getConnection(myUrl, "root", "admin");
		      
		      Scanner input=new Scanner(System.in);
		      
		      System.out.println("\nEnter ID:");
			  String id = input.next();
			  
		      System.out.println("\nEnter NAME:");
		      String Name = input.next();
		      
		      System.out.println("\nEnter DEPARTMENT:");
		      String Department = input.next();
		      
		      System.out.println("\nEnter AGE:");
		      int age = input.nextInt();
		      
		      String query = "INSERT INTO `hospital_db`.`doctor` (`ID`, `NAME`, `DEPARTMENT`, `AGE`)  values (?, ?, ?, ?)";

		      PreparedStatement preparedStmt = con.prepareStatement(query);
		      preparedStmt.setString (1,id);
		      preparedStmt.setString (2,Name);
		      preparedStmt.setString (3,Department);
		      preparedStmt.setInt    (4,age);

		      preparedStmt.execute();
		      
		      con.close();
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
