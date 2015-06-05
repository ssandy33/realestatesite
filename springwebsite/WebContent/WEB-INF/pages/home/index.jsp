<!DOCTYPE html>
<html>
<head>

	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">

	<!-- Optional theme -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>

	<!-- Latest compiled and minified JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

</head>
<body>
	
	    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Gabby Sandy</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
<!--           <form class="navbar-form navbar-right"> -->
<!--             <div class="form-group"> -->
<!--               <input type="text" placeholder="Email" class="form-control"> -->
<!--             </div> -->
<!--             <div class="form-group"> -->
<!--               <input type="password" placeholder="Password" class="form-control"> -->
<!--             </div> -->
<!--             <button type="submit" class="btn btn-success">Sign in</button> -->
<!--           </form> -->
        </div><!--/.navbar-collapse -->
      </div>
    </nav>

	<%@ include file="/WEB-INF/pages/home/inc_jumbotron.jsp"%>
	
    <div class="container">
      <!-- Example row of columns -->
      <div class="row">
		<%@ include file="/WEB-INF/pages/home/inc_index_panel_one.jsp"%>
		<%@ include file="/WEB-INF/pages/home/inc_index_panel_two.jsp"%>
		<%@ include file="/WEB-INF/pages/home/inc_index_panel_three.jsp"%>
      </div>

      <hr>

      <footer>
        <p>&copy; Gabby Sandy 2015</p>
      </footer>
    </div> <!-- /container -->
	
</body>
</html>