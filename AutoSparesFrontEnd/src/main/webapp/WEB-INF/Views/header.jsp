<%@taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE HTML>
<html>
	<head>
	 <c:url value="/resources/images" var="img"/>
    <c:url value="/resources/css" var="css"/>
      <c:url value="/resources/js" var="js"/>
	
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>Spare Parts | Home :: </title>
		<link href="${css}/style.css" rel="stylesheet" type="text/css"  media="all" />
		<link href='//fonts.googleapis.com/css?family=Fauna+One' rel='stylesheet' type='text/css'>
		<link rel="stylesheet" href="${css}/responsiveslides.css">
		<script src="${js}/jquery.min.js"> </script>
		<script src="${js}/responsiveslides.min.js"></script>
		  <script>
		    // You can also use "$(window).load(function() {"
			    $(function () {
			
			      // Slideshow 1
			      $("#slider1").responsiveSlides({
			        maxwidth: 1600,
			        speed: 600
			      });
			});
		  </script>  
	</head>
	<body>
		<!---start-wrap--->
		<div class="wrap">
			<!---start-header--->
			<div class="header">
			<!---start-top-header--->
			<div class="top-header">
				<div class="top-header-left">
					<ul>
						<li class="active"><a href="<c:url value="/index"/>">Home</a></li>
						<li><a href="#">All Products</a></li>
						<li><a href="#">Delivery</a></li>
						<li><a href="#">Contact</a></li>
					</ul>
				</div>
				<div class="top-header-right">
				</div>
				<ul>
						<div class="clear"> </div>
					</ul>
			</div>
			<div class="clear"> </div>
			<div class="sub-header">
				<div class="logo">
					<a href="index.html"><img src="${img}/logo.png" title="logo" /></a>
				</div>
				<div class="sub-header-right">
					<ul>
					<c1:if test="${pageContext.request.userPrincipal.name==null}">
						<li><a href="<c:url value="/login"/>">Log-In</a></li>
						<li><a href="<c:url value="/User"/>">Sign-Up</a></li>
						  </c1:if>
						  <c1:if test="${pageContext.request.userPrincipal.name!=null}">
						<li><a href="#">Logout</a></li>
						</c1:if>
						<li><a href="<c:url value="/checkout"/>">CART: ${items} <img src="${img}/cart.png" title="cart" /></a></li>
					</ul>
					<input type="text"><input type="submit"  value="search" />
				</div>
				<div class="clear"> </div>
			</div>
			<div class="clear"> </div>
			<div class="top-nav">
				<ul>
				<c1:forEach items="${categories}" var="cat">
					<li><a href='<c:url value="/carbumpers"/>'>${cat.getCategoryname()}</a></li>
<%-- 					<li><a href='<c:url value="/carwheels"/>'">Car wheels</a></li> --%>
<%-- 					<li><a href='<c:url value="/carbumpers"/>'>car bumpers</a></li> --%>
<%-- 					<li><a href='<c:url value="/caradsystem"/>'>car audiosystem</a></li> --%>
<!-- 					<li><a href="truckbumpers.html">Truck bumpers</a></li> -->
			</c1:forEach>
					<c1:if test="${pageContext.request.userPrincipal.name!=null}">
					 <security:authorize access="hasRole('ROLE_ADMIN')">
					<li><a href='<c:url value="/category"/>'>Category</a></li>
					<li><a href='<c:url value="/Product"/>'>Product</a></li>
					<li><a href='<c:url value="/Supplier"/>'>Supplier</a></li>
					</security:authorize>
					</c1:if>
					<div class="clear"> </div>
				</ul>
			</div>
			<!---end-top-header--->
			<!---End-header--->
			</div>