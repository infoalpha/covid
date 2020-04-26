<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Facility Registration</title>
</head>
<body>
	<form:form id="facilityRegForm" modelAttribute="facility" action="registerProcess"
		method="post">

		<table align="center">
			<tr>
				<td><form:label path="name">Facility Name</form:label></td>
				<td><form:input path="name" name="name" id="name" /></td>
			</tr>
			<tr>
				<td><form:label path="companyName">Company Name</form:label></td>
				<td><form:input path="companyName" name="companyName"
						id="companyName" /></td>
			</tr>
			<tr>
				<td><form:label path="address">Address</form:label></td>
				<td><form:input path="address" name="address"
						id="address" /></td>
			</tr>
			<tr>
				<td><form:label path="bedCapacity">Bed Capacity</form:label></td>
				<td><form:input path="bedCapacity" name="bedCapacity" id="bedCapacity" /></td>
			</tr>

			<tr>
				<td></td>
				<td><form:button id="register" name="register">Register</form:button></td>
			</tr>
			<tr></tr>
			<tr>
				<td></td>
				<td><a href="/covid">Home</a></td>
			</tr>
		</table>
	</form:form>

</body>
</html>