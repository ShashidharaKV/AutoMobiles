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
					<a href="index.html"><img src="${img}/${pro.getProductID()}.jpg" width="250px" height="250px" title="logo" /></a>
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
			
				<!--start-image-slider---->
					<div class="image-slider">
						<!-- Slideshow 1 -->
					    <ul class="rslides" id="slider1">
					      <li><img src="${img}/slider1.jpg" alt=""></li>
					      <li><img src="${img}/slider3.jpg" alt=""></li>
					      <li><img src="${img}/slider1.jpg" alt=""></li>
					    </ul>
						 <!-- Slideshow 2 -->
					</div>
					<!--End-image-slider---->
				<div class="content">
					<div class="products-box">
					<div class="products">
						<h5><span>FEATURED</span> PRODUCTS</h5>
						<div class="section group">
							<div class="grid_1_of_5 images_1_of_5">
								 <img src="${img}/g3.png">
								 <h3>Lorem Ipsum is simply </h3>
								 <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, in reprehenderit.</p>
								 <h4>5012.00 Rs</h4>
							     <div class="button"><span><a href="singlepage.html">Read More</a></span></div>
						   </div>
							<div class="grid_1_of_5 images_1_of_5">
								 <img src="${img}/g1.jpg">
								 <h3>Lorem Ipsum is simply </h3>
								<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, in reprehenderit.</p>
								<h4>3500.00 Rs</h4>
							     <div class="button"><span><a href="singlepage.html">Read More</a></span></div>
						    </div>
							<div class="grid_1_of_5 images_1_of_5">
								<img src="${img}/g2.jpg">
								 <h3>Lorem Ipsum is simply </h3>
								 <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, in reprehenderit.</p>
								 <h4>1220.00 Rs</h4>
							     <div class="button"><span><a href="singlepage.html">Read More</a></span></div>
							</div>
							<div class="grid_1_of_5 images_1_of_5">
								 <img src="${img}/g3.png">
								 <h3>Lorem Ipsum is simply </h3>
								 <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, in reprehenderit.</p>
								 <h4>5060.00 Rs</h4>
							     <div class="button"><span><a href="singlepage.html">Read More</a></span></div>
							</div>
							<div class="grid_1_of_5 images_1_of_5">
								 <img src="${img}/g4.jpg">
								 <h3>Lorem Ipsum is simply</h3>
								 <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, in reprehenderit.</p>
								 <h4>3120.00 Rs</h4>
							     <div class="button"><span><a href="singlepage.html">Read More</a></span></div>
							</div>
						</div>
					</div>
					<div class="products products-secondbox">
						<h5><span>Our</span> Specials</h5>
						<div class="section group">
							<div class="grid_1_of_5 images_1_of_5">
								 <img src="${img}/g1.jpg">
								 <h3>Lorem Ipsum is simply </h3>
								 <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, in reprehenderit.</p>
								 <h4><span>6600.00 Rs</span>5120.00 Rs</h4>
							     <div class="button"><span><a href="singlepage.html">Read More</a></span></div>
						   </div>
							<div class="grid_1_of_5 images_1_of_5">
								 <img src="${img}/g6.jpg">
								 <h3>Lorem Ipsum is simply </h3>
								<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, in reprehenderit.</p>
								 <h4><span>4600.00 Rs</span>3520.00 Rs</h4>
							     <div class="button"><span><a href="singlepage.html">Read More</a></span></div>
						    </div>
							<div class="grid_1_of_5 images_1_of_5">
								<img src="${img}/g7.png">
								 <h3>Lorem Ipsum is simply </h3>
								 <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, in reprehenderit.</p>
								  <h4><span>3800.00 Rs</span>2802.00 Rs</h4>
							     <div class="button"><span><a href="singlepage.html">Read More</a></span></div>
							</div>
							<div class="grid_1_of_5 images_1_of_5">
								 <img src="${img}/g8.png">
								 <h3>Lorem Ipsum is simply </h3>
								 <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, in reprehenderit.</p>
								 <h4><span>4900.00 Rs</span>3922.00 Rs</h4>
							     <div class="button"><span><a href="singlepage.html">Read More</a></span></div>
							</div>
							<div class="grid_1_of_5 images_1_of_5">
								 <img src="${img}/g1.jpg">
								 <h3>Lorem Ipsum is simply</h3>
								 <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, in reprehenderit.</p>
								 <h4><span>7050.00 Rs</span>6502.00 Rs</h4>
							     <div class="button"><span><a href="singlepage.html">Read More</a></span></div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="clear"> </div>
			<div class="footer">
				<div class="section group">
				<div class="col_1_of_4 span_1_of_4">
					<h3>INFORMATION</h3>
					<ul>
						<li><a href="#">About us</a></li>
						<li><a href="#">Sitemap</a></li>
						<li><a href="#">Contact</a></li>
						<li><a href="#">Terms and conditions</a></li>
						<li><a href="#">Legal Notice</a></li>
					</ul>
				</div>
				<div class="col_1_of_4 span_1_of_4">
					<h3>OUR OFFERS</h3>
					<ul>
						<li><a href="#">New products</a></li>
						<li><a href="#">top sellers</a></li>
						<li><a href="#">Specials</a></li>
						<li><a href="#">Products</a></li>
						<li><a href="#">Comments</a></li>
					</ul>
				</div>
				<div class="col_1_of_4 span_1_of_4">
					<h3>YOUR ACCOUNT</h3>
					<ul>
						<li><a href="#">Your Account</a></li>
						<li><a href="#">Personal info</a></li>
						<li><a href="#">Prices</a></li>
						<li><a href="#">Address</a></li>
						<li><a href="#">Locations</a></li>
					</ul>
				</div>
				<div class="col_1_of_4 span_1_of_4 footer-lastgrid">
					<h3>Get in touch</h3>
					<ul>
						<li><a href="#"><img src="${img}/facebook.png" title="facebook" /></a></li>
						<li><a href="#"><img src="${img}/twitter.png" title="Twiiter" /></a></li>
						<li><a href="#"><img src="${img}/rss.png" title="Rss" /></a></li>
						<li><a href="#"><img src="${img}/gpluse.png" title="Google+" /></a></li>
					</ul>
					<p>&copy 2018 Spare Parts . All Rights Reserved </p>
				</div>
			</div>
			</div>
		</div>
		<!---End-wrap--->
	</body>
</html>

