package HospitalManagmentSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class TestCheck {

	public int testcheck() 
	{
		int i=0;
		    try
		    {
		      String myUrl = "jdbc:mysql://127.0.0.1:3310/hospital_db";
		      Connection con = DriverManager.getConnection(myUrl, "root", "admin");
		      
		      
		      String query = "SELECT ID FROM `hospital_db`.`LOGIN`";

              Statement st = con.createStatement();
		      
		      ResultSet rs = st.executeQuery(query);
		      
		      while (rs.next())
		      {
		        int ID = rs.getInt("ID");
		      
		      if(ID==1234) 
		      {
		      i=1;
		      }
		      }
		      }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception! ");
		      System.err.println(e.getMessage());
		    }
			return i;

}
}
