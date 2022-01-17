package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Courses;

@Service
public class CourseServiceimpl implements CourseService {

	//List<Courses> list;
	@Autowired
	private CourseDao courseDao;
	
	public CourseServiceimpl() {
		//list=new ArrayList<>();
		//list.add(new Courses(145,"java","description"));
		//list.add(new Courses(4356,"springboot","creation"));
	}



	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		//return list;
		return courseDao .findAll();
	}



	@SuppressWarnings("deprecation")
	@Override
	public Courses getCourse(long courseId) {
		
		//Courses c=null;
		
	  //for(Courses course:list)
	  //{
		// if(course.getId()==courseId)
		 //{
			// c=course;
			 //break;
		 //}
		  
	  //}
		return courseDao.getOne(courseId);
	}



	@Override
	public Courses addCourse(Courses course) {
		//list.add(course);
	//	return course;
		courseDao.save(course);
		return course;
	}

}
