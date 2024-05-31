package com.example.mvc.controller;

import com.example.mvc.model.Course;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/course")
public class CourseController {

    @GetMapping("/get")
    public String getCourseInfoWithCourseObject(Model model){
        Course course = new Course(1,"DevOps",4999.99);
        model.addAttribute("courseInfo",course);
        return "course";
    }

    @GetMapping("/getDetails")
    public String getCourseInfo(Map<String,Object> model){
        model.put("courseId",101);
        model.put("courseName","Golang");
        model.put("coursePrice",1000);
        return "courseInfo";
    }

}
