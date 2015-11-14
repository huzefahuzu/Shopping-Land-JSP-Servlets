package com.controller.admin.list;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.TypeDao;
import com.util.listutil.DashBoardLists;

/**
 * Servlet implementation class DashBoardList
 */
public class DashBoardList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();

		String tableName[] = { "product_type", "product_category", "country",
				"product_subcategory", "state", "city", "brand", "size",
				"admin_info" };
		String dashBoardAttributes[] = { "typeDashBoardList",

		"categoryDashBoardList", "countryDashBoardList",
				"subCategoryDashBoardList", "stateDashBoardList", "cityList",
				"brandList", "sizeList", "adminList" };

		for (int i = 0; i < dashBoardAttributes.length; i++) {
			DashBoardLists.Product_TypeList(request, response,
					new DashBoardLists().list(tableName[i]),
					dashBoardAttributes[i]);

		}
		request.getRequestDispatcher("dashboard.jsp")
				.forward(request, response);
	}
}
