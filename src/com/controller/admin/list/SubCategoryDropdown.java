package com.controller.admin.list;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.TypeBean;
import com.dao.CategoryDao;
import com.dao.TypeDao;

/**
 * Servlet implementation class SubCategoryDropdown
 */
public class SubCategoryDropdown extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<TypeBean> list = new TypeDao().TypeList();

		if (list != null) {
			request.setAttribute("typeDropdownList", list);
			request.getRequestDispatcher("subcategory_add.jsp").forward(
					request, response);
		} else {
			System.out.println("subcategory type list is null");
		}
	}

}
