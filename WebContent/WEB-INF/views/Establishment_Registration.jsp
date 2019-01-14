<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">


<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<!-- <script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"
	integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut"
	crossorigin="anonymous"></script> -->
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"
	integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k"
	crossorigin="anonymous"></script>


<link rel="stylesheet" href="CSS\Student_Registration.css" />

</head>

<body>
	<div class="jumbotron text-center">

		<h1>National Apprenticeship Training Scheme - 2019</h1>
		<br>
		<h3>Establishment Registration Form</h3>

	</div>


	<form action="/action_page.php">

		<div class="row">
			<div class="col-md-4 form-group">
				<label for="ename">Establishment Name:</label> <input type="text"
					required placeholder="Enter Name" name="ename"
					class="form-control input-sm modify" id="ename">
			</div>
			<div class="col-md-4 form-group">
				<label for="type">Establishment Type :</label> <select
					class="custom-select d-block w-100" name="type" id="type" required>
					<option value="">Choose...</option>
					<option>Autonomous</option>
					<option>Non-Autonomous</option>

				</select>
			</div>

			<div class="col-md-4 form-group">
				<label for="username">Username :</label> <input type="username"
					name="uname" required class="form-control modify" id="username">
			</div>
		</div>


		<div class="row">
			<div class="col-md-4 form-group">
				<label for="pwd">Password :</label> <input type="password" required
					name="password" class="form-control modify" id="pwd">
			</div>
			<div class="col-md-4 form-group">
				<label for="address">Address :</label>
				<textarea class="form-control" rows="2" id="comment" name="address"></textarea>

			</div>
			<div class="col-md-4 form-group">
				<label for="email">Email Id :</label> <input type="email" required
					name="email" class="form-control modify" id="email">

			</div>
		</div>



		<div class="row">
			<div class="col-md-4 form-group">
				<label for="cpwd">Confirm Password :</label> <input type="password"
					name="cpassword" required class="form-control modify"
					id="cpassword">
			</div>

			<div class="col-md-4 form-group">
				<label for="psno">Employee Number :</label> <input type="number"
					required name="psno" class="form-control modify" id="psno">

			</div>


			<div class="col-md-4 form-group">
				<label for="type">District :</label> <select
					class="custom-select d-block w-100" name="type" id="type" required>
					<option value="">Choose...</option>
					<option>Mumbai Suburban</option>
					<option>Navi Mumbai</option>
					<option>Navi Mumbai</option>
					<option>Navi Mumbai</option>
					<option>Navi Mumbai</option>
					<option>Navi Mumbai</option>


				</select>
			</div>
		</div>

		<div class="row">
			<div class="col-md-4 form-group">
				<label for="degree">State :</label> <select
					class="custom-select d-block w-100 modify" name="degree"
					id="degree" required>
					<option value="">Choose...</option>
					<option>Maharashtra</option>
					<option>Goa</option>
					<option>Gujarat</option>
					<option>Orissa</option>

				</select>
			</div>

		</div>

		<br>
		<fieldset class="border p-2">
			<legend class="w-auto">Bank Details</legend>

			<div>
				<label for="bname">Bank Name :</label> <select
					class="custom-select d-block w-100 modify" name="degree" id="bname"
					required>
					<option value="">Choose...</option>
					<option>HDFC</option>
					<option>HSBC</option>
					<option>SBI</option>
					<option>Bank of Maharashtra</option>

				</select>
			</div>

			<br> <label for="bno">Bank Account Number :</label> <input
				type="number" placeholder="Enter Account Number" name="bno" required
				class="form-control modify" id="bno"> <br>
			<div>
				<label for="brname">Branch Name :</label> <select
					class="custom-select d-block w-100 modify" name="brname"
					id="brname" required>
					<option value="">Choose...</option>
					<option>Bandra West</option>
					<option>Dahisar East</option>
					<option>Boriwali East</option>
					<option>Andheri</option>

				</select>
			</div>


			<br> <label for="ifsc">IFSC Number :</label> <input
				type="number" placeholder="Enter IFSC Code" name="ifsc" required
				class="form-control modify" id="ifsc">



		</fieldset>





		<br>

		<div class="text-center">

			<button type="submit" class="btn btn-danger">Submit</button>

		</div>


	</form>
</body>

</html>