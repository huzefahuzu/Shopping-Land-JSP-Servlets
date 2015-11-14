package com.controller.admin.delete;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MasterDelete;

/**
 * Servlet implementation class DeleteState
 */
public class DeleteState extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		if(new MasterDelete().deleteCheckedItem("state","state_id",
				request.getParameterValues("chkDeleteState"))){
		
		request.getRequestDispatcher("ccalsl").forward(request, response);
		}else {
			request.setAttribute("stateForgainKey", true);
			request.getRequestDispatcher("ccalsl").forward(request, response);
		}
	}

}
