package com.controller.admin.list;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.CategoryBean;
import com.dao.CountryAddDao;
import com.util.listutil.SendListToView;

/**
 * Servlet implementation class CountryList
 */
public class CountryList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		List<CategoryBean> list = new CountryAddDao().contryList();
		if (list != null) {
			System.out.println("country is not null");
			request.setAttribute("countryList", list);
			request.getRequestDispatcher("country.jsp").forward(request,
					response);
			

		}
		else{
			System.out.println("CategoryList is null");
		}
	}

}
