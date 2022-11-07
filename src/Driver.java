import java.util.ArrayList;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database data = new Database();
		data.generateIntroductoryCourses();
		data.generateStudentList();
		ArrayList<Student> studentList = data.getStudentList();
		
		System.out.println(studentList.get(0).getFirstName());
		for (int i = 0; i < studentList.size(); i++) {
			Student a = studentList.get(i);
			a.addMajorCourse(data.getIntroductoryCourses());
		}
	
		for (int i = 0; i < studentList.size(); i++) {
			Schedule s1 = studentList.get(i).getStudentSchedule();
			Course major = s1.getMajorCourse();
			String courseName = major.getCourseName();
			System.out.println(courseName);
		}
		
	}

}
