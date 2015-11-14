
<!DOCTYPE html>
<%@ page import="com.bean.*"%>
<%@ page import="java.util.*"%>
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
<script type='text/javascript'
	src='/Shoppioing__Expo/dwr/interface/StateDao.js'></script>
<script type='text/javascript'
	src='/Shoppioing__Expo/dwr/interface/CityDao.js'></script>
<script type='text/javascript' src='/Shoppioing__Expo/dwr/engine.js'></script>
<script type='text/javascript' src='/Shoppioing__Expo/dwr/util.js'></script>

<script type="text/javascript">
	function getState(countryId) {

		dwr.util.removeAllOptions("state");

		//document.getElementById('cityLoader').style.visibility = 'visible';

		if (countryId == '') {
			var data = [ {
				stateName : '-- Select --',
				stateId : ''
			} ];
			dwr.util.addOptions("state", data, "stateId", "stateName");
		} else {
			//alert(stateId);
			///  document.getElementById('cityLoader').style.visibility = 'visible';
			StateDao.getAllStates(countryId, function(data) {
				dwr.util.addOptions("state", data, "stateId", "stateName");
				//document.getElementById('cityLoader').style.visibility = 'hidden';
			});
		}
	}
	function getCity(state) {

		dwr.util.removeAllOptions("city");

		//document.getElementById('cityLoader').style.visibility = 'visible';

		if (state == '') {
			var data = [ {
				cityName : '-- Select --',
				cityId : ''
			} ];
			dwr.util.addOptions("city", data, "cityId", "cityName");
		} else {
			//alert(stateId);
			///  document.getElementById('cityLoader').style.visibility = 'visible';
			CityDao.getAllCities(state, function(data) {
				dwr.util.addOptions("city", data, "cityId", "cityName");
				//document.getElementById('cityLoader').style.visibility = 'hidden';
			});
		}
	}
