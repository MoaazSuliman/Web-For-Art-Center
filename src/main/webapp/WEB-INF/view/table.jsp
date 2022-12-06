<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
<%@include file="../stat/table.css"%>
</style>
<meta charset="UTF-8" />
<title>اداره مركز بصمه فن</title>
<link rel="stylesheet" href="css/bootstrap.min.css.map" />
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous" />
<link
	href="https://fonts.googleapis.com/css2?family=Open+Sans:ital,wght@0,300;0,400;0,500;0,600;0,700;1,300;1,400;1,500;1,600&display=swap"
	rel="stylesheet">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body style="background-color: #d7e0e7">
	<nav class="navbar navbar-expand-lg pb-5">
		<div class="container-fluid d-flex justify-content-center">
			<h1 class="fs-1 fw-bold text-warning mt-3">مركز بصمة فن</h1>
			<span></span>
		</div>
	</nav>
	<br />
	<br />
	<br />

	<header>
		<h2>الطلاب</h2>
	</header>
	<!-- 	StudentTable -->
	<table class="table table-dark table-striped" dir="rtl">
		<div class="container">
			<thead class="text-warning fw-bold fs-2">
				<tr>
					<th>الاسم</th>
					<th>اسم العائلة</th>
					<th>العنوان</th>
					<th>التليفون</th>
					<th>التاريخ</th>
					<th>تاريخ الحجز</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${students}" var="student">
					<tr>
						<td data-lable="الاسم">${student.name }</td>
						<td data-lable="اسم العائلة">${student.name2 }</td>
						<td data-lable="العنوان">${student.address }</td>
						<td data-lable="التليفون">${student.phone }</td>
						<td data-lable="التاريخ">${student.date }</td>
						<td data-lable="تاريخ الحجز">${student.comeDate }</td>
						<td data-lable="delete"><a
							href="deleteStudent/${student.id }"
							class="btn btn-danger text-warning">Delete</a></td>
					</tr>

				</c:forEach>
			</tbody>
		</div>
	</table>
	<!-- 	Draw -->
	<!-- 	DrawTable -->
	<header>
		<h2>الرسومات</h2>
	</header>
	<table class="table table-dark table-striped" dir="rtl">
		<div class="container">
			<thead class="text-warning fw-bold fs-2">
				<tr>
					<th>ID</th>
					<th>الاسم</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${draws}" var="draw">
					<tr>
						<td data-lable="id">${draw.id }</td>
						<td data-lable="الاسم">${draw.name}</td>
						<td data-lable="delete"><a href="deleteDraw/${draw.id }"
							class="btn btn-danger text-warning">Delete</a></td>
					</tr>

				</c:forEach>
			</tbody>
		</div>
	</table>

	<!-- 	end of draw table -->
	<!-- 	draw form for add -->
	<div class="forms" dir="rtl">
		<form action="addDraw" class="one" method="post">
			<section>
				<label for="">الاسم</label> <input type="text" name="name">
			</section>
			<section>
				<button class="btn btn-danger text-warning">اضافه</button>
			</section>
		</form>

		<!-- 	end of draw form for add  -->
		<!-- form for update draw -->
		<form action="updateDraw" class="two" method="post">
			<section>
				<label for="">ID</label> <input type="text" name="id">
			</section>
			<section>
				<label for="">الاسم</label> <input type="text" name="name">
			</section>
			<section>
				<button class="btn btn-danger text-warning">تعديل</button>
			</section>
		</form>
	</div>
	<!-- end of form for update draw -->
	<!-- end of draw -->
	<br>
	<br>


	<!-- 	Course -->
	<!-- 	CourseTable -->
	<header>
		<h2>الدورات</h2>
	</header>
	<table class="table table-dark table-striped" dir="rtl">
		<div class="container">
			<thead class="text-warning fw-bold fs-2">
				<tr>
					<th>ID</th>
					<th>الاسم</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${courses}" var="course">
					<tr>
						<td data-lable="id">${course.id }</td>
						<td data-lable="الاسم">${course.name}</td>
						<td data-lable="delete"><a href="deleteCourse/${course.id}"
							class="btn btn-danger text-warning">Delete</a></td>
					</tr>

				</c:forEach>
			</tbody>
		</div>
	</table>

	<!-- 	end of course table -->
	<!-- 	course form for add -->
	<div class="forms" dir="rtl">
		<form action="addCourse" class="one" method="post">
			<section>
				<label for="">الاسم</label> <input type="text" name="name">
			</section>
			<section>
				<button class="btn btn-danger text-warning">اضافه</button>
			</section>
		</form>
		<!-- 	end of course form for add  -->
		<br> <br>
		<!-- form for update course -->
		<form action="updateCourse" class="two" method="post">
			<section>
				<label for="">ID</label> <input type="text" name="id">
			</section>
			<section>
				<label for="">الاسم</label> <input type="text" name="name">
			</section>
			<section>
				<button class="btn btn-danger text-warning">تعديل</button>
			</section>
		</form>
	</div>
	<!-- 	end of form for update course -->
	<!-- 	end of course	 -->

	<br>
	<br>

	<!-- Pictures  -->

	<!-- pics table -->
	<header>
		<h2>الصور</h2>
	</header>
	<table class="table table-dark table-striped" dir="rtl">
		<div class="container">
			<thead class="text-warning fw-bold fs-2">
				<tr>
					<th>ID</th>
					<th>الوصف</th>
					<th>الرابط</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${pics}" var="pic">
					<tr>
						<td data-lable="id">${pic.id }</td>
						<td data-lable="desc">${pic.desc}</td>
						<td data-lable="url">${pic.url}</td>
						<td data-lable="delete"><a href="deletePicture/${pic.id }"
							class="btn btn-danger text-warning">Delete</a></td>
					</tr>

				</c:forEach>
			</tbody>
		</div>
	</table>
	<!-- end of pics table  -->


	<!-- pics form -->
	<div class="forms" dir="rtl">
		<form action="addPicture" class="one" method="post">
			<section>
				<label for="">الوصف</label> <input type="text" name="desc">
			</section>
			<section>
				<label for="">اللينك</label> <input type="text" name="url">
			</section>
			<section>
				<button class="btn btn-danger text-warning">اضافه</button>
			</section>
		</form>

	</div>
	<!-- end of pics form -->

	<!-- Start Of Video -->
