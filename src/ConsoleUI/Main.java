package ConsoleUI;

import oopHomeWork1.Business.CourseManager;
import oopHomeWork1.Entities.Course;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course();
		
		course1.CourseId = 1;
		course1.CategoryId = 1;
		course1.Price = 0;
		course1.CourseName = "Java kursu";
		course1.isActive = true;
		course1.TrainerId=1;
		course1.ProgramId=1;

		
		CourseManager courseManager = new CourseManager(course1);

		
		courseManager.Add(course1);
		courseManager.Update(course1);
		courseManager.Delete(course1);

	}

}
