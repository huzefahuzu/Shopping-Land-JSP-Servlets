<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="UploadServlet" name="student" id="student" method="post"
		enctype="multipart/form-data">
		<table>
			<tr>
				<td>First Name: <input type="text" name="firstName"
					id="firstName">
				</td>
			</tr>
			<tr>
				<td>Last Name: <input type="text" name="lastName" id="lastName">
				</td>
			</tr>
			<tr>
				<td>Upload File:<input type="file" name="photo" id="photo">
					${photo}
				</td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" id="submit" value="ADD">
					<input type="reset" name="reset" id="reset" value="RESET"></td>

			</tr>
		</table>
	</form>

</body>
</html>