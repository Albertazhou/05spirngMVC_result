package can.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controll {
	
	@RequestMapping("/hello")
	public void hello(HttpServletRequest req,HttpServletResponse rep) throws IOException, ServletException {
		//rep.getWriter().println("this is controller use servlet api");
		//rep.sendRedirect("index.jsp");
		req.setAttribute("msg", "hello servlet sendr");
		req.getRequestDispatcher("index.jsp").forward(req, rep);

	}
	
	@RequestMapping("/hello2")
	public String hello() {
		return "redirect:index.jsp";
	}
	
	@RequestMapping("/hello3")
	public String hello3() {
		return "redirect:hello.do";
	}

}
