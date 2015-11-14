package com.controller.admin.insert;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.CategoryBean;
import com.dao.CategoryDao;
import com.util.controllerutil.Forword;
import com.util.controllerutil.Validation;
import com.util.controllerutil.Validation_SetAttribute;

/**
 * Servlet implementation class PCatControl
 */
public class PCategoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		CategoryBean cb = new CategoryBean();
		String typeId = request.getParameter("typeId");
		String category_name = request.getParameter("category_name");

		Validation_SetAttribute vs = new Validation_SetAttribute();
		vs.pageRedirect(Validation.isEmpty(category_name), "category_name",
				"Plese Enter Category", request, "cat_name", category_name);
		Forword.redirectError(vs.flag, request, response, "", cb, typeId,
				category_name);
		Forword.showList(new CategoryDao().insert_category(cb, vs.flag),
				request, response, "CategoryList");

	}
}
