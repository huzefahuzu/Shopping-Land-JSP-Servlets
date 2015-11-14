package com.controller.admin.delete;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MasterDelete;

/**
 * Servlet implementation class DeleteProductSubcategory
 */
public class DeleteProductSubcategory extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		if (new MasterDelete().deleteCheckedItem("product_subcategory",
				"subcategory_id",
				request.getParameterValues("chkDeleteSubCategory"))) {
			request.getRequestDispatcher("ccalscl").forward(request, response);
		} else {
			request.setAttribute("subCategoryForgainKey", true);
			request.getRequestDispatcher("ccalscl").forward(request, response);
		}
	}

}
