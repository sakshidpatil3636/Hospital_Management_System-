
package project;
import Info.information;
import Ambulance.ambulance;
import java.util.*;
class Old_Node{
int age;
String gender;
int ID;
String name;
String DRname;
String dpname;
Old_Node next;
String docID;
public Old_Node (int age,String gender,int ID,String name,String DRname,String dpname,String docID){
this.age=age;
this.gender=gender;
this.ID=ID;
this.name=name;
this.DRname=DRname;
this.dpname=dpname;
this.docID=docID;
next=null;
}


Old_Node Old_head=null;
void create() {
Old_Node patient1 = new Old_Node(30, "Male", 101, "Rahul Sharma", "Dr. Aarav Sharma","Cardiology","D1");
Old_head=patient1;
Old_Node patient2 = new Old_Node(25, "Female", 102, "Sneha Patel", "Dr. Ankita Patel","Cardiology","D2");
patient1.next=patient2;
Old_Node patient3 = new Old_Node(45, "Male", 103, "Amit Verma", "Dr. Aarav Sharma","Cardiology","D1");
patient2.next=patient3;
Old_Node patient4 = new Old_Node(28, "Female", 104, "Neha Kapoor", "Dr. Vikram Khanna","Orthopedics","D5");
patient3.next=patient4;
Old_Node patient5 = new Old_Node(55, "Male", 105, "Sanjay Joshi", "Dr.Pooja Mehta","Neurology","D9");
patient4.next=patient5;
Old_Node patient6 = new Old_Node(32, "Female", 106, "Pooja Singh", "Dr.Pooja Mehta","Neurology","D9");
patient5.next=patient6;
Old_Node patient7 = new Old_Node(40, "Male", 107, "Ajay Mehta", "Dr. Dr.Arjun Verma","Oncology","D4");
patient6.next=patient7;
Old_Node patient8 = new Old_Node(22, "Female", 108, "Kavita Sharma", "Dr. Arjun Verma","Oncology","D4");
patient7.next=patient8;
Old_Node patient9 = new Old_Node(50, "Male", 109, "Manish Kapoor", "Dr. Vikram Khanna","Orthopedics","D5");
patient8.next=patient9;
Old_Node patient10 = new Old_Node(35, "Female", 110, "Shweta Gupta", "Dr. Aanya Desai","General Medicine","D8");
patient10.next=null;
}
}
class Appointment {

String department;
String doctorName;
String date;
int time;
String doc_id;
int patient_id;
Appointment next;
String gender;
public Appointment(String department, String doctorName, String date, int time,String doc_id,int patient_id,String gender) {
this.department = department;
this.doctorName = doctorName;
this.date = date;
this.time =time;
this.doc_id=doc_id;
this.patient_id=patient_id;
this.gender=gender;
this.next=null;
}
}
public class patient {
	static Old_Node Old_head=null;
	public void create() {
	Old_Node patient1 = new Old_Node(30, "Male", 101, "Rahul Sharma", "Dr. Aarav Sharma","Cardiology","D1");
	Old_head=patient1;
	Old_Node patient2 = new Old_Node(25, "Female", 102, "Sneha Patel", "Dr. Ankita Patel","Cardiology","D2");
	patient1.next=patient2;
	Old_Node patient3 = new Old_Node(45, "Male", 103, "Amit Verma", "Dr. Aarav Sharma","Cardiology","D1");
	patient2.next=patient3;
	Old_Node patient4 = new Old_Node(28, "Female", 104, "Neha Kapoor", "Dr. Vikram Khanna","Orthopedics","D5");
	patient3.next=patient4;
	Old_Node patient5 = new Old_Node(55, "Male", 105, "Sanjay Joshi", "Dr.Pooja Mehta","Neurology","D9");
	patient4.next=patient5;
	Old_Node patient6 = new Old_Node(32, "Female", 106, "Pooja Singh", "Dr.Pooja Mehta","Neurology","D9");
	patient5.next=patient6;
	Old_Node patient7 = new Old_Node(40, "Male", 107, "Ajay Mehta", "Dr. Dr.Arjun Verma","Oncology","D4");
	patient6.next=patient7;
	Old_Node patient8 = new Old_Node(22, "Female", 108, "Kavita Sharma", "Dr. Arjun Verma","Oncology","D4");
	patient7.next=patient8;
	Old_Node patient9 = new Old_Node(50, "Male", 109, "Manish Kapoor", "Dr. Vikram Khanna","Orthopedics","D5");
	patient8.next=patient9;
	Old_Node patient10 = new Old_Node(35, "Female", 110, "Shweta Gupta", "Dr. Aanya Desai","General Medicine","D8");
	patient10.next=null;
	}
static int P_ID=119;
static int s=9;
static Appointment head=null;
ambulance a=new ambulance();
Scanner sc = new Scanner(System.in);
information obj=new information();
public void info() {
a.insert_ambulance();
int choice=0;
do{
System.out.println("----------------------------------------------------");
System.out.println("Which information do you want to access :: ");

System.out.println("Choose option from following:");
System.out.println();
System.out.print("1.AVAILABLE DEPARTMENTS \n2.DEPARTMENT FLOORS\n3.TIMING SCHEDULE\n4.BOOK APPOINTMENT\n5.BOOK AMBULANCE\n6.EXIT(patient) \n");

choice = sc.nextInt();
switch (choice) {
case 1:
obj.display_department();
System.out.println("------------------------------------------------");
break;
case 2:
System.out.println("The department and department floors are as follows:");
obj.display_depFloors();
System.out.println("--------------------------------------------------");
System.out.println();
break;
case 3:
System.out.println("The timing schedule is as follows:");
System.out.println("--------------------------------------------------");
obj.display_timing_schedule();
break;
case 4:
newAppointment();
break;
case 5:
int p=a.book_ambulance();
System.out.println("the Ambulance is booked with number :: "+ p );
break;
case 6:
System.out.println("EXIT from patient !");
break;
default:
System.out.println("Invalid choice! Please select a valid option.");
break;
}
}while(choice!=6);
}
public void appointment() {
Appointment newAppointment = new Appointment("Cardiology","Dr.Aarav Sharma","12/12/2023",11,"D1",111,"male");
head=newAppointment;
Appointment newAppointment2 = new Appointment("Cardiology","Dr.Aarav Sharma","12/12/2023",14,"D1",112,"female");
newAppointment.next=newAppointment2;
Appointment newAppointment3 = new Appointment("Cardiology","Dr.Aarav Sharma","12/12/2023",15,"D1",113,"male");
newAppointment2.next=newAppointment3;
Appointment newAppointment4= new Appointment("Cardiology","Dr.Aarav Sharma","12/12/2023",16,"D1",114,"female");
newAppointment3.next=newAppointment4;
Appointment newAppointment5= new Appointment("Oncology","Dr.Riya Singh","12/12/2023",13,"D4",115,"male");
newAppointment4.next=newAppointment5;
Appointment newAppointment6= new Appointment("Oncology","Dr.Riya Singh","12/12/2023",14,"D4",116,"female");
newAppointment5.next=newAppointment6;
Appointment newAppointment7= new Appointment("Oncology","Dr.Riya Singh","12/12/2023",15,"D4",117,"male");
newAppointment6.next=newAppointment7;
Appointment newAppointment8= new Appointment("Oncology","Dr.Riya Singh","12/12/2023",16,"D4",118,"female");
newAppointment7.next=newAppointment8;
}
public void newAppointment() {
String dept = null;
String doc_name = null;
String doc_id = null;
String gender = null;
String date=null;
String contact=null;
int time;
int patient_id = 0;
String P_name;
System.out.println("Input the following details to book an appointment-->");
//sc.nextLine();
System.out.println();
while(true) {
String status;
System.out.println("Enter status - (new/old patient): ");
//System.out.println("(Enter 'exit' to exit appointment)");
status = sc.next();

if(status.equalsIgnoreCase("old")||status.equalsIgnoreCase("new")) {
if(status.equalsIgnoreCase("new")) {
int c1;
obj.display_department();
System.out.println();
System.out.print("Choose department from above:");
int d= sc.nextInt();
System.out.println();
System.out.println("Doctor of this department are as follows:");
System.out.println();
switch(d) {
case 1:dept="Cardiology";
obj.get_doctorName(dept);
break;
case 2:dept="Oncology";
obj.get_doctorName(dept);
break;
case 3:dept="orthopedics";
obj.get_doctorName(dept);
break;
case 4:dept="General Medicine";
obj.get_doctorName(dept);
break;
case 5:dept="Neurology";
obj.get_doctorName(dept);
break;
default:
System.out.println("Invalid choice !");
 break;
}
//System.out.println("--------------------------------------------------");
System.out.print("Enter the speciality doctor id: ");
doc_id = sc.nextLine();
sc.next();
System.out.println("----------------------");
System.out.print("Select gender (1-male;2-female):");
gender=sc.nextLine();
sc.next();
System.out.println("---------------------");
int age;
do {
System.out.print("Enter age: ");
while (!sc.hasNextInt()) {
String input = sc.next();
System.out.printf("\"%s\" is not a valid age. Please enter a valid age: %n", input);
}
age = sc.nextInt();
if (age < 0 || age > 150) {
System.out.println("Invalid age. Please enter a valid age between 0 and 150.");
} 
} while (age < 0 || age > 150);
System.out.println("---------------------");
patient_id=P_ID;
System.out.println("Your patient ID is:"+P_ID);
P_ID++;
break;
}
else if(status.equalsIgnoreCase("old")) {
//System.out.println("---------------------------------------------------");
int flag=0;
System.out.println("----------------------");
System.out.println("Press 1 to continue with same Department/Doctor.");
System.out.println("Press 0 to change the Department/Doctor");
int no=sc.nextInt();
System.out.println("------------------");
if(no==1) {
	while(true) {
 System.out.print("Enter your id:");
 int id=sc.nextInt();
 Old_Node temp=Old_head;
 
  while(temp!=null && temp.ID!=id) {
     temp=temp.next;
}
if(temp==null) {
System.out.println("This ID is not exixts.");
System.out.println("Please eter valid ID.");
}    
else {
gender=temp.gender;
P_name=temp.name;
doc_name=temp.DRname;
doc_id=temp.docID;
dept=temp.dpname;
break;
}
}
}
if(no==0) {

while(true) {
	Old_Node temp=Old_head;
System.out.println("Enter your id:");
int id=sc.nextInt();
while(temp!=null && temp.ID!=id) {
    temp=temp.next;
}
if(temp==null) {
System.out.println("This ID is not exists.");//********
System.out.println("Please enter valid ID.");//*********
}    
else {
gender=temp.gender;
P_name=temp.name;
doc_name=temp.DRname;
break;
}
}
obj.display_department();
System.out.println();
System.out.print("Choose department from above:");
int d= sc.nextInt();
System.out.println();
System.out.println("Doctor of this department are as follows:");
System.out.println();
switch(d) {
case 1:dept="Cardiology";
obj.get_doctorName(dept);
break;
case 2:dept="Oncology";
obj.get_doctorName(dept);
break;
case 3:dept="orthopedics";
obj.get_doctorName(dept);
break;
case 4:dept="General Medicine";
obj.get_doctorName(dept);
break;
case 5:dept="Neurology";
obj.get_doctorName(dept);
break;
default:
System.out.println("Invalid choice !");
 break;
}

sc.nextLine();
System.out.print("Enter the speciality doctor id: ");
doc_id = sc.nextLine();
}
break;
}
else {
	System.out.println("Please enter valid status..");
}
}
}
System.out.println("---------------------");
do {
System.out.print("Enter contact: ");
contact = sc.next();
if (contact.length() != 10 || !contact.matches("[0-9]+")) {
System.out.println("Enter your phone number with 10 digits: ");
} 
} while (contact.length() != 10 || !contact.matches("[0-9]+"));
System.out.println("---------------------");
while (true) {
System.out.println("enter the convenient date -->");
System.out.print("Enter the date in (dd/mm/yyyy): ");
date = sc.next();
sc.nextLine();
if (date.matches("\\d{2}/\\d{2}/\\d{4}")) {
break;
} else {
	System.out.println();
System.out.println("Invalid date format! Please use the format (dd/mm/yyyy).");
System.out.println();
}
}System.out.println("---------------------");

while (true) {
System.out.print("Enter the time (between 10 am - 6 pm)(24 hour clock): ");
time = sc.nextInt();
if (time >= 10 && time <= 18) {
break;
} else {
	System.out.println();
System.out.println("Invalid time! Please choose a time between 10 am and 6 pm.");
System.out.println();
}
}
System.out.println("--------------------");
System.out.println("Prior booking fee is mandatory. Please pay before your booked date!");

System.out.println();

System.out.println("APPOINTMENT BOOKED........!");
System.out.println();
Appointment newAppointment1 = new Appointment(dept, doc_name, date, time,doc_id,patient_id,gender);
if(head==null) {
head=newAppointment1;
}else {
Appointment temp=head;
while(temp.next!=null) {temp=temp.next;}
temp.next=newAppointment1;
}
}
public void dequeue() {
if(head==null) {
	System.out.println("No current patients available.");
}
else {
head=head.next;
System.out.println("Patient has completed the appointment !");
}
}
public void get_patientInfo(String d_id) {
Appointment temp=head;
if(head==null) {System.out.println("no current patient available !");}
while(temp!=null && temp.doc_id.equals(d_id)) {
System.out.println("Patient ID:"+temp.patient_id);
System.out.println("Patient gender:"+temp.gender);
System.out.println("Appointment date:"+temp.date);
temp=temp.next;
System.out.println();
}
}

public void display_Old_Patient() {
	Old_Node temp=Old_head;
	if(Old_head==null) {
		System.out.println("No past patients are available.");
	}	
	System.out.println("This are the list of past patients:");
	while(temp!=null) {
		System.out.println("Patient ID:"+temp.ID);
		System.out.println("Patient name :"+temp.name);
		System.out.println("Department:"+temp.dpname);
		System.out.println("Doctor name:"+temp.DRname);
		System.out.println("Patient gender:"+temp.gender);
		System.out.println("Patient age:"+temp.age);
		System.out.println();
		temp=temp.next;
	}
}


}


