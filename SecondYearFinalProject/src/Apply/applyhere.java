package Apply;
import Info.information;
import java.util.Scanner;
public class applyhere{
static int i=0,count;
Scanner sc=new Scanner(System.in);
int age;
String role;
float years_Of_Exp;
String qualification;
String dp;
applyhere[] apply = new applyhere[10];

public applyhere() {
    // Default constructor
}
applyhere(int age, String role, float yearsOfExp, String qualification, String department) {
    this.age = age;
    this.role = role;
    this.years_Of_Exp = yearsOfExp;
    this.qualification = qualification;
    this.dp = department;
}
public void enterApplicants() {
	information obj=new information();
    Scanner sc = new Scanner(System.in);
    while(i<10) {
        apply[i] = new applyhere();
        System.out.println("Fill up following details .....");
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
        apply[i].age = age;

        System.out.print("Enter the role you want to apply:");
        apply[i].role = sc.next();

        System.out.print("Enter your experience:");
        while (!sc.hasNextFloat()) {
            System.out.println("Invalid input. Please enter a valid experience:");
            sc.next();
        }
        apply[i].years_Of_Exp = sc.nextFloat();

        System.out.print("Enter your qualification:");
        apply[i].qualification = sc.next();
        obj.display_department();
        System.out.println();
        System.out.print("Choose department from above:");
        int d= sc.nextInt();
        System.out.println();
        switch(d) {

        case 1:
        	apply[i].dp="Cardiology";
            break;
        case 2:
        	apply[i].dp="Oncology";
             break;
        case 3:
        	apply[i].dp="orthopedics";
             break;
        case 4:
        	apply[i].dp="General Medicine";
            break;

        case 5:
        	apply[i].dp="Neurology";
            break;
        default:
        	System.out.println("Invalid choice !");
            break;
        }


System.out.println("Your information is considered!");
 System.out.println("Filling this information does not guarantee your selection!\nIt is based on the interview.\r\n"
  + "");
i++;
count++;
break;
}
}
public void displayApply() {
if(apply[0]==null) {
	System.out.println("No applicant are present.");
}
else {
for(int j=0;j<count;j++) {
System.out.println("details of the "+(j+1)+" Applicants");
System.out.println("age: "+apply[j].age);
     System.out.println("role: "+apply[j].role);
     System.out.println("years of experience: "+apply[j].years_Of_Exp);
     System.out.println("qualification :"+apply[j].qualification);
     System.out.println("department : "+apply[j].dp);
     System.out.println();
}
}
}
}


