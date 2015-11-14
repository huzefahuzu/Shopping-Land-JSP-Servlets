package com.controller.admin.insert;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.StateBean;
import com.dao.StateDao;
import com.util.controllerutil.Forword;
import com.util.controllerutil.Validation;
import com.util.controllerutil.Validation_SetAttribute;

/**
 * Servlet implementation class StateController
 */
public class StateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String countryId = request.getParameter("countryId");
		String stateName = request.getParameter("stateName");

		StateBean sb = new StateBean();
		Validation_SetAttribute vs = new Validation_SetAttribute();

		vs.pageRedirect(Validation.isEmpty(countryId), "countryId",
				"please select any country", request);
		vs.pageRedirect(Validation.isEmpty(stateName), "stateName",
				"please enter state name", request, "state", stateName);
		Forword.redirectError(vs.flag, request, response, "ccalcdl", sb,
				countryId, stateName);
		Forword.showList(new StateDao().insertState(vs.flag, sb), request,
				response, "ccalsl");
	}

}
