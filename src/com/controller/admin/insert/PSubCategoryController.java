package com.controller.admin.insert;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.SubcategoryBean;
import com.dao.SubCategoryDao;
import com.util.controllerutil.Forword;
import com.util.controllerutil.Validation;
import com.util.controllerutil.Validation_SetAttribute;

/**
 * Servlet implementation class PSubCategoryController
 */
public class PSubCategoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		// create subCategaryBean object to set value
		SubcategoryBean scb = new SubcategoryBean();

		// get data from subCategory add request
		String typeId = request.getParameter("typeId");
		String categoryId = request.getParameter("categoryId");
		String subCategory_Name = request.getParameter("subCategory_Name");

		// create Validation_SetAttribute object to check validation and set
		// error for particular error.
		Validation_SetAttribute vs = new Validation_SetAttribute();

		vs.pageRedirect(Validation.isEmpty(subCategory_Name), "subCategory_Name",
				"please enter subcategory", request, "sub_categoryName",
				subCategory_Name);
		Forword.redirectError(vs.flag, request, response,
				"subcategory_add.jsp", scb, typeId, categoryId,
				subCategory_Name);
		Forword.showList(new SubCategoryDao().insertSubCategory(scb, vs.flag),
				request, response, "ccalscl");
	}

}
