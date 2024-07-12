package Nurse;

import java.util.Scanner;

import Info.information;
import project.patient;

public class nurse {
	Scanner sc=new Scanner(System.in);
	information i=new information();
	String ID;
	int y=1;
	public void N_input() {
		System.out.print("Input your ID :");
		ID=sc.next();
		int s=i.check_N_ID(ID);
		while(s==0) {
			System.out.println("This nurse ID is not exists.");
			System.out.println();
		    System.out.print("Please,Enter valid ID:");
	        ID=sc.next();
	        s=i.check_N_ID(ID);
		} 
	}           
	public void N_display() {
		patient p=new patient();
		p.appointment();
		int c=0;
		do{
			System.out.println();
			System.out.println("----------------------------------------------");
			System.out.println("Choose option:");
			System.out.println("1.Shift time");
			System.out.println("2.Current admitted patients");
			System.out.println("3.Information of the Doctor");
			System.out.println("4.Exit ");
			c=sc.nextInt();
			System.out.println("-----------------------------------------------");
			System.out.println();
			switch(c) {
				case 1:
					i.get_nurseShift(ID);
				    break;
				case 2:
				    i.get_currNPatient(ID);
					break;
				case 3:
					System.out.print("Enter doctor ID:");
					String r=sc.next();
					i.get_doctorInfo(r);
                    break; 
				case 4:
					break;
			}
		}while(c!=4);
	}
	
}