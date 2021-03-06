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
<link rel="apple-touch-icon" sizes="57x57" href="img/apple-touch-icon-57x57-precomposed.png">
<link rel="apple-touch-icon" sizes="72x72" href="img/apple-touch-icon-72x72-precomposed.png">
<link rel="apple-touch-icon" sizes="114x114" href="img/apple-touch-icon-114x114-precomposed.png">
<link rel="apple-touch-icon-precomposed" href="img/apple-touch-icon-precomposed.png">
<link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,400italic,700,700italic">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/plugins.css">
<link rel="stylesheet" href="css/main.css">
<link rel="stylesheet" href="css/themes.css">
<script src="js/vendor/modernizr-2.6.2-respond-1.1.0.min.js"></script>
</head>
<body>
	<div id="page-container">

<!------------------------------------------------------ Header Start ----------------------------------------------------------->
		<jsp:include page="header.jsp"></jsp:include>
		<!------------------------------------------------------- Header End ------------------------------------------------------------->

		<!------------------------------------------------------ Menu Start ----------------------------------------------------------->

		<jsp:include page="menu.jsp"></jsp:include>

		<!------------------------------------------------------ Menu End --------------------------------------------------------------->


<!------------------------------------------------------ Main Divison ------------------------------------------------------------>	
			
  
	<div id="page-content">
 
		<h3 class="page-header page-header-top">Customer <small> Master</small></h3>
		
		<p align="right"><a href="product_add.html"><button type="button" class="btn btn-primary">Add Product</button></a></p>
	
		<table id="example-datatables" class="table table-striped table-bordered table-hover">
			<thead>
				<tr>
				<th class="span1 hidden-phone"><input type="checkbox" id="ckbCheckAll" style="margin-left:15px;margin-bottom:5px;"/></th>
				<th><i class="icon-user"></i> Product Name</th>
				<th class="hidden-phone hidden-tablet"><i class="icon-envelope-alt"></i> Contact No</th>
				<th class="span1">Actions</th>

				</tr>
			</thead>
			<tbody>
			
				<tr>

				
						<script>
                		$(document).ready(function () {
							$("#ckbCheckAll").click(function () {
								$(".checkBoxClass").prop('checked', $(this).prop('checked'));
							});
						});
						
                </script>
					<td class="span1 hidden-phone">1</td>
					<td><a href="javascript:void(0)">Shoes</a></td>
					<td class="hidden-phone hidden-tablet"  >9033891186</td>
					<td class="span1">
						<div class="btn-group">
							<a data-toggle="tooltip" title="View" class="btn btn-warning" data-reveal-id="myDtModal"><i class="icon-list-ul"></i></a>

							
							<a href="customer_add.html" data-toggle="tooltip" title="Edit" class="btn btn-success" style="margin-left:10px;"><i class="icon-pencil"></i></a>

							<a href="customer_master.html" data-toggle="tooltip" title="Delete" class="btn btn-danger" onClick="return confirm('Are You Sure You Want To Delete?');" style="margin-left:10px;"><i class="icon-remove"></i></a>

					
						</div>
					</td>
				</tr>
				
				
				<tr>

					<td class="span1 hidden-phone">1</td>
					<td><a href="javascript:void(0)">Shopping Expo</a></td>
					<td class="hidden-phone hidden-tablet"  >9033891186</td>
					<td class="span1">
						<div class="btn-group">
							<a data-toggle="tooltip" title="View" class="btn btn-warning" data-reveal-id="myDtModal"><i class="icon-list-ul"></i></a>

							
							<a href="customer_add.html" data-toggle="tooltip" title="Edit" class="btn btn-success" style="margin-left:10px;"><i class="icon-pencil"></i></a>

							<a href="customer_master.html" data-toggle="tooltip" title="Delete" class="btn btn-danger" onClick="return confirm('Are You Sure You Want To Delete?');" style="margin-left:10px;"><i class="icon-remove"></i></a>

					
						</div>
					</td>
				</tr>	
				
				<tr>

					<td class="span1 hidden-phone">1</td>
					<td><a href="javascript:void(0)">Shopping Expo</a></td>
					<td class="hidden-phone hidden-tablet"  >9033891186</td>
					<td class="span1">
						<div class="btn-group">
							<a data-toggle="tooltip" title="View" class="btn btn-warning" data-reveal-id="myDtModal"><i class="icon-list-ul"></i></a>

							
							<a href="customer_add.html" data-toggle="tooltip" title="Edit" class="btn btn-success" style="margin-left:10px;"><i class="icon-pencil"></i></a>

							<a href="customer_master.html" data-toggle="tooltip" title="Delete" class="btn btn-danger" onClick="return confirm('Are You Sure You Want To Delete?');" style="margin-left:10px;"><i class="icon-remove"></i></a>

					
						</div>
					</td>
				</tr>
			</tbody>
		</table>
	</div>
		
<!-------------------------------------------------- End main Divison ------------------------------------------------------------>	

</div>

</div>


<!-------------------------------------------------- Footer Start ------------------------------------------------------------>	

<footer>
	
	
	 <%@ include file="footer.html" %>

</footer>

<!-------------------------------------------------- Footer End ------------------------------------------------------------------>	



<!--[if lte IE 8]><script src="js/helpers/excanvas.min.js"></script><![endif]-->
<script type="text/javascript" src="js/jquery-1.6.4.min.js"></script>
<link rel="stylesheet" href="css/reveal.css" />	
<script type="text/javascript" src="js/jquery.reveal.js"></script>
<script type="text/javascript" src="js/jquery-latest.js"></script>
<script type="text/javascript">

    function getData(id)
    {                   
            $.ajax ({
                cache: false,  		
                type:"get",
                url:"Controller/service.php?button1=AjaxgetCustomer&id="+id,

                success: function(data) {
                    $("#loadInvDetails").html(data);           
                }
            });       
    }
</script>
<script src="js/jquery-1.9.1.min.js"></script>

<script>!window.jQuery && document.write(unescape('%3Cscript src="js/vendor/jquery-1.9.1.min.js"%3E%3C/script%3E'));</script>
<script src="js/vendor/bootstrap.min.js"></script>
<script src="js/plugins.js"></script>
<script src="js/main.js"></script><script>$(function(){$("#example-datatables").dataTable({aoColumnDefs:[{bSortable:!1,aTargets:[0]}]}),$("#example-datatables2").dataTable(),$("#example-datatables3").dataTable()});</script>

</body>
</html>
