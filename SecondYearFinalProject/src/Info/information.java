package Info;
import java.util.Scanner;

import java.util.*;

import Doctor.doctor;

class D_Node{

String name;

String department;

String mobNo;

String email;

String qualification;

String ID;

String shiftTime;

String assistant;

int currPatient;

D_Node next;

public D_Node(String name,String department,String mobNo,String email,String qualification,String ID,String shiftTime,int currPatient,String assistant){

this.name=name;

this.department=department;

this.mobNo=mobNo;

this.email=email;

this.qualification=qualification;

this.ID=ID;

this.shiftTime=shiftTime;

this.currPatient=currPatient;

this.assistant=assistant;

this.next=null;

}

}

class N_Node1 {

 String nurseID;

 String name;

 String department;

 String contact;

 String shift;

 String doctor;

 String docID;

 N_Node1 next;

 int cp;

 

 public N_Node1(String nurseID, String name, String department, String contact, String shift, String doctor, String docID, int cp) {

 this.nurseID = nurseID;

 this.name = name;

 this.department = department;

 this.contact = contact;

 this.shift = shift;

 this.doctor = doctor;

 this.docID = docID;

 this.cp = cp;

 this.next=null;

 }

}

public class information{

static D_Node head=null;

static N_Node1 Head=null;

int i=4;

int ICU[]=new int[20];

Scanner sc=new Scanner(System.in);

public void doctor() {

D_Node doctor1 = new D_Node("Dr.Aarav Sharma", "Cardiology", "555-555-5555", "aarav.sharma@example.com", "MD,DM, Cardiologist","D1","Day Shift",3,"Neha Sharma");

head=doctor1;

D_Node doctor2= new D_Node("Dr.Anika Patel", "Cardiology", "555-555-5556", "anika.patel@example.com", "MS, Cardiologist","D2","Night Shift",3,"Rajat Patel");

doctor1.next=doctor2;

D_Node doctor3 = new D_Node("Dr.Riya Singh", "Oncology", "555-555-5558", "riya.singh@example.com", "DO, Oncologists","D4","Night Shift",4,"Aparna Choudhary");

doctor2.next=doctor3;

D_Node doctor4 = new D_Node("Dr.Arjun Verma", "Oncology", "555-555-5559", "arjun.verma@example.com", "DO, Oncologists","D5","Day Shift",3,"Nikhil Kumar");

doctor3.next=doctor4;

D_Node doctor5 = new D_Node("Dr.Vikram Khanna", "Orthopedics", "555-555-5511", "vikram.khanna@example.com", "MD, Orthopedics","D7","Day Shift",2,"Jyoti Desai");

doctor4.next=doctor5;

D_Node doctor6 = new D_Node("Dr.Neha Kapoor", "Orthopedics", "555-555-5512", "neha.kapoor@example.com", "MD, Orthopedics","D8","Night Shift",1,"Snaha Mehta");

doctor5.next=doctor6;

D_Node doctor7 = new D_Node("Dr.Rahul Malhotra", "General Medicine", "555-555-5514", "rahul.malhotra@example.com", "MD, General Medicine","D10","Night Shift",3,"Shalini Singh");

doctor6.next=doctor7;

D_Node doctor8 = new D_Node("Dr.Aanya Desai", "General Medicine", "555-555-5515", "aanya.desai@example.com", "MD, General Medicine","D11","Day Shift",5,"Shubh Gupta");

doctor7.next=doctor8;

D_Node doctor9= new D_Node("Dr.Pooja Mehta", "Neurology", "555-555-5517", "pooja.mehta@example.com", "MD, Neurology","D13","Night Shift",2,"Ritu Reddy");

doctor8.next=doctor9;

D_Node doctor10= new D_Node("Dr.Rahul Choudhary", "Neurology", "555-555-5518", "rahul.choudhary@example.com", "MD, Neurology","D14","Day Shift",2,"Pooja Suryavanshi");

doctor9.next=doctor10;

}

public void nurse() {

N_Node1 nurse1 = new N_Node1("N101","Neha Sharma","Cardiology","7898865642", "Day Shift","Dr.Aarav Sharma","D1",3);
Head = nurse1;
N_Node1 nurse2 = new N_Node1("N102", "Rajat Patel", "Cardiology", "9332472350", "Night Shift", "Dr.Ankita Patel","D2",3);

nurse1.next = nurse2;

N_Node1 nurse3 = new N_Node1("N103", "Aparna Chaudhary", "Oncology", "9214120941", "Night Shift", "Dr.Riya Singh","D3",4);

nurse2.next = nurse3;

N_Node1 nurse4 = new N_Node1("N104", "Nikhil Kumar", "Oncology", "8905645234", "Day Shift", "Dr.Arjun Verma","D4",3);

nurse3.next = nurse4;

N_Node1 nurse5 = new N_Node1("N105", "Jyoti Desai", "Orthopedics", "7043562621", "Day Shift", "Dr.Vikram Khanna","D5",2);

nurse4.next = nurse5;

N_Node1 nurse6 = new N_Node1("N106", "Sneha Mehta", "Orthopedics", "9813263523", "Night Shift", "Dr.Neha Kapoor","D6",1);

nurse5.next = nurse6;

N_Node1 nurse7 = new N_Node1("N107", "Shalini Singh", "General Medicine", "9070561485", "Night Shift", "Dr.Rahul Malhotra","D7",3);

nurse6.next = nurse7;

N_Node1 nurse8 = new N_Node1("N108", "Shubh Gupta", "General Medicine", "7531748906", "Day Shift", "Dr.Aanya Desai","D8",5);

nurse7.next = nurse8;

N_Node1 nurse9 = new N_Node1("N109", "Ritu Reddy", "Neurology", "8054234789", "Night Shift", "Dr.Pooja Mehta","D9",2);

nurse8.next = nurse9;

N_Node1 nurse10 = new N_Node1("N110", "Pooja Suryavanshi", "Neurology", "9781289087", "Day Shift", "Dr.Rahul Chaudhary","D10",2);

nurse9.next = nurse10;

}

public void display_hospital_info() {

System.out.println("                       Welcome to ");

System.out.println("\u001B[32m                   CITY CARE HOSPITAL");

System.out.println("\u001B[0m                  ********************");

System.out.println("\n\u001B[0mKarve Nagar,Pune\tEstablished 2001\tDoctors 10");

System.out.println("\n\nCity Care Hospital Pune is equipped with state-of-the-art medical technologies to provide accurate \nand precise diagnostic results, including MRI, CT scan, and digital X-ray machines. \nThe hospital has a team of highly qualified and experienced doctors, nurses, and healthcare \nprofessionals who are dedicated to providing the best possible care to patients. \nThe hospital offers a wide range of medical services, including cardiology, neurology, orthopedics, \nurology, and gynecology, to meet the diverse healthcare needs of patients.");
System.out.println("_____________________________________________________________________________________________________________");

}

public void amenities() {
System.out.println("\u001B[36m\nAmenities");

System.out.println("\u001B[0m***************");

System.out.println("\n\u001B[33mComfort\r\n"

+ "\u001B[0mDry Cleaning\r\n"

+ "Free Wifi\r\n"

+ "Laundry\r\n"

+ "Mobility accessible rooms\r\n"

+ "Nursery / Nanny services\r\n"

+ "Parking available\r\n"

+ "Personal assistance\r\n"

+ "Phone in Room\r\n"

+ "Private rooms\r\n"

+ "Religious facilities\r\n");

System.out.println("\u001B[33mTreatment\r\n"

+ "\u001B[0mDocument legalisation\r\n"

+ "Medical records transfer\r\n"

+ "Pharmacy\r\n"

+ "Post operative followup\r\n"

+ "Rehabilitation");

System.out.println("\n\u001B[33mFood\r\n"

+ "\u001B[0mDiet on Request\r\n"

+ "Cafe");
System.out.println("____________________________________________________");
}

public void display_department() {
System.out.println("\u001B[36m\nDepartments");

System.out.println("\u001B[0m******************");

System.out.println("1. Cardiology\n2.Oncology\n3.Orthopedics\n4.General Medicine\n5.Neurology");

}
public void display_depFloors() {
	System.out.println("1. First Floor : Cardiology");
    System.out.println("2. Second Floor : Oncology");
    System.out.println("3. Third Floor : Orthopedics");
    System.out.println("4. Fourth Floor : General Medicine");
    System.out.println("5. Fifth Floor : Neurology");
}

public void display_timing_schedule() {
System.out.println("Timing schedule for the appointment :");
System.out.println("1. 10 AM (10)\n2. 11 AM (11)\n3. 12 AM (12)\n4. 1 PM (13)\n5. 2 PM (14)\n6. 3 PM (15)\n7. 4 PM (16)\n8. 5 PM (17)\n9. 6 PM (18)\n");
System.out.println("_______________________________________________________");
}
public void display_doctors() {
System.out.println("\u001B[36m\nDisplaying Doctors");

System.out.println("\u001B[0m********************");
D_Node temp=head;

while(temp!=null) {

System.out.println("Department name:"+temp.department+"\nName of doctor:"+temp.name+"\tContact number:"+temp.mobNo);
System.out.println("------------------------------------------------");
System.out.println();
temp = temp.next;  
}

}

public void display_other_things() {

System.out.println("\u001B[36m\nOther information");

System.out.println("\u001B[0m***************");

System.out.println("Number of doctors : 10");

System.out.println("Number of Nurses : 10");

System.out.println("Number of beds : 200");

System.out.println("Number of ICU : 20");

System.out.println("Number of Ambulance available : 8");

System.out.println("Number of temporary ward : 10");

System.out.println("Number of floors in hospital : 6");
System.out.println("_______________________________________________________");
}

public void display_ask_questions() {
System.out.println("\u001B[36m\nFrequently asked questions:");

System.out.println("\u001B[0m***************");

int ask;
int choice_question;
       do {
    	       System.out.println("");
               System.out.println("Choose question number from below:");
               System.out.println("1. Can I make an appointment at City Care Hospital?");
               System.out.println("2. Are there emergency services available at City Care Hospital?");
               System. out.println("3. Does City Care Hospital have accommodation facilities for patients and their families?");
               System.out.println("4. What are the visiting hours for City Care Hospital, Pune?");
               System.out.println("5. Exit");

               choice_question = sc.nextInt();
               System.out.println("------------------------------------------");
               switch (choice_question) {
                   case 1:
                	   System.out.println();
                       System.out.println("Yes, you can make an appointment at City Care Hospital. \nThe hospital has an appointment system where you can schedule consultations or procedures with the appropriate departments or specialists.");
                       System.out.println("_____________________________________________________________________________________________________");
                       break;
                   case 2:
                	   System.out.println();
                       System.out.println("Yes, City Care Hospital has a dedicated emergency department that provides 24/7 emergency medical services. The department is equipped to handle various medical emergencies and has a team of skilled healthcare professionals to provide immediate care and stabilization.");
                       System.out.println("_____________________________________________________________________________________________________");
                       break;
                   case 3:
                	   System.out.println();
                       System.out.println("City Care Hospital may have limited accommodation facilities for patients and their families, such as general wards or paying wards. However, the availability of accommodation may vary, and it is recommended to inquire with the hospital about the options available.");
                       System.out.println("_____________________________________________________________________________________________________");
                       break;
                   case 4:
                	   System.out.println();
                       System.out.println("General Ward · Visiting Hours: General: 5:00 PM – 7:00 PM");
                       System.out.println("_____________________________________________________________________________________________________");
                       break;
                   case 5:
                       System.out.println("Exiting.....");
                       break;
                   default:
                       System.out.println("Enter a valid input");
                       break;
               }
       } while (choice_question != 5);
       System.out.println("_____________________________________________________________________________");
}
		public int check_D_ID(String id) {
			D_Node temp=head;
			while(temp!=null) {
		    	  if(id.equals(temp.ID)) {
		    		  return 1;
		    	  }
		    	  else {
		    		  temp=temp.next;
		    	  }
		      }
		      return 0;
		}
		public void  get_ShiftTime(String id) {
		      D_Node temp=head;
		      //System.out.println(head.shiftTime);
		      while(temp!=null) {
		    	  
		    	  if(id.equals(temp.ID)) {
		    		  System.out.println("Shift Time:"+temp.shiftTime);
		    		  break;
		    	  }
		    	  else {
		    		  temp=temp.next;
		    	  }
		      }
		      if(temp==null) {
		    	  System.out.println("Sorry! This doctor ID is not exists.");
		      }
		}
		public void get_currPatient(String ID) {
		      D_Node temp=head;
		      while(temp!=null) {
		    	  if(temp.ID.equals(ID)) {
		    		  System.out.println("Current available patients:"+temp.currPatient);
		    		  break;
		    	  }
		    	  else {
		    		  temp=temp.next;
		    	  }
		      }
		      if(temp==null) {
		    	  System.out.println("Sorry! This doctor ID is not exists.");
		      }
		}
		public void get_assistantInfo(String did) {
			N_Node1 temp = Head;
			while(temp!=null) {
				if(did.equals(temp.docID)){
					System.out.println("Assistant name : "+temp.name);
					System.out.println("Assistant name : "+temp.nurseID);
					System.out.println("Contact number : "+temp.contact);
					break;
				}
				else {
					temp=temp.next;
				}
			}
			 if(temp==null) {
		    	  System.out.println("Sorry! This doctor ID is not exists.");
		      }
		}
		public int check_N_ID(String id) {
			N_Node1 temp=Head;
			while(temp!=null) {
		    	  if(id.equals(temp.nurseID)) {
		    		  return 1;
		    	  }
		    	  else {
		    		  temp=temp.next;
		    	  }
		      }
		      return 0;
		}
		public void get_nurseShift(String iD) {
			N_Node1 temp=Head;
		      while(temp!=null) {
		    	  if(temp.nurseID.equals(iD)) {
		    		  System.out.println("Shift:"+temp.shift);
		    		  break;
		    	  }
		    	  else {
		    		  temp=temp.next;
		    	  }
		      }
		      if(temp==null) {
		    	  System.out.println("Sorry! This nurse ID is not exists.");
		      }
		}
		public void get_currNPatient(String id) {
		      N_Node1 temp=Head;
		      while(temp!=null) {
		    	  if(temp.nurseID.equals(id)) {
		    		  System.out.println("Current Patient:"+temp.cp);
		    		  break;
		    	  }
		    	  else {
		    		  temp=temp.next;
		    	  }
		      }
		      if(temp==null) {
		    	  System.out.println("Sorry! This nurse ID is not exists.");
		      }
		}
		public void get_doctorInfo(String ID) {
			D_Node temp = head;
			while(temp!=null) {
				if(temp.ID.equals(ID)){
					System.out.println("Doctor name : "+temp.name);
					System.out.println("Doctor ID : "+temp.ID);
					System.out.println("Contact number : "+temp.mobNo);
					break;
				}
				else {
					temp=temp.next;
				}
			}
			if(temp==null) {
		    	  System.out.println("Sorry! This doctor ID is not exists.");
		      }
		}
		public void get_doctorName(String Dep) {
			D_Node temp=head;
			while(temp!=null) {
				if(Dep.equals(temp.department)) {
					System.out.println("Doctor name :"+temp.name);
					System.out.println("Doctor ID:"+temp.ID);
					System.out.println("Contact number:"+temp.mobNo);
					System.out.println();
				}
			    temp=temp.next;
			}
		}
		public void ICU_No() {
			
			System.out.println("Number of ICU remaining:"+(20-i));
	        if(i==20) {		
	        	System.out.println("All ICU's are filled");
	        	System.out.println("We inform you as soon as it becomes available.");
	        }
	        else {
	        	System.out.println("Want to move a patient in a ICU");
	        	System.out.println("Press 1 to move in and 0 to exit.");
	        	int c=sc.nextInt();
	        	if(c==1) {
	        		System.out.println("ICU bed is booked for patient.");
	        		i++;
	        	}
	        }
		}
	
	}
