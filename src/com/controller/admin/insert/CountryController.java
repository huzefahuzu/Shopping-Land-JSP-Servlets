package com.controller.admin.insert;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.CountryBean;
import com.dao.CategoryDao;
import com.dao.CountryAddDao;
import com.util.controllerutil.Forword;
import com.util.controllerutil.Validation;
import com.util.controllerutil.Validation_SetAttribute;

public class CountryController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		CountryBean cb = new CountryBean();
		String countryname = request.getParameter("country_name");

		Validation_SetAttribute vs = new Validation_SetAttribute();
		vs.pageRedirect(Validation.isEmpty(countryname), "countryname",
				"Plese Enter Country Name", request, "country_name",
				countryname);
		Forword.redirectError(vs.flag, request, response, "", cb, countryname,
				countryname);
		Forword.showList(new CountryAddDao().addCountry(cb, vs.flag), request,
				response, "CountryList");
	}

}
