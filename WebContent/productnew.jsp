<!DOCTYPE html>

<html class="no-js">
<head>
<meta charset="utf-8">
<title>Customer Master</title>
<meta name="description" content="">
<meta name="author" content="pixelcave">
<meta name="robots" content="noindex, nofollow">
<meta name="viewport" content="width=device-width,initial-scale=1">
<link rel="shortcut icon" href="img/favicon.ico">
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
<link href="bootstrap-editable/css/bootstrap-editable.css"
	rel="stylesheet">
<script src="js/vendor/modernizr-2.6.2-respond-1.1.0.min.js"></script>



<style>
#element_to_pop_up {
	background-color: #666;
	border-radius: 15px;
	color: #000;
	display: none;
	padding: 20px;
	min-width: 400px;
	min-height: 180px;
}

#element_to_pop_up2 {
	background-color: #666;
	border-radius: 15px;
	color: #000;
	display: none;
	padding: 20px;
	min-width: 400px;
	min-height: 180px;
}

.b-close {
	cursor: pointer;
	position: absolute;
	right: 10px;
	top: 5px;
}
</style>

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

		<form>
			<div id="page-content">

				<h3 class="page-header page-header-top">
					Product <small> Master</small>
				</h3>

				<p align="right">
					<a href="product_first_add.jsp"><button type="button"
							class="btn btn-primary">Add Product</button></a>
				</p>

				<table id="example-datatables"
					class="table table-striped table-bordered table-hover">
					<thead>
						<tr>
							<th class="span1 hidden-phone"><input type="checkbox"
								id="ckbCheckAll" style="margin-left: 15px; margin-bottom: 5px;" /></th>
							<th><i class="icon-user"></i> Product Name</th>
							<th class="hidden-phone hidden-tablet" style="text-align: center;"><i
								class="icon-envelope-alt"></i> Add Product Details</th>
							<th class="span1">Actions</th>

						</tr>
					</thead>
					<tbody>

						<tr>

							<script>
								$(document)
										.ready(
												function() {
													$("#ckbCheckAll")
															.click(
																	function() {
																		$(
																				".checkBoxClass")
																				.prop(
																						'checked',
																						$(
																								this)
																								.prop(
																										'checked'));
																	});
												});
							</script>

							<td class="span1 hidden-phone"><input type="checkbox"
								class="checkBoxClass" id="Checkbox1" style="margin-left: 15px;" /></td>
							<td><a href="javascript:void(0)">Shoes</a></td>
							<td style="width: 380px;"><a href="product_add_withcs.jsp"><button type="button" class="btn btn-success" style="width:150px;margin-left: 20px;">With Color and Size</button></a>
							
							<a href="product_add_withoutcs.jsp"><button type="button" class="btn btn-success" style="width:170px;margin-left: 20px;">Without Color and Size</button></a>
							
							
							
							</td>
							<td class="span1">
								<div class="btn-group">
									<a data-toggle="tooltip" title="Edit" id="my-button2"
										class="btn btn-success" data-reveal-id="myDtModal"><i
										class="icon-pencil"></i> </a>
									<div id="element_to_pop_up2">

										<a class="b-close">x</a> <span>Product Type :</span> <a
											href="#" id="status" data-type="select"
											data-title="Select status"></a> <br />
										<hr />
										<span>Product Category :</span> <a href="#" id="status1"
											data-type="select" data-title="Select status"></a> <br />
										<hr />
										<span>Product Sub-Category :</span> <a href="#" id="status2"
											data-type="select" data-title="Select status"></a> <br />
										<hr />
										<span>Product Brand :</span> <a href="#" id="status3"
											data-type="select" data-title="Select status"></a> <br />
										<hr />
										<span>Product Name :</span> <a href="#" id="pn"
											data-type="text" data-title="Enter username">Product name</a><br />
										<hr />
										<span>Color :</span> <a href="#" id="status4"
											data-type="select" data-title="Select status"></a> <br />
										<hr />

										<span>Size :</span> <a href="#" id="status5"
											data-type="select" data-title="Select status"></a> <br />
										<hr />

										<span>Product MRP :</span> <a href="#" id="pmrp"
											data-type="text" data-title="Enter username">Product name</a><br />
										<hr />

										<span>Product Discount :</span> <a href="#" id="pd"
											data-type="text" data-title="Enter username">Product name</a><br />
										<hr />

										<span>Product Quantity :</span> <a href="#" id="pq"
											data-type="text" data-title="Enter username">Product name</a><br />
										<hr />

									</div>






									<a href="#" data-toggle="tooltip" id="my-button" title="View"
										class="btn btn-warning" style="margin-left: 10px;"><i
										class="icon-list-ul"></i>

										<div id="element_to_pop_up">

											<a class="b-close">x</a> Content of popup
										</div> </a> <a href="#" data-toggle="tooltip" title="Delete"
										class="btn btn-danger"
										onClick="return confirm('Are You Sure You Want To Delete?');"
										style="margin-left: 10px;"><i class="icon-remove"></i></a>


								</div>
							</td>
						</tr>


						<tr>

							<td class="span1 hidden-phone"><input type="checkbox"
								class="checkBoxClass" id="Checkbox1" style="margin-left: 15px;" /></td>
							<td><a href="javascript:void(0)">Shopping Expo</a></td>
							<td class="hidden-phone hidden-tablet">9033891186</td>
							<td class="span1">
								<div class="btn-group">
									<a data-toggle="tooltip" title="View" class="btn btn-warning"
										data-reveal-id="myDtModal"><i class="icon-list-ul"></i></a> <a
										href="customer_add.html" data-toggle="tooltip" title="Edit"
										class="btn btn-success" style="margin-left: 10px;"><i
										class="icon-pencil"></i></a> <a href="#" data-toggle="tooltip"
										title="Delete" class="btn btn-danger"
										onClick="return confirm('Are You Sure You Want To Delete?');"
										style="margin-left: 10px;"><i class="icon-remove"></i></a>


								</div>
							</td>
						</tr>

						<tr>

							<td class="span1 hidden-phone"><input type="checkbox"
								class="checkBoxClass" id="Checkbox1" style="margin-left: 15px;" /></td>
							<td><a href="javascript:void(0)">Shopping Expo</a></td>
							<td class="hidden-phone hidden-tablet">9033891186</td>
							<td class="span1">
								<div class="btn-group">
									<a data-toggle="tooltip" title="View" class="btn btn-warning"
										data-reveal-id="myDtModal"><i class="icon-list-ul"></i></a> <a
										href="customer_add.html" data-toggle="tooltip" title="Edit"
										class="btn btn-success" style="margin-left: 10px;"><i
										class="icon-pencil"></i></a> <a href="#" data-toggle="tooltip"
										title="Delete" class="btn btn-danger"
										onClick="return confirm('Are You Sure You Want To Delete?');"
										style="margin-left: 10px;"><i class="icon-remove"></i></a>


								</div>
							</td>
						</tr>
					</tbody>
				</table>
			</div>

		</form>
		<!-------------------------------------------------- End main Divison ------------------------------------------------------------>

	</div>

	</div>


	<!-------------------------------------------------- Footer Start ------------------------------------------------------------>

	<footer>



		<%@ include file="footer.html"%>

	</footer>

	<!-------------------------------------------------- Footer End ------------------------------------------------------------------>



	<!--[if lte IE 8]><script src="js/helpers/excanvas.min.js"></script><![endif]-->
	<script type="text/javascript" src="js/jquery-1.6.4.min.js"></script>

	<script src="js2/bpopup.js"></script>
	<script src="js2/easing.js"></script>


	<script type="text/javascript">
		function getData(id) {
			$
					.ajax({
						cache : false,
						type : "get",
						url : "Controller/service.php?button1=AjaxgetCustomer&id="
								+ id,

						success : function(data) {
							$("#loadInvDetails").html(data);
						}
					});
		}
	</script>
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
			$("#example-datatables").dataTable({
				aoColumnDefs : [ {
					bSortable : !1,
					aTargets : [ 0 ]
				} ]
			}), $("#example-datatables2").dataTable(),
					$("#example-datatables3").dataTable()
		});
	</script>

	<script type="text/javascript"
		src="bootstrap-editable/js/bootstrap-editable.js"></script>

	<script>
		$.fn.editable.defaults.mode = 'inline';
		$.fn.editable.defaults.ajaxOptions = {
			type : "PUT"
		};

		$(function() {
			$('#status').editable({
				value : 2,
				source : [ {
					value : 1,
					text : 'Active'
				}, {
					value : 2,
					text : 'Blocked'
				}, {
					value : 3,
					text : 'Deleted'
				} ]
			});
		});

		$(function() {
			$('#status1').editable({
				value : 2,
				source : [ {
					value : 1,
					text : 'Active'
				}, {
					value : 2,
					text : 'Blocked'
				}, {
					value : 3,
					text : 'Deleted'
				} ]
			});
		});

		$(function() {
			$('#status2').editable({
				value : 2,
				source : [ {
					value : 1,
					text : 'Active'
				}, {
					value : 2,
					text : 'Blocked'
				}, {
					value : 3,
					text : 'Deleted'
				} ]
			});
		});

		$(function() {
			$('#status3').editable({
				value : 2,
				source : [ {
					value : 1,
					text : 'Active'
				}, {
					value : 2,
					text : 'Blocked'
				}, {
					value : 3,
					text : 'Deleted'
				} ]
			});
		});

		$(document).ready(function() {
			$('#pn').editable();
		});

		$(function() {
			$('#status4').editable({
				value : 2,
				source : [ {
					value : 1,
					text : 'Active'
				}, {
					value : 2,
					text : 'Blocked'
				}, {
					value : 3,
					text : 'Deleted'
				} ]
			});
		});

		$(function() {
			$('#status5').editable({
				value : 2,
				source : [ {
					value : 1,
					text : 'Active'
				}, {
					value : 2,
					text : 'Blocked'
				}, {
					value : 3,
					text : 'Deleted'
				} ]
			});
		});

		$(document).ready(function() {
			$('#pmrp').editable();
		});

		$(document).ready(function() {
			$('#pd').editable();
		});
		$(document).ready(function() {
			$('#pq').editable();
		});
	</script>
	<script src="js/bpopup.js"></script>
	<script src="js/easing.js"></script>
	<script>
		;
		(function($) {
			$(function() {
				$('#my-button').on('click', function(e) {
					e.preventDefault();
					$('#element_to_pop_up').bPopup({
						appendTo : 'form',
						zIndex : 8,
						easing : 'easeOutBack',
						speed : 450,
						transition : 'slideDown'

					});
				});
			});
		})(jQuery);

		;
		(function($) {
			$(function() {
				$('#my-button2').on('click', function(e) {
					e.preventDefault();
					$('#element_to_pop_up2').bPopup({
						appendTo : 'form',
						zIndex : 8,
						easing : 'easeOutBack',
						speed : 450,
						transition : 'slideDown'

					});
				});
			});
		})(jQuery);
	</script>

</body>
</html>
