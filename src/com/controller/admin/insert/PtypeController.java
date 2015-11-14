package com.controller.admin.insert;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.TypeBean;
import com.dao.TypeDao;
import com.util.controllerutil.Forword;
import com.util.controllerutil.Validation;
import com.util.controllerutil.Validation_SetAttribute;

/**
 * Servlet implementation class PtypeController
 */
public class PtypeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		TypeBean lb = new TypeBean();
		String pType = request.getParameter("pType");
		System.out.println(pType);
		Validation_SetAttribute vs = new Validation_SetAttribute();
		vs.pageRedirect(Validation.isEmpty(pType), "pType",
				"Please Insert any Value", request, "ptypeVal", pType);

		Forword.redirectError(vs.flag, request, response, "ptype_add.jsp", lb,
				pType);

		Forword.showList(new TypeDao().insertType(lb, vs.flag), request,
				response, "ccptl");

	}

}
