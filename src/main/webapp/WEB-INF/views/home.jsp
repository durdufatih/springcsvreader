<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Welcome</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css" />

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css" />

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>CVS Reader Example</h1>

	<P>Spring MVC + Open CVS + Bootsrap</P>

	<table class="table">

		<c:forEach items="${personList}" var="person">
			<tr>
				<td>${person.name}</td>
				<td>${person.surname}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
