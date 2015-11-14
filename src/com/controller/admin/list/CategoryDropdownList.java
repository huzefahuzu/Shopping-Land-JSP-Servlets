package com.controller.admin.list;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.TypeBean;
import com.dao.CategoryDao;
import com.dao.TypeDao;
import com.util.listutil.SendListToView;

/**
 * Servlet implementation class GategoryDropdownList
 */
public class CategoryDropdownList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<TypeBean> list = new TypeDao().TypeList();

		// if (list != null) {
		// request.setAttribute("typeDropdownList", list);
		// request.getRequestDispatcher("category_add.jsp").forward(request,
		// response);
		// } else {
		// System.out.println("list is null");
		// }
		SendListToView slv=new SendListToView();
		slv.sendList(list, "typeDropdownList", list, request);
		slv.forwardList(request, response, "category_add.jsp");
	}

}
