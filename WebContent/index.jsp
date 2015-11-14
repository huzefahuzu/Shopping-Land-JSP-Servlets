<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js">
	<!--<![endif]-->
	<head>
		<meta charset="utf-8">
		"WebContent/index.jsp"<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<title>Shopping_Expo Admin Login Panel </title>
		<meta name="description" content="Twitter Bootstrap Modal Login Popup - Social Login Popup ">
		<meta name="viewport" content="width=device-width, initial-scale=1">

		<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
		<link href='http://fonts.googleapis.com/css?family=Bree+Serif' rel='stylesheet' type='text/css'>
		<link href='http://fonts.googleapis.com/css?family=Philosopher' rel='stylesheet' type='text/css'>
		
		
		<link rel="stylesheet" href="css/bootstrap.min.css"/>
		<link rel="stylesheet" href="css/font-awesome.min.css"/>
	
		<link rel="stylesheet" href="css/style.css" />
		<script src="js/vendor1/modernizr-2.6.2.min.js"></script>
		<script src="js/vendor1/jquery-1.10.2.min.js"></script>
		<script src="js/vendor1/bootstrap.min.js"></script>
		
		<style>
		
			body{
			    background-image:url("img/template/bk5.jpg") ;
				background-repeat:no-repeat;
				
			}
		
		</style>
		
		
	</head>
	<body>
	<script type="text/javascript">
	</script>
	
		<!--[if lt IE 7]>
		<p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
		<![endif]-->

		<!-- Add your site or application content here -->
		<div class="container-fluid" style="margin-right: 250px">
			<div class="row">
				<div class="col-md-offset-4 col-lg-offset-4 col-md-4 col-lg-4">
					
					<button id='modal-launcher' class="btn btn-primary btn-lg " data-toggle="modal" data-target="#login-modal" style="margin-top:500px;">
					  		Sign In 
					</button>
				</div>
			</div>
		</div><p style="margin-left:250px; margin-top:50px;">${authentication}</p>	
	</body>
</html>



<div class="modal fade" id="login-modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
    	<div class="modal-content">
      		<div class="modal-header login_modal_header">
        		<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        		<h2 class="modal-title" id="myModalLabel">Login to Your Account</h2>
      		</div>
      		<div class="modal-body login-modal">
      			
      			<br/>
      			<form action="lst" method="post">
      			<div id='social-icons-conatainer'>
	        		<div class='modal-body-center' style="width:280px;margin-left:130px;">
	        			<div class="form-group">
		              		<input type="text" id="username" placeholder="Enter your name" name="adminUser" value="" class="form-control login-field">
		              		<i class="fa fa-user login-field-icon"></i>
		            	</div>
		
		            	<div class="form-group">
		            	  	<input type="password" id="login-pass" placeholder="Password" name="adminPassword" value="" class="form-control login-field">
		              		<i class="fa fa-lock login-field-icon"></i>
		            	</div>
		
		            	<input type="submit" value="Login" class="btn btn-success modal-login-btn"/>
		            	
	        		</div>
	        	
	        		
	        		
	        	</div>																												
        		</form>
        		
        		
      		</div>
      		<div class="clearfix"></div>
      		<div class="modal-footer login_modal_footer">
      		</div>
    	</div>
  	</div>
</div>

