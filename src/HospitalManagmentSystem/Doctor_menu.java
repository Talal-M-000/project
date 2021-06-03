package HospitalManagmentSystem;

import java.util.Scanner;

public class Doctor_menu {

	 public void DOC_Menu() 
	 {
		 System.out.println("\nDOCTER PORTAL: ");
		 
		 System.out.println("\nCHOOSE 1 FOR CHECKING DOCTOR LIST \nCHOOSE 2 FOR ADDING DOCTOR \nCHOOSE 3 FOR REMOVINNG DOCTOR \nChoose 4  TO MAIN MENU");
		 
		 Scanner input=new Scanner(System.in);
		 int choice = input.nextInt();
		 switch (choice) {
		   case 1:
		     ShowDoc sd_obj= new ShowDoc();
		     sd_obj.showdoc();
		     break;
		   case 2:
			   AddDoc add_obj= new AddDoc();
			   add_obj.adddoc(); 
		    break;
		   case 3:
			   DeleteDoc del_obj=new DeleteDoc();
			   del_obj.deldoc();
			   break;
		   case 4:
			  Main_Menu main_obj= new Main_Menu();
	          main_obj.tryMain_Menu();
			break;
		 }
		 
		 input.close();
	}	
}
