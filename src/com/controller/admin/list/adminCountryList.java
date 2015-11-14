package com.controller.admin.list;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.CategoryBean;
import com.dao.CountryAddDao;

/**
 * Servlet implementation class adminCountryList
 */
public class adminCountryList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<CategoryBean> list = new CountryAddDao().contryList();
		if (list != null) {
			System.out.println("country is not null");
			request.setAttribute("countryList", list);
			request.getRequestDispatcher("admin_add.jsp").forward(request,
					response);
		}
		else{
			System.out.println("CategoryList is null");
		}

	}

}
