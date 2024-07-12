package Doctor;

import java.util.Scanner;

import Info.information;
import project.patient;

public class doctor {
	Scanner sc=new Scanner(System.in);
	information i=new information();
	static String ID=null;
	int v=1;
	int o=1;
	public void input() {
		System.out.print("Enter ID:");
	    ID=sc.next();
	    int s=i.check_D_ID(ID);
		while(s==0) {
			System.out.println("This doctor ID is not exists.");
			System.out.println();
		    System.out.print("Please,Enter valid ID:");
	        ID=sc.next();
	        s=i.check_D_ID(ID);
		} 
	}
	public void display() {
		patient p=new patient();
		p.appointment();
		int c=0;
		do{
			System.out.println();
			System.out.println("----------------------------------------------");
			System.out.println("Choose option:");
			System.out.println("1.Shift time");
			System.out.println("2.Current admitted patients");
			System.out.println("3.Information of the assistance");
			System.out.println("4.Number of ICU remaining");
			System.out.println("5.See the list of current patient in list");
			System.out.println("6.Remove the patient fron queue after treatment:");
			System.out.println("7.Exit from Doctor.");
			c=sc.nextInt();
			System.out.println("-----------------");
			System.out.println();
			switch(c) {
				case 1:
					i.get_ShiftTime(ID);
					break;
				case 2:
					i.get_currPatient(ID);
					break;
				case 3:
					i.nurse();
					i.get_assistantInfo(ID);
					break;
				case 4:
					i.ICU_No();
					break;
				case 5:
					p.get_patientInfo(ID);
					break;
				case 6:
					p.dequeue();
					break;
				case 7:
					break;
			}	
		}while(c!=7);
	}
}
