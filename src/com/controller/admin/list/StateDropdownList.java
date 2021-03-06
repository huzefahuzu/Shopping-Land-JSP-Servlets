package com.controller.admin.list;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.CountryBean;
import com.dao.CountryAddDao;
import com.util.listutil.SendListToView;

/**
 * Servlet implementation class CountryDropdownList
 */
public class StateDropdownList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		List<CountryBean> countryDropdownList = new CountryAddDao()
				.contryList();
		SendListToView slv = new SendListToView();
		slv.sendList(countryDropdownList, "countryDropdownList",
				countryDropdownList, request);
		slv.forwardList(request, response, "state_add.jsp");
	}

}
