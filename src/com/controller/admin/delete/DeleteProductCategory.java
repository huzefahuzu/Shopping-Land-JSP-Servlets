package com.controller.admin.delete;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MasterDelete;

/**
 * Servlet implementation class DeleteProductCategory
 */
public class DeleteProductCategory extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String tableName = "product_category";
		String category_Id="category_id";
		//System.out.println("hi..");
		if(new MasterDelete().deleteCheckedItem(tableName,category_Id,
				request.getParameterValues("chkDeleteCategory"))){
		
		request.getRequestDispatcher("CategoryList").forward(request, response);
		}else {
			request.setAttribute("categoryForgainKey", true);
			request.getRequestDispatcher("CategoryList").forward(request, response);
		}
	}

}
