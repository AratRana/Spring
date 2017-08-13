<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">JDA</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Products</a></li>
				<li><a href="#">New Product</a></li>
			</ul>
		</div>
	</nav>

	<div class="container">
		<c:choose>
			<c:when test="${mode == 'PD_VIEW'}">
				<table class="table table-hover">
					<thead>
						<tr>
							<th>Product Name</th>
							<th>Brand</th>
							<th>Price</th>
							<th></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${products}" var="item">
							<tr>
								<td>${item.productName}</td>
								<td>${item.brand}</td>
								<td>${item.price}</td>
								<td><a href="editProduct?id=${item.id}">Edit</a>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</c:when>
			<c:when test="${mode =='PD_EDIT'}">
				<form action="save" method="POST">
					<input type="hidden" name="id" id="id" value="${product.id}">
					<div class="form-group">
						<label>Product Name</label>
						<input type="text" id="productName" name="productName" value="${product.productName}" class="form-control">
					</div>
					<div class="form-group">
						<label>Brand</label>
						<input type="text" id="brand" name="brand" value="${product.brand }" class="form-control">
					</div>
					<div class="form-group">
						<label>Price</label>
						<input type="text" id="price" name="price" value="${ product.price}" class="form-control">
					</div>
					<button type="submit" class="btn btn-default">Submit</button>
				</form>
			</c:when>
		</c:choose>
	</div>

</body>
</html>
