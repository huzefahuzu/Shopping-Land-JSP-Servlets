package com.controller.admin.list;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.SizeBean;
import com.dao.SizeDao;
import com.util.listutil.SendListToView;

/**
 * Servlet implementation class SizeList
 */
public class SizeList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<SizeBean> sizeList = new SizeDao().showSizeList();

		SendListToView slv = new SendListToView();
		slv.sendList(sizeList, "sizeList", sizeList, request);
		slv.forwardList(request, response, "size.jsp");
	}

}