<!-- 		VideoTable -->
<header>
		<h2>الفيديوهات</h2>
	</header>
	<table class="table table-dark table-striped" dir="rtl">
		<div class="container">
			<thead class="text-warning fw-bold fs-2">
				<tr>
					<th>ID</th>
					<th>الرابط</th>
					<th>التفاصيل</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${videos}" var="v">
					<tr>
						<td data-lable="id">${v.id }</td>
						<td data-lable="desc">${v.url}</td>
						<td data-lable="url">${v.detail}</td>
						<td data-lable="delete"><a href="deleteVideo/${v.id }"
							class="btn btn-danger text-warning">Delete</a></td>
					</tr>

				</c:forEach>
			</tbody>
		</div>
	</table>
	<!-- End Of Table -->
<!-- VideoForm -->
<div class="forms" dir="rtl">
		<form action="addVideo" class="one" method="post">
			<section>
				<label for="">اللينك</label> <input type="text" name="url">
			</section>
			<section>
				<label for="">الوصف</label> <input type="text" name="detail">
			</section>
			<section>
				<button class="btn btn-danger text-warning">اضافه</button>
			</section>
		</form>

	</div>


<!-- End OF Video Form -->
	<!-- End Of Video -->
	<!-- 	Detail -->
	<!-- 	DetailTable -->
	<header>
		<h2>التفاصيل</h2>
	</header>
	<table class="table table-dark table-striped" dir="rtl">
		<div class="container">
			<thead class="text-warning fw-bold fs-2">
				<tr>
					<th>ID</th>
					<th>الاسم</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${details}" var="detail">
					<tr>
						<td data-lable="id">${detail.id }</td>
						<td data-lable="الاسم">${detail.name}</td>
						<td data-lable="delete"><a href="deleteDetail/${detail.id}"
							class="btn btn-danger text-warning">Delete</a></td>
					</tr>

				</c:forEach>
			</tbody>
		</div>
	</table>

	<!-- 	end of detail table -->
	<!-- 	detail form for add -->
	<div class="forms" dir="rtl">
		<form action="addDetail" class="one" method="post">
			<section>
				<label for="">الاسم</label> <input type="text" name="name">
			</section>
			<section>
				<button class="btn btn-danger text-warning">اضافه</button>
			</section>
		</form>
		<!-- 	end of detail form for add  -->
		<br> <br>
		<!-- form for update detail -->
		<form action="updateDetail" class="two" method="post">
			<section>
				<label for="">ID</label> <input type="text" name="id">
			</section>
			<section>
				<label for="">الاسم</label> <input type="text" name="name">
			</section>
			<section>
				<button class="btn btn-danger text-warning">تعديل</button>
			</section>
		</form>
	</div>
	<!-- 	end of form for update detail -->
	<!-- 	end of detail	 -->
	<br>
	<br>


	<!-- 	Times -->
	<!-- 	TimesTable -->
	<header>
		<h2>المواعيد</h2>
	</header>
	<table class="table table-dark table-striped" dir="rtl">
		<div class="container">
			<thead class="text-warning fw-bold fs-2">
				<tr>
					<th>ID</th>
					<th>الاسم</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${times}" var="time">
					<tr>
						<td data-lable="id">${time.id }</td>
						<td data-lable="الاسم">${time.name}</td>
						<td data-lable="delete"><a href="deleteTime/${time.id }"
							class="btn btn-danger text-warning">Delete</a></td>
					</tr>

				</c:forEach>
			</tbody>
		</div>
	</table>

	<!-- 	end of time table -->
	<!-- 	time form for add -->
	<div class="forms" dir="rtl">
		<form action="addTime" class="one" method="post">
			<section>
				<label for="">الاسم</label> <input type="text" name="name">
			</section>
			<section>
				<button class="btn btn-danger text-warning">اضافه</button>
			</section>
		</form>
		<!-- 	end of time form for add  -->
		<br> <br>
		<!-- form for update time -->
		<form action="updateTime" class="two" method="post">
			<section>
				<label for="">ID</label> <input type="text" name="id">
			</section>
			<section>
				<label for="">الاسم</label> <input type="text" name="name">
			</section>
			<section>
				<button class="btn btn-danger text-warning">تعديل</button>
			</section>
		</form>
	</div>
	<!-- 	end of form for update time -->
	<!-- 	end of Time	 -->



	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
















	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
		integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
		integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
		crossorigin="anonymous"></script>
</body>
</html>
