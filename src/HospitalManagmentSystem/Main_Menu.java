package HospitalManagmentSystem;

import java.util.Scanner;


public class Main_Menu {

	 public void tryMain_Menu() 
	 {
		 System.out.println("\nWELCOME TO THE MAIN MENU: ");
		 
		 System.out.println("\nCHOOSE 1 FOR DOCTOR PORTAL \nCHOOSE 2 FOR PATIENT POTRAL \nCHOOSE 3 FOR NURSE PORTAL: \nChoose 4 FOR ENDING PROGRAM");
		 
		 Scanner input=new Scanner(System.in);
		 int choice = input.nextInt();
		 switch (choice) {
		   case 1:
			 Doctor_menu doc_obj= new Doctor_menu();
			 doc_obj.DOC_Menu();  
		     break;
		   case 2:
			   Patient_menu pat_obj= new Patient_menu();
			   pat_obj.DOC_Menu();  
			  break;
		   case 3:
             Nurse_menu nur_obj= new Nurse_menu();
			 nur_obj.Nurse_Menu();  
			 break;
		   case 4:
			 
			 System.out.println("PROGRAM CLOSED");
			 System.exit(0);
			break;
		 }
		 
		 input.close();
	}	
}
