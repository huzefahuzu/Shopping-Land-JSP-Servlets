package com.controller.admin.list;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.CategoryBean;
import com.dao.CategoryDao;
import com.util.listutil.SendListToView;

/**
 * Servlet implementation class SizeList
 */
public class SizeDropdownList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<CategoryBean> list = new CategoryDao().Product_CategoryList();

		SendListToView slv = new SendListToView();
		slv.sendList(list, "categoryList", list, request);
		slv.forwardList(request, response, "size_add.jsp");
	}

}
