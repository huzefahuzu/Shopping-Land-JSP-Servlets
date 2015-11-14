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

public class CategoryList extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		List<CategoryBean> list = new CategoryDao().Product_CategoryList();

		SendListToView slv = new SendListToView();
		slv.sendList(list, "categorylist", list, request);
		slv.setForgainKey("forgainKey",
				request.getAttribute("categoryForgainKey"), request);
		slv.forwardList(request, response, "category.jsp");

	}

}
