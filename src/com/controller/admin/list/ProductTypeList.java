package com.controller.admin.list;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.TypeDao;
import com.util.listutil.SendListToView;

/**
 * Servlet implementation class ProductTypeList
 */
public class ProductTypeList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<com.bean.TypeBean> list = new TypeDao().list();

		SendListToView slv = new SendListToView();
		slv.sendList(list, "list", list, request);
		slv.setForgainKey("forgainKey", request.getAttribute("typeForgainKey"),
				request);
		slv.forwardList(request, response, "producttype.jsp");

	}

}
