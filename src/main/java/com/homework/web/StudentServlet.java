package com.homework.web;



import com.homework.service.CourseService;
import com.homework.service.StudentService;
import com.homework.service.impl.courseServiceImpl;
import com.homework.service.impl.studentServiceImpl;

import javax.servlet.annotation.WebServlet;

/**
 * @author 兵结藤诚
 * @version 1.0
 */
@WebServlet("/student/*")
public class StudentServlet extends BaseServlet{
    private StudentService service  = new studentServiceImpl();

}
