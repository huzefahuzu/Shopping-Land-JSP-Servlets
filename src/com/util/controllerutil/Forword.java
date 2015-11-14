package com.util.controllerutil;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.SuperBean;
import com.dao.TypeDao;

public class Forword {

	public static void showList(boolean insertDaocall, HttpServletRequest req,
			HttpServletResponse resp, String URL_ShowListName)
			throws ServletException, IOException {
		if (insertDaocall) {

			System.out.println("Success....");
			resp.sendRedirect(URL_ShowListName);
			// req.getRequestDispatcher(listUrl).forward(req, resp);
		} else {

			System.out.println("Failure....");
		}
	}

	public static void redirectError(boolean vsErrorFlag,
			HttpServletRequest req, HttpServletResponse resp,
			String errorPageUrl, SuperBean beanObject,
			String... setBeanValueParameter) throws IOException,
			ServletException {
		if (vsErrorFlag) {
			System.out.println("bean is not set");
			req.getRequestDispatcher(errorPageUrl).forward(req, resp);
		} else {
			System.out.println("bean is set");
			beanObject.getBean(beanObject, setBeanValueParameter);
		}
	}
}
