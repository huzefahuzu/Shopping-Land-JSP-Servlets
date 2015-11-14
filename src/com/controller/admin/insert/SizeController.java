package com.controller.admin.insert;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.SizeBean;
import com.dao.SizeDao;
import com.util.controllerutil.Forword;
import com.util.controllerutil.Validation;
import com.util.controllerutil.Validation_SetAttribute;

/**
 * Servlet implementation class SizeController
 */
public class SizeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String size = request.getParameter("sizeMatch");
		String category = request.getParameter("category");

		Validation_SetAttribute vs = new Validation_SetAttribute();
		vs.pageRedirect(Validation.isEmpty(category), "category",
				"please select any option", request);
		vs.pageRedirect(Validation.isEmpty(size), "SizeMatch",
				"please Enter any size", request, "size", size);
		SizeBean sb = new SizeBean();
		Forword.redirectError(vs.flag, request, response, "size_add.jsp", sb,
				category, size);
		Forword.showList(new SizeDao().insertSize(vs.flag, sb), request,
				response, "SizeList");

	}
}
