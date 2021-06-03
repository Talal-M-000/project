package HospitalManagmentSystem;

import java.util.Scanner;

public class Nurse_menu {

	 public void Nurse_Menu() 
	 {
		 System.out.println("\nNurse PORTAL: ");
		 
		 System.out.println("\nCHOOSE 1 FOR CHECKING Nurse LIST \nCHOOSE 2 FOR ADDING Nurse \nCHOOSE 3 FOR REMOVINNG Nurse \nChoose 4  TO MAIN MENU");
		 
		 Scanner input=new Scanner(System.in);
		 int choice = input.nextInt();
		 switch (choice) {
		   case 1:
		     ShowNurse sd_obj= new ShowNurse();
		     sd_obj.showNurse();
		     break;
		   case 2:
			   AddNurse add_obj= new AddNurse();
			   add_obj.addNurse(); 
		    break;
		   case 3:
			   DeleteNurse del_obj=new DeleteNurse();
			   del_obj.delNurse();
			   break;
		   case 4:
			  Main_Menu main_obj= new Main_Menu();
	          main_obj.tryMain_Menu();
			break;
		 }
		 
		 input.close();
	}	
}
