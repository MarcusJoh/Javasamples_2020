<%@page import="mvc.LoginBean" %>


<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Scrolling Nav - Start Bootstrap Template</title>

<!-- Bootstrap core CSS -->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="css/scrolling-nav.css" rel="stylesheet">

</head>
<body id="page-top">

	<!-- Navigation -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top"
		id="mainNav">
		<div class="container">
			<a class="navbar-brand js-scroll-trigger" href="#page-top">Start
				Bootstrap</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarResponsive" aria-controls="navbarResponsive"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item"><a class="nav-link js-scroll-trigger"
						href="#about">about</a></li>
					<li class="nav-item"><a class="nav-link js-scroll-trigger"
						href="#services">services</a></li>
					<li class="nav-item"><a class="nav-link js-scroll-trigger"
						href="#contact">contact</a></li>
				</ul>
			</div>
		</div>
	</nav>


	<header class="bg-primary text-white">
		<div class="container text-center">
			<h1>Welcome to Scrolling Nav</h1>
			<p class="lead">A landing page template freshly redesigned for
				Bootstrap 4</p>
		</div>
	</header>


	<section id="about">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 mx-auto">
					

				<h2>You are logged in</h2>


<% 

LoginBean bean = (LoginBean)request.getAttribute("bean");

out.print("Welcome"+ bean.getName());


%>


				</div>
			</div>
		</div>
	</section>




