package com.controller.admin.delete;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MasterDelete;

/**
 * Servlet implementation class DeleteCountry
 */
public class DeleteCountry extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (new MasterDelete().deleteCheckedItem("country", "country_id",
				request.getParameterValues("chkDeleteCountry"))) {
			request.getRequestDispatcher("CountryList").forward(request,
					response);

		} else {

			request.setAttribute("countryForgainKey", true);
			request.getRequestDispatcher("CountryList").forward(request,
					response);
		}
	}

}
