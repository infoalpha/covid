<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Facility Information</title>
</head>
<body>
	<form:form id="editfacilityForm" modelAttribute="facility"
		action="/covid/facility/editsave" method="post">

		<table align="center">
			<tr>

				<td><form:hidden path="id" name="id" id="id" /></td>
			</tr>
			<tr>
				<td><form:label path="name">Name</form:label></td>
				<td><form:input path="name" name="name" id="name" /></td>
			</tr>
			<tr>
				<td><form:label path="companyName">Company Name</form:label></td>
				<td><form:input path="companyName" name="companyName"
						id="companyName" /></td>
			</tr>
			<tr>
				<td><form:label path="address">Address</form:label></td>
				<td><form:input path="address" name="address" id="address" /></td>
			</tr>
			<tr>
				<td><form:label path="bedCapacity">Bed Capacity</form:label></td>
				<td><form:input path="bedCapacity" name="bedCapacity"
						id="bedCapacity" /></td>
			</tr>
			<tr>
				<td><form:label path="inspectionDate">Inspection Date</form:label></td>
				<td><input type="datetime-local" path="inspectionDate"
					id="inspectionDate" name="inspectionDate" value="2020-04-26T19:30"
					min="2019-12-12T00:00" max="2021-06-14T00:00"></td>
			</tr>
			<tr>
				<td><form:label path="status">Status</form:label></td>
				<td><form:input path="status" name="status" id="status" /></td>
			</tr>

			<tr>
				<td></td>
				<td><form:button id="save" name="save">Save</form:button></td>
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