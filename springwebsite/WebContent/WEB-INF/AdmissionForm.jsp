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
	<h1>${headerMessage}</h1>
	
	<h3>STUDENT ADMISSION FORM FOR ENGINEERING COURSES</h3>
	
	<form action="/springwebsite/submitAdmissionForm.html" method="post">
		<table>
			<tr>
				<td>Student's Name: <input type="text" name="studentName"/></td>
			</tr>
			<tr>
				<td>Student's Hobby: <input type="text" name="studentHobby"/></td>
			</tr>
			<tr>
				<td>Student's Mobile: <input type="text" name="studentMobile"/></td>
			</tr>
			<tr>
				<td>Student's DOB: <input type="text" name="studentDOB"/></td>
			</tr>
			<tr>
				<td>Student's SKill Set:</td>
				<td>	
					<select name="studentSkills" multiple>
						<option value="Java Core">Java Core</option>
						<option value="Spring Core">Spring Core</option>
						<option value="Spring MVC">Spring MVC</option>
					</select>
				</td>
			</tr>
		</table>
		<input type="submit" value="Submit this form by clicking here"/>
	</form>
	
</body>
</html>