package HospitalManagmentSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteNurse {

	public void delNurse() 
	{
		    try
		    {
		      String myUrl = "jdbc:mysql://127.0.0.1:3310/hospital_db";
		      Connection con = DriverManager.getConnection(myUrl, "root", "admin");
		      
		      Scanner input=new Scanner(System.in);
		      
		      System.out.println("\nEnter ID:");
			  String id = input.next();
			  
		      String query = "DELETE FROM `hospital_db`.`nurse` WHERE (`ID` =?);";

		      PreparedStatement preparedStmt = con.prepareStatement(query);
		      preparedStmt.setString (1,id);
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
