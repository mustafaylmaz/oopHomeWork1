package oopHomeWork1.Business;

import oopHomeWork1.Entities.Course;

public class CourseManager implements ICourseService{

	public Course course;
	
	public CourseManager(Course course) {
		this.course = course;
	}
	


	@Override
	public void Add(Course course) {
		System.out.println(course.CourseName + " Eklendi");
		
	}

	@Override
	public void Delete(Course course) {
		System.out.println(course.CourseName +" Silindi");
		
	}

	@Override
	public void Update(Course course) {
		System.out.println(course.CourseName +" Guncellendi");
		
	}



}
