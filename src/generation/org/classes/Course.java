package generation.org.classes;

import java.util.ArrayList;
import java.util.Iterator;

public class Course {
	String courseName;
	String professorName;
	int year;
	int totalStudents=0;
	
	ArrayList<Student> students=new ArrayList<>();
	
	public Course(String courseName, String professorName,int year) {
		this.courseName=courseName;
		this.professorName=professorName;
		this.year=year;
	}//Course
	

	public void enroll(Student student){
		students.add(student);
		totalStudents ++;
	}//enroll

	   public void unEnroll(Student student) {
		   Iterator<Student>iterator=students.iterator();
		   while (iterator.hasNext()) {
			   Student s = iterator.next();
			   if (s.registration==student.registration) {
				   iterator.remove();
				   break;
			   }//if
		   }//while
	   }//unEnroll

	   public int countStudents(){
	       return totalStudents;
	   }//countStudents
	   
	   public int bestGrade(){
	       int best=0;
	       for (Student student : students) {
	    	   if (student.grade > best) {
	    		   best=student.grade;
	    	   }//if
	       }//for
		   return best;
	   }//bestGrade
	
	   public void enroll(Student[] studentsArray){
		   for (Student student : studentsArray) {
			   enroll(student);
		   }//for 
	   }//enroll overload
	   
	   
	   //Challenge
	   public double calcAverageGrade() {
		   int totalGrades = 0;
		   for (Student student:students) {
			   totalGrades += student.grade;
		   }//for
		   return students.size()==0?0:(double)totalGrades/students.size();
	   }//averageGrade
	   
	   public void checkIfAboveAverage() {
		   double averageGrade=calcAverageGrade();
		   for (Student student:students) {
			   student.printFullName(student.firstName, student.lastName);
			   if (student.grade >= averageGrade) {
				   System.out.println(" grade, is above the average in the course: "+courseName);
			   } else {
				   System.out.println(" grade, is below the average in the course: "+courseName);
			   }//else
		   }//for
	   }//checkIfAboveAverage
	   
	
}//class Course
