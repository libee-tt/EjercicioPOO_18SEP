package generation.org;

import java.util.ArrayList;
import java.util.List;

import generation.org.classes.Course;
import generation.org.classes.Student;

public class Main {

	public static void main(String[] args) {
		//Crear estudiantes 
		Student student1=new Student("Juan", "Gabriel", 1, 95, 1);
		Student student2=new Student("María", "Félix", 2, 95, 1);
		Student student3=new Student("Agustín", "Lara", 3, 78, 1);
		Student student4=new Student("Pedro", "Fernández", 4, 58, 2);
		
		//colección 
		List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
		
		//Crear curso 
		Course javaCourse = new Course("JAVA", "Professor JC", 1);
		
		
		//Inscripción
		javaCourse.enroll(student1);
		javaCourse.enroll(student2);
		javaCourse.enroll(student4);
		
		
		System.out.println("== Java Course ==");
		System.out.println("Number of students: " + javaCourse.countStudents());
		System.out.println("Best Grade: " + javaCourse.bestGrade());
		System.out.println("==================");

		
		//Inscripción grupo de estudiantes
		Student[] newStudents= {student3};
		javaCourse.enroll(newStudents);
		
		//Número de estudiantes
		System.out.println("New number of students in Java Course: " + javaCourse.countStudents());
		
		//Promedio
		System.out.println("==================");
		System.out.println("Average grade in Java Course: "+javaCourse.calcAverageGrade());
		System.out.println("==================");
		
		//Arriba promedio
		javaCourse.checkIfAboveAverage();
		
		//cambio de año
		for (Student student : students) {
            if (student.changeYearIfApproved()) {
            	System.out.println("============");
                student.printFullName(student.firstName, student.lastName);
                System.out.println(" is now in year: " + student.year);
            }
        }

	}//main

}//class Main
