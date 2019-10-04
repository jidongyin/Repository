package cn.wolf.shiro.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "employeeServlet", urlPatterns = "/employee")
public class EmployeeServlet  extends HttpServlet {
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
    }

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String cmd = req.getParameter("cmd");
		if("input".equals(cmd)){
			String id =req.getParameter("id");
			if(id!=null){
				req.setAttribute("name", "tom");
				req.setAttribute("age", "20");
				req.setAttribute("email", "tom@520it.com");
				req.setAttribute("cmdType", "编辑");
			}else{
				req.setAttribute("cmdType", "新增");
			}
			req.getRequestDispatcher("/WEB-INF/views/employee/input.jsp").forward(req, resp);
		}else if("delete".equals("cmd")){
			
		}else{
			req.getRequestDispatcher("/WEB-INF/views/employee/list.jsp").forward(req, resp);
		}
	}
	
}
