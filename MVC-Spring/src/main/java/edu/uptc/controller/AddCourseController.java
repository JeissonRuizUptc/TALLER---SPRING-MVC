package edu.uptc.controller;

import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import edu.uptc.dao.Manager;
import edu.uptc.model.Course;

public class AddCourseController implements Controller{
	protected final Log logger = LogFactory.getLog(getClass());
	private Manager  manager = new Manager();
	
	
	
	
	
	
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int id = Integer.valueOf(request.getParameter("id_course"));

		String name = request.getParameter("name_course");
		String nameSchool = request.getParameter("name_school");
		String nameTeacher = request.getParameter("name_teacher");
		
		
		
		int time = Integer.valueOf(request.getParameter("time_course"));
		Course newCourse = new Course(id, name, nameSchool, time, nameTeacher);
		manager.addCourse(newCourse);
		request.getSession().setAttribute("oper", "success");
		PrintWriter out;
		
		out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<head><style>\"/css/empStyle.css\"></style> <title>Respuesta adicionar empleado</title></head>");
		out.println("<body>");
		
		
		out.println("<h1>Asignatura App</h1>");
		out.println("<h2>Asignatura adicionado exitosamente!</h2>");
		out.println("<a href=\"index.jsp\">Volver a la pagina inicial</a>");
		
		
		out.println("</body>");
		out.println("</html>");
		logger.info("ingresa a la vista AddCourse"); 
		return null;
	}

}

