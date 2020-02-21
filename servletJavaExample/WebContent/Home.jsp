<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>
<form  action="RegistrationServletJs" method="Post">
	<h1 style="background-color:LightGray;"> Registration Form </h1>
	<table style="width:100%">
	<tr>
				<td style="background-color:LightGray;"><b>First Name</b></td>
				<td><input type="text" name="First Name"></td>
			</tr>
			<tr>
				<td style="background-color:LightGray;"><b>Last Name</b></td>
				<td><input type="text" name="Last Name"></td>
			</tr>
			<tr>
				<td style="background-color:LightGray;"><b> Date of Birth </b></td>
				<td><input type="date" name="date"></td> 
			</tr>
			<tr>
			<td style="background-color:LightGray;"> <b>Address</b> </td>
			<td><input type = "text" name ="Address"></td>
			</tr>
			<tr>
			<td style="background-color:LightGray;"> <b>Phone</b> </td>
			<td><input type = "number" name ="Number"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" name="submit" style="height:50px; width:50px"></td> 
			</tr>
			
	</table>
	</form>
</body>
</html>