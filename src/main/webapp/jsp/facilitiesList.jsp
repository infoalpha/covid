<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
<title>Covid Facilities</title>
</head>

<body>
	<h2>All Facilities in System</h2>

	<table border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Registered Company Name</th>
			<th>Address</th>
			<th>Bed Capacity</th>
			<th>Inspection Date</th>
			<th>Current Status</th>
		</tr>
		<c:forEach items="${facilities}" var="facility">
			<tr>
				<td>${facility.id}</td>
				<td>${facility.name}</td>
				<td>${facility.companyName}</td>
				<td>${facility.address}</td>
				<td>${facility.bedCapacity}</td>
				<td>${facility.inspectionDate}</td>
				<td>${facility.status}</td>

			</tr>
		</c:forEach>
	</table>

</body>
</html>