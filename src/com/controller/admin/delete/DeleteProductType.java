package com.controller.admin.delete;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MasterDelete;

;

/**
 * Servlet implementation class DeleteProductType
 */
public class DeleteProductType extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String tableName = "product_type";
		String type_Id="type_id";
		System.out.println("hi..");
		if(new MasterDelete().deleteCheckedItem(tableName,type_Id,
				request.getParameterValues("chkDelete"))){
		request.getRequestDispatcher("ccptl").forward(request, response);
	}
	else {
		request.setAttribute("typeForgainKey", true);
		request.getRequestDispatcher("ccptl").forward(request, response);
	}
}}
