<!DOCTYPE html>
<%@page import="java.util.*"%>
<html class="no-js">
<head>

<meta charset="utf-8">

<title>Dashboard</title>
<meta name="description"
	content="uAdmin is a Professional, Responsive and Flat Admin Template created by pixelcave and published on Themeforest. This is the demo of uAdmin! You need to purchase a license for legal use!">
<meta name="author" content="pixelcave">
<meta name="robots" content="noindex, nofollow">
<meta name="viewport" content="width=device-width,initial-scale=1">
<link rel="shortcut icon" href="#">
<link rel="apple-touch-icon" href="#">
<link rel="apple-touch-icon" sizes="57x57" href="#">
<link rel="apple-touch-icon" sizes="72x72" href="#">
<link rel="apple-touch-icon" sizes="114x114" href="#">
<link rel="apple-touch-icon-precomposed" href="#">
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


		<div id="page-content" style="overflow: scroll">

			<h3 class="page-header page-header-top">
				</i> Dashboard
			</h3>

			<p>
			<div class="span3">
				<a href="CategoryList">
					<div class="dash-tile dash-tile-leaf ">
						<div class="dash-tile-header">
							<div class="dash-tile-options">
								<div class="btn-group"></div>
							</div>
							Categories
						</div>
						<div class="dash-tile-icon">
							<i class="icon-bitbucket"></i>
						</div>
						<div class="dash-tile-text">${categoryDashBoardList}</div>
					</div>
				</a>
			</div>

			<div class="span3">
				<a href="ccptl">
					<div class="dash-tile dash-tile-doll ">
						<div class="dash-tile-header">
							<div class="dash-tile-options">
								<div class="btn-group"></div>
							</div>
							Product Type
						</div>
						<div class="dash-tile-icon">
							<i class="icon-beer"></i>
						</div>

						<div class="dash-tile-text">${typeDashBoardList}</div>
					</div>
				</a>
			</div>


			<div class="span3">
				<a href="ccalscl">
					<div class="dash-tile dash-tile-fruit clearfix">

						<div class="dash-tile-header">
							<div class="dash-tile-options">
								<div class="btn-group"></div>
							</div>
							Sub-Categories
						</div>
						<div class="dash-tile-icon">
							<i class="icon-briefcase"></i>
						</div>
						<div class="dash-tile-text">${subCategoryDashBoardList}</div>
					</div>
				</a>
			</div>


			<div class="span3">
				<a href="ccalbl">
					<div class="dash-tile dash-tile-fruit clearfix">

						<div class="dash-tile-header">
							<div class="dash-tile-options">
								<div class="btn-group"></div>
							</div>
							Brand
						</div>
						<div class="dash-tile-icon">
							<i class="icon-building"></i>
						</div>
						<div class="dash-tile-text">${brandList}</div>
					</div>
				</a>
			</div>

			<div class="span3">
				<a href="productnew.jsp">
					<div class="dash-tile dash-tile-oil clearfix">
						<div class="dash-tile-header">
							<div class="dash-tile-options"></div>
							New Product Master
						</div>
						<div class="dash-tile-icon">
							<i class="icon-shopping-cart"></i>
						</div>
						<div class="dash-tile-text">11</div>
					</div>
				</a>

			</div>

			<div class="span3">
				<a href="color.jsp">
					<div class="dash-tile dash-tile-ocean clearfix">
						<div class="dash-tile-header">
							<div class="dash-tile-options">
								<div class="btn-group"></div>
							</div>
							Color
						</div>
						<div class="dash-tile-icon">
							<i class="icon-magic"></i>
						</div>
						<div class="dash-tile-text">51</div>
					</div>
				</a>
			</div>

			<div class="span3">
				<a href="SizeList">
					<div class="dash-tile dash-tile-ocean clearfix">
						<div class="dash-tile-header">
							<div class="dash-tile-options"></div>
							Size
						</div>
						<div class="dash-tile-icon">
							<i class="icon-tasks"></i>
						</div>
						<div class="dash-tile-text">${sizeList}</div>
					</div>
				</a>

			</div>

			<div class="span3">
				<a href="CountryList">
					<div class="dash-tile dash-tile-doll clearfix">
						<div class="dash-tile-header">
							<div class="dash-tile-options">
								<div class="btn-group"></div>
							</div>
							Country
						</div>
						<div class="dash-tile-icon">
							<i class="icon-envelope"></i>
						</div>
						<div class="dash-tile-text">${countryDashBoardList}</div>

					</div>
				</a>
			</div>

			<div class="span3">
				<a href="ccalsl">
					<div class="dash-tile dash-tile-balloon clearfix">
						<div class="dash-tile-header">
							<div class="dash-tile-options">
								<div class="btn-group"></div>
							</div>
							State
						</div>
						<div class="dash-tile-icon">
							<i class="icon-tablet"></i>
						</div>
						<div class="dash-tile-text">${stateDashBoardList}</div>
					</div>
				</a>
			</div>

			<div class="span3">
				<a href="ccalc">
					<div class="dash-tile dash-tile-balloon clearfix">
						<div class="dash-tile-header">
							<div class="dash-tile-options">
								<div class="btn-group"></div>
							</div>
							City
						</div>
						<div class="dash-tile-icon">
							<i class="icon-star-half-empty"></i>
						</div>
						<div class="dash-tile-text">${cityList}</div>
					</div>
				</a>
			</div>

			<div class="span3">
				<a href="ccalal">
					<div class="dash-tile dash-tile-fruit clearfix">
						<div class="dash-tile-header">
							<div class="dash-tile-options"></div>
							Add Admin Details
						</div>
						<div class="dash-tile-icon">
							<i class="icon-stackexchange"></i>
						</div>
						<div class="dash-tile-text">${adminList}</div>
					</div>
				</a>

			</div>
		</div>



	</div>

	<!-------------------------------------------------- End main Divison ------------------------------------------------------------>


	<!-------------------------------------------------- Footer Start ------------------------------------------------------------>


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

</body>
</html>
