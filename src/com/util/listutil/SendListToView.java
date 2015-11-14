package com.util.listutil;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SendListToView {

	public void sendList(List datalist, String setListAttributeAsString,
			Object setListAttributeValue, HttpServletRequest req)
			throws ServletException, IOException {

		if (datalist != null) {
			req.setAttribute(setListAttributeAsString, setListAttributeValue);
		} else {
			System.out.println("List is null");
		}
	}

	public void setForgainKey(String forgainkeyAttribute,
			Object object_of_requestgetAttribute, HttpServletRequest req) {
		req.setAttribute(forgainkeyAttribute, object_of_requestgetAttribute);
	}

	public void forwardList(HttpServletRequest req, HttpServletResponse resp,
			String jspForwardPageName) throws ServletException, IOException {
		req.getRequestDispatcher(jspForwardPageName).forward(req, resp);
	}
}
