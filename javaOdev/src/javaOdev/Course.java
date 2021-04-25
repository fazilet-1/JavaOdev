package javaOdev;

public class Course {

	  public Course() {
		  System.out.println("Ben çalýþtým!!");
	  }
	
	  public  Course(int id,String courseName,String teacherName,int percent) {
		  this();
		  this.id=id;
		  this.courseName=courseName;
		  this.teacherName=teacherName;
		  this.percent=percent;
	  }
	 int id;
	 String courseName;
	 String teacherName;
	 int percent;
	 
}
