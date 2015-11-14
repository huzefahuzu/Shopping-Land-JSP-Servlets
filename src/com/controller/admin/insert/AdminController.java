package com.controller.admin.insert;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.AdminBean;
import com.bean.SuperBean;
import com.dao.AdminLoginDAO;
import com.util.controllerutil.Forword;
import com.util.controllerutil.PatternData;
import com.util.controllerutil.Validation;
import com.util.controllerutil.Validation_SetAttribute;

/**
 * Servlet implementation class AdminController
 */
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String firstName = request.getParameter("firstName");
		String middelName = request.getParameter("middelName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String dateOfBirth = request.getParameter("dob");
		String gender = request.getParameter("gender");
		String country = request.getParameter("country");
		String state = request.getParameter("state");
		String city = request.getParameter("city");
		String mobile = request.getParameter("mobile");
		String address = request.getParameter("address");
		String exp = "year= " + request.getParameter("year") + " month= "
				+ request.getParameter("month") + " day= "
				+ request.getParameter("day");
		String is_Available = request.getParameter("is_Available");
		try {
			// String currentDate = "2014-10-01 00:00:00.0";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
					"yyyy-MM-dd");
			Date tempDate = simpleDateFormat.parse(dateOfBirth);
			SimpleDateFormat outputDateFormat = new SimpleDateFormat(
					"dd/MM/YYYY");
			dateOfBirth = outputDateFormat.format(tempDate);
		} catch (ParseException ex) {
			System.out.println("Parse Exception");
		}
System.out.println("country="+country);
System.out.println("state="+state);
System.out.println("city="+city);
		Validation_SetAttribute vs = new Validation_SetAttribute();

		vs.pageRedirect(Validation.isEmpty(firstName), "firstName",
				"error4.jpg", request, "firstNameVal", firstName);
		vs.pageRedirect(Validation.isEmpty(middelName), "middelName",
				"error4.jpg", request, "middelNameVal", middelName);
		vs.pageRedirect(Validation.isEmpty(lastName), "lastName",
				"error4.jpg", request, "lastNameVal", lastName);
		vs.pageRedirect(Validation.isValidate(email, PatternData.email),
				"email", "error4.jpg", request, "emailVal", email);
		vs.pageRedirect(Validation.isValidate(password, PatternData.password),
				"password", "error4.jpg", request, "passVal",
				password);
		vs.pageRedirect(Validation.isEmpty(dateOfBirth), "dob",
				"error4.jpg", request,"dobVal",dateOfBirth);
		vs.pageRedirect(Validation.isEmpty(gender), "gender", "error4.jpg",
				request);
		vs.pageRedirect(Validation.isEmpty(country), "country",
				"error4.jpg", request);
		vs.pageRedirect(Validation.isEmpty(state), "state", "error4.jpg",
				request);
		vs.pageRedirect(Validation.isEmpty(city), "city", "error4.jpg",
				request);
		vs.pageRedirect(Validation.isValidate(mobile, PatternData.phone),
				"mobile", "error4.jpg", request,
				"mobileVal", mobile);
		vs.pageRedirect(Validation.isEmpty(address), "address",
				"error4.jpg", request, "addressVal", address);
		vs.pageRedirect(Validation.isEmpty(is_Available), "isAvailable",
				"error4.jpg", request);
		AdminBean ab = new AdminBean();
		Forword.redirectError(vs.flag, request, response, "ccalacl", ab,
				firstName, middelName, lastName, email, password, dateOfBirth,
				gender, country, state, city, mobile, address, exp,
				is_Available);
		Forword.showList(new AdminLoginDAO().insertAdmin(vs.flag, ab), request,
				response, "ccalal");

	}
}