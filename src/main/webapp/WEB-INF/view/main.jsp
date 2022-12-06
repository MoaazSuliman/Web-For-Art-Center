
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.2/font/bootstrap-icons.css">
<%--     <style><%@include file="css/bootstrap.min.css.map"%></style> --%>
<style><%@include file="../stat/bootstrap.min.css"%></style>
  <style><%@include file="../stat/main.css"%></style><link rel="preconnect" href="https://fonts.gstatic.com" crossorigin /><link
	href="https://fonts.googleapis.com/css2?family=Open+Sans:ital,wght@0,300;0,400;0,500;0,600;0,700;1,300;1,400;1,500;1,600&display=swap"
	rel="stylesheet" />

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<title>مركز بصمه فن</title>
</head>
<body dir="rtl">
	<!-- start navbar -->
	<nav class="navbar navbar-expand-lg ">
		<div class="container-fluid d-flex justify-content-center">
			<h1 class="fs-1 fw-bold text-warning">مركز بصمة فن يرحب بكم</h1>
		</div>
		</div>
	</nav>
	<!-- start landing -->
	<div class="landing-page">
		<div class="container">
			<div class="overlay"></div>
			<div class="content">
				<h2 class="span fs-1 fw-bold text-warning mb-5 pt-3">
					دبلومة الرسم الشاملة <span></span>
				</h2>

				<h3 class="fs-2 fw-bold my-4">
					هذه الدبلومه صممت خصيصاً لمن يريد تعلم الرسم والتظليل والتلوين
					لجميع العناصر وفقًا لأحدث الطرق والأساليب التي تؤدي الى الوصول
					لمستوى احترافي في رسم الدورات التدريبيه المتضمنة داخل الدبلومه <span
						class="text-warning">:-</span>
				</h3>
				<!-- 				draws database -->
				<div class="paragraph my-4">
					<c:forEach items="${draws}" var="draw">
						<p class="fs-3 fw-semibold">
							<span style="color: white;">${draw.name }</span>
						</p>
					</c:forEach>
				</div>
				<section>
					<h3 class="fs-2 fw-bold text-warning my-5">
						دورات <span></span>
					</h3>
					<!-- 					courses database -->
					<div class="m-3">
						<c:forEach items="${courses}" var="course">
							<p>${course.name}</p>
						</c:forEach>
					</div>
				</section>
			</div>
		</div>
	</div>
	<!-- start cards -->
	<div class="cards py-5">
		<div class="d-flex justify-content-center">
			<h1 class="span fs-1 fw-bold text-warning mb-5 pt-3">
				صور المركز <span></span>
			</h1>
		</div>

		<div class="container row mx-auto">

			<c:forEach items="${pics}" var="pic">
				<div
					class="card sm-col-12 md-col-6 lg-col-4 mx-auto my-lg-4 my-md-3 my-sm-2"
					style="width: 18rem">
					<img src="${pic.url}" class="card-img-top" alt="..." />
				</div>
			</c:forEach>
			<c:forEach items="${pics}" var="pic">
				<div
					class="card sm-col-12 md-col-6 lg-col-4 mx-auto my-lg-4 my-md-3 my-sm-2"
					style="width: 18rem">
					<img src="${pic.url}" class="card-img-top" alt="..." />
				</div>
			</c:forEach>

		</div>
	</div>


	<!-- 		Video -->
	<c:if test="${vLen>=1 }">
	<div class="d-flex justify-content-center">
			<h1 class="span fs-1 fw-bold text-warning mb-5 pt-3">
				فيديوهات المركز <span></span>
			</h1>
		</div>
		</c:if>
	<c:forEach items="${videos}" var="v">
	<div class="video">
		<video controls loop>
			<source
				src="${v.url}"
				type="video/mp4">

			Your Browser Does Not Support Video Tag
		</video>
		<p>${v.detail}</p>
	</div>
	</c:forEach>
	<!--     End OfVideo -->


	<!-- start text-->
	<div class="text ">
		<div class="container">
			<!-- 				<header class="span d-flex justify-content-center mb-3"> -->
			<!-- 					- # المستوى الاول :- <span></span> -->
			<!-- 				</header> -->
			<!-- 				<p class="mt-5">- الرسم بالرصاص يتم في هذا المستوى تعلم رسم -->
			<!-- 					الطبيعه الصامته و رسم الوجه الانساني بداية من التدريب على رسم الخط -->
			<!-- 					الخارجي مرورا بتظليل العناصر و تجسيدها على أن يكون الناتج النهائي -->
			<!-- 					مطابقا للأصل .</p> -->
			<header>- محتوى الدورة :-</header>
			<!-- 			details database -->
			<c:forEach items="${details}" var="detail">
				<p>${detail.name}</p>
			</c:forEach>
		</div>
	</div>


	<!-- footer -->
	<div class="footer py-3 bg-warning mt-5">
		<section class="cards-contact">
			<div class="card-main ">
				<div class="card m-3">
					<div class="icon">
						<i class="bi bi-telephone"></i>
					</div>
					<div class="info">
						<h3>اتصل بنا</h3>
						<p>0568301420</p>
						<p>0568301320</p>
					</div>
				</div>
				<div class="card m-3">
					<div class="icon">
						<a
							href="https://www.facebook.com/%D9%85%D8%B1%D9%83%D8%B2-%D8%A8%D8%B5%D9%85%D8%A9-%D9%81%D9%86-2238634146406604/"><i
							class="fa-brands fa-facebook"></i></a>
					</div>

					<div class="icon">
						<a
							href="https://www.google.com/maps?q=31.9033331,35.2029687&z=17&hl=ar">
							<i class="blue bi bi-geo-alt"></i>
						</a>
					</div>
					<div class="info">
						<a href="addStudent">
							<button class="text-warning">احجز الان</button>
						</a>
					</div>
				</div>
				<div class="card m-3">
					<div class="icon">
						<i class="fa-brands fa-whatsapp"></i>
					</div>
					<div class="info">
						<h3>تواصل واتس</h3>
						<p>00972503372128</p>
					</div>
				</div>
			</div>
		</section>
	</div>
</body>
</html>
