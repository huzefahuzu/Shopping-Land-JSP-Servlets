package com.controller.admin.list;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.CityBean;
import com.dao.CityDao;
import com.util.listutil.SendListToView;

/**
 * Servlet implementation class CityList
 */
public class CityList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<CityBean> cityList = new CityDao().cityList();
		SendListToView slv = new SendListToView();
		slv.sendList(cityList, "cityList", cityList, request);
		slv.forwardList(request, response, "city.jsp");
	}

}
