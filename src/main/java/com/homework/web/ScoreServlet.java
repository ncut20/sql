package com.homework.web;

import com.homework.service.CourseService;
import com.homework.service.ScoreService;
import com.homework.service.impl.courseServiceImpl;
import com.homework.service.impl.scoreServiceImpl;

import javax.servlet.annotation.WebServlet;

/**
 * @author 兵结藤诚
 * @version 1.0
 */
@WebServlet("/score/*")
public class ScoreServlet extends BaseServlet{
    private ScoreService service  = new scoreServiceImpl();

}
