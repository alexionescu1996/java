<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<title>Bootstrap Navbars</title>
<link rel="stylesheet" type="text/css"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
<style type="text/css">
body {
	padding-top: 70px;
}

.jumbotron {
	color: #2c3e50;
	background: #ecf0f1;
}

.navbar-inverse {
	background: #2c3e50;
	color: white;
}

.navbar-inverse .navbar-brand, .navbar-inverse a {
	color: white;
}

.navbar-inverse .navbar-nav>li>a {
	color: white;
}
</style>

</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-nav-demo"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a href="#" class="navbar-brand"><span
					class="glyphicon glyphicon-picture"></span> IMGS</a>
			</div>
			<div class="collapse navbar-collapse" id="bs-nav-demo">
				<ul class="nav navbar-nav">
					<li><a href="#">About</a></li>
					<li><a href="#">Contact</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#">Sign Up</a></li>
					<li><a href="#">Login</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container">

		<div class="jumbotron">
			<h1>
				<i class="fa fa-camera-retro"></i> The Image Gallery
			</h1>
			<p>A bunch of beautiful images that I didn't take</p>
		</div>

		<div class="row">
			<c:forEach var="tempPhoto" items="${photos}">

				<div class="col-lg-4 col-sm-6">
					<div class="thumbnail">
						<img src="${tempPhoto.source}">
					</div>
				</div>
			</c:forEach>
		</div>
	</div>

	<script src="https://code.jquery.com/jquery-2.1.4.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>