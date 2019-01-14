<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" media="screen" href="main.css" />
<link rel="stylesheet" type="text/css" media="screen"
	href="stylesheet.css" />
<script src="main.js"></script>


<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
	<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">NATS</a>
		</div>
		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Home</a></li>
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#">Registration <span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="#">Candidate Registration</a></li>
					<li><a href="#">Establishment Registartion</a></li>
					<li><a href="#">Officer Registration</a></li>
				</ul></li>

			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#">Login <span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="#">Candidate Login</a></li>
					<li><a href="#">Establishment Login</a></li>
					<li><a href="#">Officer Login</a></li>
				</ul></li>


		</ul>

		<ul class="nav navbar-nav navbar-right" style="margin-right: 20px">
			<br>
			<li style="color: white">Academic Year 2019</li>
		</ul>
	</div>
	</nav>



	<div id="myCarousel" class="carousel slide" data-ride="carousel">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
			<li data-target="#myCarousel" data-slide-to="2"></li>
		</ol>

		<!-- Wrapper for slides -->
		<div class="carousel-inner">
			<div class="item active">
				<img src="C:\Users\vshadmin\Desktop\NATS\web\HTML\cover1.jpg"
					alt="Los Angeles" style="width: 100%;">
			</div>

			<div class="item">
				<img src="C:\Users\vshadmin\Desktop\NATS\web\HTML\cover2.jpg0"
					alt="Chicago" style="width: 100%;">
			</div>


		</div>

		<!-- Left and right controls -->
		<a class="left carousel-control" href="#myCarousel" data-slide="prev">
			<span class="glyphicon glyphicon-chevron-left"></span> <span
			class="sr-only">Previous</span>
		</a> <a class="right carousel-control" href="#myCarousel"
			data-slide="next"> <span
			class="glyphicon glyphicon-chevron-right"></span> <span
			class="sr-only">Next</span>
		</a>
	</div>



	<div class="footer">
		<div class="container">
			<div class="col-md-3">
				<p>Disclaimer</p>
				<p>link</p>
				<p>link</p>
				<p>link</p>
				<p>link</p>
			</div>
			<div class="col-md-4" id="footer"></div>
			<div class="col-md-3">
				<p>&copy; copyright 2018</p>
				<p>National Scholarship Portal</p>
				<p>Site Best Viewed In</p>
				<p>IE-6+, Mozilla Firefox, Chrome, Safari etc...</p>
			</div>
			<div class="col-md-2">
				<!--                 	<p>Download App Now:</p>
                    <p><img src="/img/apple.png"></p><p><img src="/img/google.png"></p>-->
			</div>
		</div>
	</div>
</body>
</html>