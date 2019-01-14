<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title></title>
<meta name="viewport" content="width=device-width, initial-scale=1">

<script src="main.js"></script>

<link rel="stylesheet" href="CSS\design.css">

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"
	integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"
	integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k"
	crossorigin="anonymous"></script>

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
					data-toggle="dropdown" href="#">Registration <span
						class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="Student_Registration.jsp">Candidate
								Registration</a></li>
						<li><a href="Establishment_Registration.jsp">Establishment
								Registration</a></li>

					</ul></li>


				<li><a href="Student_Login.jsp">Login </a></li>
				<li><a href="AboutUs.jsp">About Us </a></li>


				<li><a href="#">FAQ's </a></li>

				<li><a href="#">Complaints </a></li>

				<li><a href="Establishments.jsp">Establishments </a></li>

				<li><a href="Institutions.jsp">Institutions</a></li>



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
				<img src="HTML\cover1.jpg" alt="Los Angeles" style="width: 100%;">
			</div>

			<div class="item">
				<img src="HTML\cover2.jpg" alt="Chicago" style="width: 100%;">
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