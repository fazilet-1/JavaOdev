package javaOdev;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)", "Engin DEMÝROÐ", 78);
        Course course2 = new Course(2,"Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)","Engin DEMÝROÐ",32);
        Course course3 = new Course(3,"Programlamaya Giriþ için Temel Kurs","Engin DEMÝROÐ",0);
        
        System.out.println("****** KURSLAR ******");
        
        Course [] courses= {course1,course2,course3};
        
        for (Course course : courses) {
			System.out.println(course.id+" "+course.courseName+" "+course.teacherName+" "+course.percent);
		}
		
        buttonManager buttonmanager=new buttonManager();
        buttonmanager.previousLesson(course1);
        buttonmanager.previousLesson(course2);
        buttonmanager.previousLesson(course3);
        
        buttonmanager.Button2(course1);
        buttonmanager.Button2(course2);
        buttonmanager.Button2(course3);
	}

}
