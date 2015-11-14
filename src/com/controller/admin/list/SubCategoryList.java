package com.controller.admin.list;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.SubcategoryBean;
import com.dao.SubCategoryDao;
import com.util.listutil.SendListToView;

/**
 * Servlet implementation class SubCategoryList
 */
public class SubCategoryList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<SubcategoryBean> subcategoryList = new SubCategoryDao()
				.showSubCategoryDataList();

		SendListToView slv = new SendListToView();
		slv.sendList(subcategoryList, "subCategoryList", subcategoryList,
				request);
		slv.forwardList(request, response, "subcategory.jsp");

	}

}
