package com.homework.web;



import com.homework.service.CourseService;
import com.homework.service.TeacherService;
import com.homework.service.impl.courseServiceImpl;
import com.homework.service.impl.teacherServiceImpl;

import javax.servlet.annotation.WebServlet;

/**
 * @author 兵结藤诚
 * @version 1.0
 */
@WebServlet("/teacher/*")
public class TeacherServlet extends BaseServlet{
    private TeacherService service  = new teacherServiceImpl();

}
