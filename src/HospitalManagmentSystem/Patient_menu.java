package HospitalManagmentSystem;

import java.util.Scanner;

public class Patient_menu {

	 public void DOC_Menu() 
	 {
		 System.out.println("\nDOCTER PORTAL: ");
		 
		 System.out.println("\nCHOOSE 1 FOR CHECKING Patient LIST \nCHOOSE 2 FOR ADDING Patient \nCHOOSE 3 FOR REMOVINNG DOCTOR \nChoose 4 FOR RETURNINIG TO MAIN MENU");
		 
		 Scanner input=new Scanner(System.in);
		 int choice = input.nextInt();
		 switch (choice) {
		   case 1:
		     ShowPatient sd_obj= new ShowPatient();
		     sd_obj.showPatient();
		     break;
		   case 2:
			   AddPatient add_obj= new AddPatient();
			   add_obj.addPatient(); 
		    break;
		   case 3:
			   DeletePatient del_obj=new DeletePatient();
			   del_obj.delPatient();
			   break;
		   case 4:
			  Main_Menu main_obj= new Main_Menu();
	          main_obj.tryMain_Menu();
			break;
		 }
		 
		 input.close();
	}	

	
}
