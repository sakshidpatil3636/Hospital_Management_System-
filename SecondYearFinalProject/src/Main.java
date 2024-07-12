import java.util.*;
import Info.information;
import project.patient;
import Doctor.doctor;
import Nurse.nurse;
import Ambulance.ambulance;
import Apply.applyhere;
public class Main {
public static void main(String[] args) {

// TODO Auto-generated method stub
int op,ch;
information i=new information();

doctor d=new doctor();

i.doctor();
nurse n=new nurse();
i.nurse();
patient p=new patient();
p.create();
applyhere a=new applyhere();

System.out.println("\u001B[33m                  WELCOME TO CITY CARE HOSPITAL :)");
Scanner sc=new Scanner(System.in);

i.display_hospital_info();
System.out.println();
System.out.print("Please enter your name : ");
String entername = sc.nextLine();
System.out.println();
System.out.println("HELLO "+entername+" !");
System.out.println();
System.out.println("-----------------------------------------------------------");
int choice=0;
     do {
    	 
    	 System.out.println("See the other information of the Hospital");
    	 System.out.println();
    	 System.out.println("Choose any of the option given below.");
    System.out.print("1.Overview ");
    System.out.print("    2.Who is viewing ");
    System.out.print("     3.Apply here ");
    System.out.print("       4.Exit");
    System.out.println();
    choice = sc.nextInt();
    System.out.println("-----------------------------------------------------");
        switch(choice) {

        case 1:{
        int option;
    do {
     
    System.out.println();
    System.out.println("Enter the option you want to choose :");
    System.out.println("1. Amenities available");
    System.out.println("2. Departments");
    System.out.println("3. Doctors");
    System.out.println("4. Other Information about Hospital");
    System.out.println("5. Frequently asked questions about Hospital");
    System.out.println("6. Display the past patient list.");
    System.out.println("7. Display the applicants list.");
    System.out.println("8. Exit from this menu");
    option = sc.nextInt();
    System.out.println("---------------------------------------------------");
       switch(option) {
       case 1:
        i.amenities();
        break;
       case 2:
        i.display_department();
        System.out.println("________________________________________________");
        break;
       case 3:
        i.display_doctors();
        break;
       case 4:
        i.display_other_things();
        break;
       case 5:
        i.display_ask_questions();
        break;
       case 6:
    	   p.display_Old_Patient();
    	   System.out.println("-----------------------------------------------");
    	   break;
       case 7:
    	   a.displayApply();
    	   System.out.println("----------------------------------------------");
    	   break;
       case 8:
    	   break;
        default:
        System.out.println("Enter valid input");
        break;
       }
    }while(option!=8);
        System.out.println("Exiting from Overview.........");
        System.out.println();
        System.out.println("______________________________________________________");
        break;        
        }
        case 2:{
        	int h;
            do {
            System.out.println("Choose your role :");
            System.out.println("1. Patient");
            System.out.println("2. Doctor");
            System.out.println("3. Nurse");
            System.out.println("4. Exit");
            System.out.println();
            h = sc.nextInt();
            switch(h) {
            case 1:
            	patient pt=new patient();
            	pt.info();
            	pt.appointment();
            	System.out.println("--------------------------------------------");
            	//pt.newAppointment();
            	break;
            case 2:
            	//calling method for doctor
            	d.input();
            	d.display();
            	System.out.println("Exiting from Doctor........");
            	System.out.println();
            	System.out.println("--------------------------------------------");
            	break;
            case 3:
            	//calling method for nurse
            	n.N_input();
            	n.N_display();
            	System.out.println("Exiting from Nurse........");
            	System.out.println("--------------------------------------------");
            	break;
            case 4:
            	break;
            }
        }while(h!=4);
         System.out.println("Exiting from Who is viewing.........");
         System.out.println();
         System.out.println("______________________________________________________");
         break;
        }
        case 3:{
        //call apply here methods
        a.enterApplicants();
        System.out.println("Exiting from applyhere......");
        System.out.println();
        System.out.println("______________________________________________________");
        break;
        }
        case 4:
        	break;
        }
        System.out.println();

}while(choice!=4);
    System.out.println("Thank you................!");
}
}
