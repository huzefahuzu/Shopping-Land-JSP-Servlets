package com.controller.admin.list;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.brandDao;
import com.util.listutil.SendListToView;

/**
 * Servlet implementation class BrandList
 */
public class BrandList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		List brandList = new brandDao().showBrandList();
		SendListToView slv = new SendListToView();
		slv.sendList(brandList, "brandList", brandList, request);
		slv.forwardList(request, response, "brand.jsp");
	}

}
