
<%
String name1 = "";
String address = "";
String phone = "";
String name2 = "";
String error=null;
if (request.getParameter("name1") != null) {
	name1 = request.getParameter("name1");
}
if (request.getParameter("name2") != null) {
	name2 = request.getParameter("name2");
}

if (request.getParameter("address") != null) {
	address = request.getParameter("address");
}
if (request.getParameter("phone") != null) {
	phone = request.getParameter("phone");
}
if(request.getParameter("errorMsg") != null)
	error=request.getParameter("errorMsg");
	
	%>
	
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<style><%@include file="../stat/student.css"%></style>

<meta charset="UTF-8">
<link rel="stylesheet" href="css/bootstrap.min.css.map" />
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link
	href="https://fonts.googleapis.com/css2?family=Open+Sans:ital,wght@0,300;0,400;0,500;0,600;0,700;1,300;1,400;1,500;1,600&display=swap"
	rel="stylesheet">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous" />
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin><%@ taglib
	prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<title>حجز مقعد</title>
</head>
<body>
	<nav>
		<div class="container-fluid d-flex justify-content-center">
			<h2 class="fs-1 fw-bold text-warning">مركز بصمة فن</h2>
		</div>
		<span></span>
	</nav>
	<!-- end nav -->
	<form dir="rtl" action="addStudent" method="post">
		<div class="main" style="border-radius: 50px;">

			<header class="text-danger">احجز مكانك</header>
			<div class="Username">
				<label for="" style="font-weight: bold;">الاسم</label> <input
					type="text" name="name1" required value="<%=name1%>" />
			</div>
			<div class="Username">
				<label for="" style="font-weight: bold;">اسم العائلة</label> <input
					type="text" name="name2" required value="<%=name2%>" />
			</div>

			<div class="Address">
				<label for="" style="font-weight: bold;">العنوان</label><input
					type="text" name="address" required value="<%=address%>" />
			</div>

			<div class="number">
				<label for="" style="font-weight: bold;">الهاتف</label><input
					type="text" name="phone" required value="<%=phone%>" />
			</div>
			<div class="container">
				<label for="" class="label fw-bold fs-2 ">موعد الحجز</label>
				<section class=" d-flex justify-content-center  align-items-center">

					<select class="form-select" aria-label="Default select example"
						name="comeDate"
						style="font-size: 20px; border-radius: 15px; width: 300px; height: 45px;">
						<c:forEach items="${times}" var="time">
							<option>${time.name}</option>
						</c:forEach>
					</select>
			</div>

			<div class="button">

				<button class="text-warning">احجز الان</button>
			</div>
			</section>
				
			<br>
			 <c:if test = "${check ==5 }">
        <div class="p-3 mb-2 bg-danger text-white"
					style="border-radius: 50px">
					<span style="font-size: 30px; color: black; font-weight: 900;">
						${errorMsg} </span>
				</div>
      </c:if>			
			
			
		</div>
	</form>
</body>
</html>