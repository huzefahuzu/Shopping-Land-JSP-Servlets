package com.controller.admin.list;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.StateBean;
import com.dao.StateDao;
import com.util.listutil.SendListToView;

/**
 * Servlet implementation class StateList
 */
public class StateList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		List<StateBean> stateList = new StateDao().showStateDataList();
		SendListToView slv = new SendListToView();
		slv.sendList(stateList, "stateList", stateList, request);
		slv.forwardList(request, response, "state.jsp");
	}

}
