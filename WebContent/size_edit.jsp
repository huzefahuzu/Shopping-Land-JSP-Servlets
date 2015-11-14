
<!DOCTYPE html>
<%@page import="java.util.*"%>
<%@page import="com.bean.CategoryBean"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html class="no-js">
<head>

<meta charset="utf-8">
<title>Customer Master</title>
<meta name="description" content="">
<meta name="author" content="pixelcave">
<meta name="robots" content="noindex, nofollow">
<meta name="viewport" content="width=device-width,initial-scale=1">
<link rel="shortcut icon" href="img/favicon.ico">
<link rel="apple-touch-icon" href="img/apple-touch-icon.png">
<link rel="apple-touch-icon" sizes="57x57"
	href="img/apple-touch-icon-57x57-precomposed.png">
<link rel="apple-touch-icon" sizes="72x72"
	href="img/apple-touch-icon-72x72-precomposed.png">
<link rel="apple-touch-icon" sizes="114x114"
	href="img/apple-touch-icon-114x114-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="img/apple-touch-icon-precomposed.png">
<link rel="stylesheet"
	href="http://fonts.googleapis.com/css?family=Roboto:400,400italic,700,700italic">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/plugins.css">
<link rel="stylesheet" href="css/main.css">
<link rel="stylesheet" href="css/themes.css">
<script src="js/vendor/modernizr-2.6.2-respond-1.1.0.min.js"></script>
</head>
<body>
	<div id="page-container">

		<!------------------------------------------------------ Header Start ----------------------------------------------------------->
		<%@ include file="header.jsp"%>
		<!------------------------------------------------------- Header End ------------------------------------------------------------->

		<!------------------------------------------------------ Menu Start ----------------------------------------------------------->

		<jsp:include page="menu.jsp"></jsp:include>

		<!------------------------------------------------------ Menu End --------------------------------------------------------------->


		<!------------------------------------------------------ Main Divison ------------------------------------------------------------>

		<div id="page-content">

			<p align="left">
				<a href="SizeList"><button type="button" class="btn btn-primary">Back</button></a>
			</p>

			<form id="form-validation" action="ccaisic" method="get"
				class="form-horizontal form-box remove-margin">

				<h4 class="form-box-header">Edit Size</h4>

				<div class="form-box-content">


					<div class="control-group">
						<label class="control-label" for="val_comp">Category Name
							*</label>
						<div class="controls">
							<div class="input-prepend">
								<span class="add-on"><i class="icon-user"></i></span> <select
									name="category">
									<option>----SELECT CATEGORY----</option>

									<c:forEach var="categoryList" items="${categoryList}">
										<option value="${categoryList.category_id}">${categoryList.category_name}</option>
									</c:forEach>


								</select>
							</div>
						</div>
					</div>

					<div class="control-group">
						<label class="control-label" for="val_comp">Size *</label>
						<div class="controls">
							<div class="input-prepend">
								<span class="add-on"><i class="icon-user"></i></span> <input
									type="text" id="val_comp" name="sizeMatch" tabindex="1"
									value="">
							</div>${sizeMatch}
						</div>
					</div>

				</div>







				<div class="form-actions">
					<button type="reset" class="btn btn-danger"
						onClick="window.location.href='customer_show.html'" tabindex="9">
						<i class="icon-repeat"></i> Reset
					</button>
					<input type="submit" name="submit" value="Update"
						class="btn btn-success" tabindex="8">
				</div>
		</div>
		</form>
	</div>
	<!------------------------------------------------- End  Main Divison ------------------------------------------------------------>

	<!-------------------------------------------------- Footer Start ---------------------------------------------------------------->

	<footer>


		<%@ include file="footer.html"%>

	</footer>

	<!-------------------------------------------------- Footer End ------------------------------------------------------------------>

	<!--[if lte IE 8]><script src="js/helpers/excanvas.min.js"></script><![endif]-->
	<script src="js/jquery-1.9.1.min.js"></script>
	<script>
		!window.jQuery
				&& document
						.write(unescape('%3Cscript src="js/vendor/jquery-1.9.1.min.js"%3E%3C/script%3E'));
	</script>
	<script src="js/vendor/bootstrap.min.js"></script>
	<script src="js/plugins.js"></script>
	<script src="js/main.js"></script>
	<script>
		$(function() {
			$("#form-validation")
					.validate(
							{
								errorClass : "help-block text-error",
								errorElement : "span",
								errorPlacement : function(t, e) {
									e.parents(".controls").append(t)
								},
								highlight : function(t) {
									$(t).closest(".control-group").removeClass(
											"success error").addClass("error")
								},
								success : function(t) {
									t.addClass("valid").closest(
											".control-group").removeClass(
											"success error")
											.addClass("success"), t.closest(
											".help-inline").remove(), t
											.closest(".help-block").remove()
								},
								rules : {
									val_username : {
										required : !0
									},
									val_comp : {
										required : !0,
										minlength : 2
									},
									val_add : {
										required : !0
									},
									val_city : {
										required : !0
									},
									val_email : {
										required : !0,
										email : !0
									},
									val_website : {
										required : !0,
										url : !0
									},
									val_date : {
										required : !0,
										date : !0
									},
									val_range : {
										required : !0,
										range : [ 1, 100 ]
									},
									val_number : {
										required : !0,
										number : !0
									},
									val_digits : {
										required : !0,
										digits : !0
									},
									val_state : {
										required : !0
									},
									val_credit_card : {
										required : !0,
										creditcard : !0
									},
									val_terms : {
										required : !0
									}
								},
								messages : {
									val_username : {
										required : "Please enter a username",
										minlength : "Your username must consist of at least 2 characters"
									},
									val_add : "Please Enter Address!",
									val_city : "Please Enter city!",
									val_email : "Please enter a valid email address",
									val_website : "Please enter your website!",
									val_date : "Please select a date!",
									val_range : "Please enter a number between 1 and 100!",
									val_number : "Please enter a number!",
									val_digits : "Please enter digits!",
									val_credit_card : "Please enter a valid credit card!",
									val_state : "Please select a skill!",
									val_terms : "You must agree to the terms!"
								}
							})
		});
	</script>
	<script type="text/javascript">
		var _gaq = _gaq || [];
		_gaq.push([ '_setAccount', 'UA-16158021-6' ]);
		_gaq.push([ '_setDomainName', 'pixelcave.com' ]);
		_gaq.push([ '_trackPageview' ]);

		(function() {
			var ga = document.createElement('script');
			ga.type = 'text/javascript';
			ga.async = true;
			ga.src = ('https:' == document.location.protocol ? 'https://ssl'
					: 'http://www')
					+ '.google-analytics.com/ga.js';
			var s = document.getElementsByTagName('script')[0];
			s.parentNode.insertBefore(ga, s);
		})();
	</script>
	<script type="text/javascript">
		setTimeout(function() {
			$('#hid').fadeOut('fast');
		}, 3000);
	</script>
</body>
</html>
