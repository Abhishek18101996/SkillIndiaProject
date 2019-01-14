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

	<div class="jumbotron">

		<h1>National Apprenticeship Training Scheme</h1>
		<br>
		<div class="page-header">
			<h1>(NATS-2019)</h1>
		</div>

		<p>
			National Apprenticeship Training Scheme (NATS) portal <br>
			provides a platform for various stakeholders like Students,
			Establishments and Institutions to leverage the Apprenticeship
			training programme.
		</p>
	</div>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">NATS</a>
			</div>

			<ul class="nav navbar-nav">
				<li class="active"><a href="Home_Page.jsp">Home</a></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Registration <span
						class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="Student_Registration.jsp">Candidate
								Registration</a></li>
						<li><a href="Establishment_Registration.jsp">Establishment
								Registration</a></li>
						<li><a href="#">Officer Registration</a></li>

					</ul></li>

				<li><a href="Student_Login.jsp">Login </a></li>

				<li><a href="AboutUs.jsp">About Us </a></li>


				<li><a href="#">FAQ's </a></li>

				<li><a href="#">Complaints </a></li>

				<li><a href="Establishments.jsp">Establishments </a></li>

				<li><a href="#">Institutions</a></li>



			</ul>

			<ul class="nav navbar-nav navbar-right" style="margin-right: 20px">
				<br>
				<li style="color: white">Academic Year 2019</li>
			</ul>
		</div>


	</nav>

	<br>


	<div>

		<h3>List of Establishments : 2019-2020</h3>
		<br>
		<p>The National Apprenticeship Training Scheme helps technical
			institutions in placing students, passing out of their campuses, in
			leading organisations for Apprenticeship Training. Central, State and
			Private organisations engage candidates for Apprenticeship Training.
			Institutions interested in availing the benefits of this scheme
			should register themselves with the NATS Web Portal. Institutions
			traditionally located in districts / taluks, where industrial
			clusters are lacking face difficulties in placing their students.
			This Scheme helps these institutions to get better access for
			opportunities to their students, currently available to urban
			candidates. Tie up with Boards of Apprenticeship Training/ Board of
			Practical Training, exposes institutions to the current market
			expectations from industries, which help them tailor their curriculum
			and training programmes to suit the present scenario.</p>

	</div>



	<div class="container">
		<h2>Establishments 2019-2020</h2>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>Establishment Name</th>
					<th>Type</th>
					<th>Courses</th>
					<th>Working Days</th>
					<th>Contact</th>
					<th>City</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>Manipal University</td>
					<td>Autonomous</td>
					<td>JAVA, Android, SQL , Data-Science</td>
					<td>45 Days</td>
					<td>7045891175</td>
					<td>Mumbai</td>
				</tr>
				<tr>
					<td>Punjab University</td>
					<td>Autonomous</td>
					<td>SQL , Data-Science</td>
					<td>15 Days</td>
					<td>9895654524</td>
					<td>Haryana</td>
				</tr>

				<tr>
					<td>Laqshya Infosoft</td>
					<td>Non-Autonomous</td>
					<td>PHP, SQL, Android, Python, JAVA</td>
					<td>70 Days</td>
					<td>8879015625</td>
					<td>Mumbai</td>
				</tr>

				<tr>
					<td>PSIT</td>
					<td>Autonomous</td>
					<td>C,C++, DBMS, CG</td>
					<td>35 Days</td>
					<td>9755569542</td>
					<td>Mumbai</td>
				</tr>

				<tr>
					<td>Techno Soft</td>
					<td>Autonomous</td>
					<td>Android, SQL , AI, DS</td>
					<td>30 Days</td>
					<td>5568889897</td>
					<td>Gujarat</td>
				</tr>

				<tr>
					<td>Manipal University</td>
					<td>Autonomous</td>
					<td>JAVA, Android, SQL , Data-Science</td>
					<td>20 Days</td>
					<td>7045891175</td>
					<td>Chennai</td>
				</tr>
			</tbody>
		</table>
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