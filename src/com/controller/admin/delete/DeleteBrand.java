package com.controller.admin.delete;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MasterDelete;

/**
 * Servlet implementation class DeleteBrand
 */
public class DeleteBrand extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (new MasterDelete().deleteCheckedItem("brand", "brandId",
				request.getParameterValues("chkDeleteBrand"))) {
			request.getRequestDispatcher("ccalbl").forward(request, response);
		} else {
			request.setAttribute("brandForgainKey", true);
			request.getRequestDispatcher("ccalbl").forward(request, response);
		}
	}

}
