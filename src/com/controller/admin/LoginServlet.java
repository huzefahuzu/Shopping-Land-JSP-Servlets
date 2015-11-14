package com.controller.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.AdminLoginBean;
import com.dao.AdminLoginDAO;
import com.util.controllerutil.Validation;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HttpSession session;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String adminUser = request.getParameter("adminUser");
		String adminPassword = request.getParameter("adminPassword");

		if (Validation.isEmpty(adminUser) && Validation.isEmpty(adminPassword)) {
			request.setAttribute("adminname", adminUser);
			request.setAttribute("adminpassword", adminPassword);
			request.getRequestDispatcher("index.jsp")
					.forward(request, response);
		} else {
			AdminLoginBean alb = new AdminLoginDAO().login(adminUser,
					adminPassword);
			if (alb != null) {
				System.out.println("here");

				System.out.println(adminUser + "===" + "np");

				session = request.getSession();
				session.setAttribute("admin", adminUser);
				session.setMaxInactiveInterval(6000);
				System.out.println(session.getAttribute("admin"));
				System.out.println("Session Created");
				response.sendRedirect("DashBoardList");
			}

			else {
				System.out.println("Login Failed");
				request.setAttribute("authentication",
						"<font color=red>*userName or password is invalid</font>");
				request.getRequestDispatcher("index.jsp").forward(request,
						response);
			}
		}

	}

}
