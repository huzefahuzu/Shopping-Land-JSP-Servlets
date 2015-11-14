package com.util.controllerutil;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

public class Validation_SetAttribute {
	public boolean flag;

	public void pageRedirect(boolean parameterErrorFree, String errorParameter,
			String validationErrorImage, HttpServletRequest req,
			String... validParameterVal) {
		if (parameterErrorFree) {
			flag = true;
			System.out.println(flag);
			req.setAttribute(errorParameter, "<img src=images/"+validationErrorImage+" style='width : 18px; height : 18px; margin-left: 10px;'>");
		} else {
			req.setAttribute(errorParameter, "<img src=images/sucess4.jpg style='width : 20px; height : 20px;  margin-left: 11px;'>");
			req.setAttribute(validParameterVal[0], validParameterVal[1]);
		}
	}
	
	public void pageRedirect(boolean parameterErrorFree, String errorParameter,
			String validationErrorImage, HttpServletRequest req) {
		if (parameterErrorFree) {
			flag = true;
			System.out.println(flag);
			req.setAttribute(errorParameter,"<img src=images/"+validationErrorImage+" style='width : 18px; height : 18px; margin-left: 10px;'>");
		} else{
			req.setAttribute(errorParameter, "<img src=images/sucess4.jpg style='width : 20px; height : 20px;  margin-left: 11px;'>");
		}
	}

	public void pageRedirectMultiple(String s[], HttpServletRequest req,
			String... attribute) {

		if (s != null) {
			List<String> l = new ArrayList<String>();
			for (int i = 0; i < s.length; i++) {
				l.add(s[i]);
			}
			req.setAttribute("fileList", l);
		} else {
			req.setAttribute(attribute[0], "<font color=red>*" + attribute[1]
					+ "</font>");
		}
	}
}