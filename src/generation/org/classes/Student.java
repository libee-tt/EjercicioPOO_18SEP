package generation.org.classes;

public class Student {
	public String firstName;
	public String lastName;
	public int registration;
	public int grade;
	public int year;

//Make the class with at least three different constructors.

//1er constructor - completo
public Student (String firstName, String lastName, 
				int registration, int grade, int year){
	this.firstName=firstName;
	this.lastName=lastName;
	this.registration=registration;
	this.grade=grade;
	this.year=year;
}//Student

//2do constructor - nombre y registration
public Student (String firstName, String lastName, 
		int registration){
this.firstName=firstName;
this.lastName=lastName;
this.registration=registration;
}//Student

//3er constructor - nombre, año y grade
public Student (String firstName, String lastName, 
		int grade, int year){
this.firstName=firstName;
this.lastName=lastName;
this.grade=grade;
this.year=year;
}//Student



public void printFullName(String firstName, String lastName){
    System.out.print(firstName+" "+lastName);
 }//printFullName

 public boolean isApproved(){
     //TODO implement: should return true if grade >= 60
	 if (grade >=60) {
		 return true;
	 } else {
		 return false;
	 }//else
	 
 }//isApproved

 public boolean changeYearIfApproved() {
	    if (isApproved()) {
	        year += 1;
	        return true; 
	    }//if
	    return false; 
	}//changeYear
 
}//class Student
