package com.controller.admin.insert;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.CityBean;
import com.dao.CityDao;
import com.util.controllerutil.Forword;
import com.util.controllerutil.Validation;
import com.util.controllerutil.Validation_SetAttribute;

/**
 * Servlet implementation class CityController
 */
public class CityController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String countryId = request.getParameter("countryId");
		String stateId = request.getParameter("stateId");
		String cityName = request.getParameter("cityName");

		System.out.println(countryId);
		System.out.println(stateId);
		System.out.println(cityName);
		CityBean cb = new CityBean();
		Validation_SetAttribute vs = new Validation_SetAttribute();

		vs.pageRedirect(Validation.isEmpty(countryId), "countryId",
				"Please Select Contry", request);
		vs.pageRedirect(Validation.isEmpty(stateId), "stateId",
				"Please Select State", request);
		vs.pageRedirect(Validation.isEmpty(cityName), "cityName",
				"Please Enter Valid cityName", request, "cityValue", cityName);
		Forword.redirectError(vs.flag, request, response, "ccalcdl2", cb, countryId,
				cityName, stateId);
		Forword.showList(new CityDao().insert_city(cb, vs.flag), request,
				response, "ccalc");
	}

}
