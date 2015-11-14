package com.controller.admin.list;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.TypeBean;
import com.dao.TypeDao;
import com.util.listutil.SendListToView;

/**
 * Servlet implementation class BrandDropdown
 */
public class BrandDropdown extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<TypeBean> typeList = new TypeDao().list();
		SendListToView slv = new SendListToView();
		slv.sendList(typeList, "typeList", typeList, request);
		slv.forwardList(request, response, "brand_add.jsp");
	}

}
