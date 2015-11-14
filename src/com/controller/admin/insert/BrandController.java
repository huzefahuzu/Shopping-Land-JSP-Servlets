package com.controller.admin.insert;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.bean.BrandBean;
import com.dao.brandDao;
import com.util.controllerutil.Validation;

/**
 * Servlet implementation class BrandController
 */
public class BrandController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String filePath = getServletContext().getInitParameter("icon-upload");

		FileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);
		List<FileItem> items = null;
		String fieldName = null;
		String fieldValue = null;
		String fileName = null;
		File file = null;

		BrandBean brandBean = new BrandBean();

		try {
			items = upload.parseRequest(request);
			System.out.println("ieam is =" + items);
			for (int i = 0; i < items.size(); i++) {
				System.out.println("item==" + items.get(i));
				FileItem item = items.get(i);

				if (item.isFormField()) {
					fieldName = item.getFieldName();
					fieldValue = item.getString();

					if (fieldName.equalsIgnoreCase("pType")) {
						String value = fieldValue;

						System.out.println("pType: " + value);
						if (Validation.isEmpty(value)) {
							request.setAttribute("pType", "Select ProductType");
							request.getRequestDispatcher("brand_add.jsp")
									.forward(request, response);
						} else {
							brandBean.setTypeId(Integer.parseInt(value));
						}

					}

					if (fieldName.equalsIgnoreCase("pcategory")) {
						String value = fieldValue;
						brandBean.setCategoryId(Integer.parseInt(value));
						System.out.println("pCategory: " + value);
						if (value.isEmpty()) {
							request.setAttribute("pCategory", "Select Category");
							request.getRequestDispatcher("brand_add.jsp")
									.forward(request, response);
						}
					}

					if (fieldName.equalsIgnoreCase("pSubCategory")) {
						String value = fieldValue;
						brandBean.setSubCategoryId(Integer.parseInt(value));
						System.out.println("pSubCategory: " + value);
						if (value.isEmpty()) {
							request.setAttribute("pSubCategory",
									"Select Subcategory");
							request.getRequestDispatcher("brand_add.jsp")
									.forward(request, response);
						}
					}

					if (fieldName.equalsIgnoreCase("pBrand")) {
						String value = fieldValue;
						brandBean.setBrandName(value);
						System.out.println("pBrand: " + value);
						if (value.isEmpty()) {
							request.setAttribute("brandName",
									"Enter valid Brand");
							request.getRequestDispatcher("brand_add.jsp")
									.forward(request, response);
						}
					}
				}

				else {

					fieldName = item.getFieldName();
					System.out.println("FieldName:" + fieldName);
					fileName = item.getName();
					System.out.println("FileName: " + fileName);
					fileName = fileName.substring(
							fileName.lastIndexOf("\\") + 1, fileName.length());

					System.out.println("new file name: " + fileName);

					ServletContext context = getServletContext();
					// context.getRealPath("\\");

					file = new File(filePath + File.separator + fileName);
					try {

						if (fileName.isEmpty()) {
							request.setAttribute("file",
									"please select any file");
							request.getRequestDispatcher("brand_add.jsp")
									.forward(request, response);
							// Validations....
						} else {
							System.out.println("MIME : "
									+ context.getMimeType(fileName));
							if (context.getMimeType(fileName).equals(
									"image/gif")
									|| context.getMimeType(fileName).equals(
											"image/jpeg")
									|| context.getMimeType(fileName).equals(
											"image/png")) {
								System.out.println("file=" + file);
								item.write(file);
								brandBean.setBrandIcon(file.getName());
								System.out.println("photo name=="
										+ brandBean.getBrandIcon());

							} else {

								request.setAttribute(
										"icon",
										"<font color=red>*Please upload files that end in types .png,.jpeg, .pdf only....</font>");
								request.getRequestDispatcher("brand_add.jsp")
										.forward(request, response);
							}
						}
					} catch (Exception e) {
						e.printStackTrace();
					}

				}

			}

		} catch (FileUploadException e) {
			e.printStackTrace();
		}
		if (new brandDao().insertBrand(brandBean)) {
			System.out.println("insert success");
			response.sendRedirect("ccalbl");

		} else {
			System.out.println("fail");
			response.sendRedirect("ccalbdd");
		}

	}

}
