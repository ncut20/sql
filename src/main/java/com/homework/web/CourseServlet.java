package com.homework.web;

import com.alibaba.fastjson.JSON;
import com.homework.service.CourseService;
import com.homework.service.impl.courseServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.util.List;

/**
 * @author 兵结藤诚
 * @version 1.0
 */
@WebServlet("/course/*")
public class CourseServlet extends BaseServlet{
    private CourseService service  = new courseServiceImpl();

}
