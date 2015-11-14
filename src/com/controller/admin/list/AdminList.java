package com.controller.admin.list;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.AdminBean;
import com.dao.AdminLoginDAO;
import com.util.listutil.SendListToView;

/**
 * Servlet implementation class AdminList
 */
public class AdminList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<AdminBean> adminList = new AdminLoginDAO().showAdminList();
		SendListToView slv = new SendListToView();
		slv.sendList(adminList, "adminList",adminList, request);
		slv.forwardList(request, response, "admin.jsp");
	}

}