</script>
</head>
<body>
	<div id="page-container">

		<!------------------------------------------------------ Header Start ----------------------------------------------------------->
		<%@ include file="header.jsp"%>
		<!------------------------------------------------------- Header End ------------------------------------------------------------->

		<div id="inner-container">
			<!------------------------------------------------------ Menu Start ----------------------------------------------------------->


			<jsp:include page="menu.jsp"></jsp:include>
			<!------------------------------------------------------ Menu End --------------------------------------------------------------->

			<!------------------------------------------------------ Main Divison ------------------------------------------------------------>

			<div id="page-content">

				<p align="left">
					<a href="ccalal"><button type="button" class="btn btn-primary">Back</button></a>
				</p>

				<form id="form-validation" action="AdminController" method="get"
					class="form-horizontal form-box remove-margin">

					<h4 class="form-box-header">Add New Admin</h4>

					<div class="form-box-content">

						<div class="control-group">
							<label class="control-label" for="val_comp">First Name *</label>
							<div class="controls">
								<div class="input-prepend">
									<span class="add-on"><i class="icon-user"></i></span> <input
										type="text" id="val_comp" name="firstName" tabindex="1"
										value="${ firstNameVal}">
								</div>${firstName}
							</div>
						</div>

						<div class="control-group">
							<label class="control-label" for="val_comp">Middel Name *</label>
							<div class="controls">
								<div class="input-prepend">
									<span class="add-on"><i class="icon-user"></i></span> <input
										type="text" id="val_comp" name="middelName" tabindex="1"
										value="${middelNameVal}">
								</div>${middelName}
							</div>
						</div>

						<div class="control-group">
							<label class="control-label" for="val_comp">Last Name *</label>
							<div class="controls">
								<div class="input-prepend">
									<span class="add-on"><i class="icon-user"></i></span> <input
										type="text" id="val_comp" name="lastName" tabindex="1"
										value="${lastNameVal}">
								</div>${lastName}
							</div>
						</div>
						<div class="control-group">
							<label class="control-label" for="val_comp">Email *</label>
							<div class="controls">
								<div class="input-prepend">
									<span class="add-on"><i class="icon-user"></i></span> <input
										type="text" id="val_comp" name="email" tabindex="1"
										value="${emailVal}">
								</div>${email}
							</div>
						</div>

						<div class="control-group">
							<label class="control-label" for="val_comp">Password *</label>
							<div class="controls">
								<div class="input-prepend">
									<span class="add-on"><i class="icon-user"></i></span> <input
										type="password" id="val_comp" name="password" tabindex="1"
										value="${passVal}">
								</div>${password}
							</div>
						</div>

						<div class="control-group">
							<label class="control-label" for="val_comp">Birth Date *</label>
							<div class="controls">
								<div class="input-prepend">
									<span class="add-on"><i class="icon-user"></i></span> <input
										type="date" id="val_comp" name="dob" tabindex="1">
								</div>${dob}
							</div>
						</div>

						<div class="control-group">

							<label class="control-label" for="val_comp">Gender *</label>
							<div class="controls">
								<div class="radio inline">
									<input type="radio" id="val_comp" name="gender" tabindex="1"
										value="Male">Male

								</div>
								<div class="radio inline">
									<input type="radio" id="val_comp" name="gender" tabindex="1"
										value="Female">FeMale

								</div>${gender}
							</div>
						</div>

						<div class="control-group">
							<label class="control-label" for="val_comp">Country*</label>
							<div class="controls">
								<div class="input-prepend">

									<span class="add-on"><i class="icon-user"></i></span> <select
										name="country" id="countryId" onchange="getState(this.value);">
										<option value=" ">-----SELECT COUNTRY-----</option>

										<c:forEach var="countryDropDown" items="${ countryList}">
											<option value="${countryDropDown.country_id}">${countryDropDown.country_name}</option>

										</c:forEach>
									</select>
								</div>${country}
							</div>
						</div>


						<div class="control-group">
							<label class="control-label" for="val_comp">State*</label>
							<div class="controls">
								<div class="input-prepend">

									<span class="add-on"><i class="icon-user"></i></span> <select
										name="state" id="state" onchange="getCity(this.value);">
										<option value=" ">-----SELECT STATE-----</option>
									</select>
								</div>${state}
							</div>
						</div>


						<div class="control-group">
							<label class="control-label" for="val_comp">City*</label>
							<div class="controls">
								<div class="input-prepend">

									<span class="add-on"><i class="icon-user"></i></span> <select
										name="city" id="city">
										<option value=" ">-----SELECT CITY-----</option>
									</select>
								</div>${city}
							</div>
						</div>

						<div class="control-group">
							<label class="control-label" for="val_comp">Mobile *</label>
							<div class="controls">
								<div class="input-prepend">
									<span class="add-on"><i class="icon-user"></i></span> <input
										type="text" id="val_comp" name="mobile" tabindex="1"
										value="${mobileVal}">
								</div>${mobile}
							</div>
						</div>
						<div class="control-group">
							<label class="control-label" for="val_comp">Address *</label>
							<div class="controls">
								<div class="textarea-large">

									<textarea name="address" value="${addressVal}"></textarea>${address}


								</div>
							</div>
						</div>

						<div class="control-group">
							<label class="control-label" for="val_comp">Work
								Experiance </label>

							<div class="input-prepend" style="margin-left: 20px;">

								<span class="add-on"><i class="icon-user"></i></span> <select
									name="year" id="state" style="width: 80px;">
									<option value="0">Year</option>
									<option value="1">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
									<option value="4">4</option>
									<option value="5">5</option>
									<option value="6">6</option>
									<option value="7">7</option>
									<option value="8">8</option>
									<option value="9">9</option>
									<option value="10">10</option>
									<option value=">10">>10</option>
								</select>
							</div>


							<div class="input-prepend">

								<span class="add-on"><i class="icon-user"></i></span> <select
									name="month" id="state" style="width: 80px;">
									<option value="0">Month</option>
									<option value="1">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
									<option value="4">4</option>
									<option value="5">5</option>
									<option value="6">6</option>
									<option value="7">7</option>
									<option value="8">8</option>
									<option value="9">9</option>
									<option value="10">10</option>
									<option value="11">11</option>
									<option value="12">12</option>
								</select>
							</div>

							<div class="input-prepend">

								<span class="add-on"><i class="icon-user"></i></span> <select
									name="day" id="state" style="width: 80px">
									<option value="0">Day</option>
									<option value="1">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
									<option value="4">4</option>
									<option value="5">5</option>
									<option value="6">6</option>
									<option value="7">7</option>
									<option value="8">8</option>
									<option value="9">9</option>
									<option value="10">10</option>
									<option value="11">11</option>
									<option value="12">12</option>
									<option value="13">13</option>
									<option value="14">14</option>
									<option value="15">15</option>
									<option value="16">16</option>
									<option value="17">17</option>
									<option value="18">18</option>
									<option value="19">19</option>
									<option value="20">20</option>
									<option value="21">21</option>
									<option value="22">22</option>
									<option value="23">23</option>
									<option value="24">24</option>
									<option value="25">25</option>
									<option value="26">26</option>
									<option value="27">27</option>
									<option value="28">28</option>
									<option value="29">29</option>
									<option value="30">30</option>
								</select>

							</div>
						</div>

						<div class="control-group">

							<label class="control-label" for="val_comp">Is Available
								* </label>
							<div class="controls">
								<div class="radio inline">
									Yes:<input type="radio" id="val_comp" name="is_Available"
										tabindex="1" value="1">


								</div>

								<div class="radio inline">
									No:<input type="radio" id="val_comp" name="is_Available"
										tabindex="1" value="0">


								</div>
								${isAvailable}

							</div>
						</div>





						<div class="form-actions">
							<button type="reset" class="btn btn-danger"
								onClick="window.location.href='customer_show.html'" tabindex="9">
								<i class="icon-repeat"></i> Reset
							</button>
							<input type="submit" name="submit" value="Submit"
								class="btn btn-success" tabindex="8">
						</div>
					</div>
				</form>
			</div>
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
										$(t).closest(".control-group")
												.removeClass("success error")
												.addClass("error")
									},
									success : function(t) {
										t.addClass("valid").closest(
												".control-group").removeClass(
												"success error").addClass(
												"success"), t.closest(
												".help-inline").remove(), t
												.closest(".help-block")
												.remove()
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
