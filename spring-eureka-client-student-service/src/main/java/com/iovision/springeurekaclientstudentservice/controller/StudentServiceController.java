package com.iovision.springeurekaclientstudentservice.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iovision.springeurekaclientstudentservice.models.Student;
 
 
@RestController
public class StudentServiceController {
 
	 @Autowired
     Environment environment;
  private static Map<String, List<Student>> schooDB = new HashMap<String, List<Student>>();
 
  static {
    schooDB = new HashMap<String, List<Student>>();
 
    List<Student> lst = new ArrayList<Student>();
    Student std = new Student("Sajal", "Class IV");
    lst.add(std);
    std = new Student("Lokesh", "Class V");
    lst.add(std);
 
    schooDB.put("abcschool", lst);
 
    lst = new ArrayList<Student>();
    std = new Student("Kajal", "Class III");
    lst.add(std);
    std = new Student("Sukesh", "Class VI");
    lst.add(std);
 
    schooDB.put("xyzschool", lst);
 
  }
 
  @RequestMapping(value = "/getStudentDetailsForSchool/{schoolname}", method = RequestMethod.GET)
public String getStudents(@PathVariable String schoolname) {

//  public List<Student> getStudents(@PathVariable String schoolname) {
    System.out.println("Getting Student details for " + schoolname);
 
    List<Student> studentList = schooDB.get(schoolname);
    if (studentList == null) {
      studentList = new ArrayList<Student>();
      Student std = new Student("Not Found", "N/A");
      studentList.add(std);
    }
    return "data of STIDENT_SERVICE, Running on port: "
    +environment.getProperty("local.server.port");
  //  return studentList;
  }
}
