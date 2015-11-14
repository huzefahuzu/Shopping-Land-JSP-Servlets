<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>

		
        
        <link href="css1/bootstrap.css" rel="stylesheet" type="text/css" />
        <meta name="viewport" content="width=device-width,initial-scale=1.0">
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" rel="stylesheet">
        <link href="css1/datepicker3.css" rel="stylesheet">
        
        
		
</head>

<body>


		<form class="form-horizontal">
        	
            	<fieldset>
                	<legend style="text-align:center; font-size:36px; font-family:'MS Serif', 'New York', serif"> Admin Details </legend>
                    
                    <div class="form-group">
                    	<label class="col-sm-2 control-label"> Full Name :</label>
                        <div class="col-sm-5">
                        	<input type="text" name="firstname" id="firstname"  placeholder="full name" class="form-control"/>
                         
                        </div>
                    </div>
                <div class="form-group">
                    	<label class="col-sm-2 control-label"> Email :</label>
                        <div class="col-sm-5">
                        	<input type="text" placeholder="Email" class="form-control" />
                         
                        </div>
                    </div>
                <div class="form-group">
                    	<label class="col-sm-2 control-label"> Password :</label>
                        <div class="col-sm-5">
                        	<input type="password" placeholder="password" class="form-control" />
                         
                        </div>
                    </div>
                    
                    <div class="form-group">
                    	<label class="col-sm-2 control-label">Birth Date :</label>
                        <div class="col-sm-5">
                        	<div class="input-group date">
            <input type="text" class="form-control"><span class="input-group-addon"><i class="glyphicon glyphicon-calendar"></i></span>
        </div>

            <script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
				<script src="js2/bootstrap.min.js"></script>
                <script src="js2/bootstrap-datepicker.js"></script>
                <script>
                $('.input-group.date').datepicker({
                format: "yyyy/mm/dd",
                
                todayBtn: "linked",
                autoclose: true,
                todayHighlight: true
                });
    </script>
                        </div>
                    </div>
                    
                    
                    <div class="form-group">
                    
                    	<label class="col-sm-2 control-label">Gender :</label>
                        
                        <div class="col-sm-7">
                            <div class="radio-inline">
                            
                                <input type="radio"  name="gender" />Male
                                
                            </div>
                            <div class="radio-inline">
                            
                            	<input type="radio"  name="gender" />FeMale
                            </div>
                            
                        </div>
                    
                    </div>
                    
                    
                     <div class="form-group">
                    	<label class="col-sm-2 control-label">Location :</label>
                        <div class="col-sm-5">
                        	<input type="text" placeholder="Location" class="form-control"/>
                         
                        </div>
                    </div>
                    
                     <div class="form-group">
                    	<label class="col-sm-2 control-label">Address :</label>
                        <div class="col-sm-5">
                        	<textarea rows="5" cols="40"></textarea>
                         
                        </div>
                    </div>
                
                	 <div class="form-group">
                    	<label class="col-sm-2 control-label">Work Experiance :</label>
                        <div class="col-sm-5">
                        	<input type="text" placeholder="Work Experiance" class="form-control" />
                         
                        </div>
                    </div>
                    
                    <div class="form-group">
                    
                    	<label class="col-sm-2 control-label">Is Available :</label>
                        
                        <div class="col-sm-7">
                            <div class="radio-inline">
                            
                                <input type="radio"  name="av" />Yes
                                
                            </div>
                            <div class="radio-inline">
                            
                            	<input type="radio"  name="av" />No
                            </div>
                            
                        </div>
                    
                    </div>
                    
                    <div class="form-group">
                    	<div class="col-xs-offset-2 col-sm-5">
                        
                        	<button type="submit" class="btn btn-primary" >Submit</button>
                        </div>
                    
                    </div>
                </fieldset>
        </form>
        <script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.1/jquery.validate.min.js"></script>
        <script>
        	$('form').validate({
				
				rules:{
					
					firstname:{
							required:true
					}
				}
				
			});
        
        </script>
        
        
		<script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.1/jquery.validate.min.js"></script>
        <script src="js2/bootstrap.js" ></script>
</body>
</html>
