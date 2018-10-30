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
		<title>Spare Parts </title>
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
						<li class="active"><a href="#">Home</a></li>
						<li><a href="#">AboutUs</a></li>
						<li><a href="#">Contact</a></li>
					</ul>
				</div>
				<div class="top-header-right">
					<ul>
						<div class="clear"> </div>
					</ul>
				</div>
			</div>
			<div class="clear"> </div>
			<div class="sub-header">
				<div class="logo">
					<a href="index.html"><img src="${img}/logo.png" title="logo" /></a>
				</div>
				<div class="sub-header-right">
					<ul>
					<c1:if test="${pageContext.request.userPrincipal.name==null }">
						<li><a href='<c:url value="/login"/>'>LOG-IN</a>>Log-In</a></li>
						<li><a href='<c:url value="/User"/>'>Sign-Up</a></li>
						 </c1:if>
						  <c1:if test="${pageContext.request.userPrincipal.name!=null }">
						<li><a href="#">Logout</a></li>
						</c1:if>
						<li><a href="#">CART: (EMPTY) <img src="${img}/cart.png" title="cart" /></a></li>
					</ul>
					<input type="text"><input type="submit"  value="search" />
				</div>
				<div class="clear"> </div>
			</div>
			<div class="clear"> </div>
			<div class="top-nav">
				<ul>
					<li><a href="carlights.html">car lights</a></li>
					<li><a href="carwheels.html">Car wheels</a></li>
					<li><a href="carbumpers.html">car bumpers</a></li>
					<li><a href="caradsystem.html">car audiosystem</a></li>
					<li><a href="truckbumpers.html">Truck bumpers</a></li>
					<c1:if test="${pageContext.request.userPrincipal.name!=null}">
					 <security:authorize access="hasRole)('ROLE_ADMIN')">
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
			
				<div class="content">
					<!--start-cartires-page---->
					<div class="Cartires">
						<h5><span>Car</span> Audiosystem</h5>
						<div class="car-tires-top-pagnation">
							<ul>
								<li><a href="index.html">Home /</a></li>
								<li><span>Caraudio system</span></li>
							</ul>
						</div>
						<div class="cartires-grids">
							<div class="cartire-grid">
								<div class="cartire-grid-img">
									<img src="images/a1.jpg" title="tries" />
								</div>
								<div class="cartire-grid-info">
									<ul>
										<li><span>New</span> |&nbsp;&nbsp;Available !</li>
									</ul>
									<h3>Fondmetal 7500</h3>
									<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.</p>
								</div>
								<div class="cartire-grid-cartinfo">
									<h4>REDUCED PRICE!</h4>
									<span>5052.00 Rs</span>
									<ul>
										<li><input type="checkbox"></li>
										<li><p>Select to compare</p></li>
									</ul>
									<a href="singlepage.html">Add to Cart</a><br />
									<a href="singlepage.html">View</a>
								</div>
								<div class="clear"> </div>
							</div><br />
							<div class="cartire-grid">
								<div class="cartire-grid-img">
									<img src="images/a2.jpg" title="tries" />
								</div>
								<div class="cartire-grid-info">
									<ul>
										<li><span>New</span> |&nbsp;&nbsp;Available !</li>
									</ul>
									<h3>Fondmetal 7500</h3>
									<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.</p>
								</div>
								<div class="cartire-grid-cartinfo">
									<h4>REDUCED PRICE!</h4>
									<span>5502.00 Rs</span>
									<ul>
										<li><input type="checkbox"></li>
										<li><p>Select to compare</p></li>
									</ul>
									<a href="singlepage.html">Add to Cart</a><br />
									<a href="singlepage.html">View</a>
								</div>
								<div class="clear"> </div>
							</div><br />
							<div class="cartire-grid">
								<div class="cartire-grid-img">
									<img src="images/a3.jpg" title="tries" />
								</div>
								<div class="cartire-grid-info">
									<ul>
										<li><span>New</span> |&nbsp;&nbsp;Available !</li>
									</ul>
									<h3>Fondmetal 7500</h3>
									<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.</p>
								</div>
								<div class="cartire-grid-cartinfo">
									<h4>REDUCED PRICE!</h4>
									<span>5502.00 Rs</span>
									<ul>
										<li><input type="checkbox"></li>
										<li><p>Select to compare</p></li>
									</ul>
									<a href="singlepage.html">Add to Cart</a><br />
									<a href="singlepage.html">View</a>
								</div>
								<div class="clear"> </div>
							</div><br />
							<div class="cartire-grid">
								<div class="cartire-grid-img">
									<img src="images/g6.jpg" title="tries" />
								</div>
								<div class="cartire-grid-info">
									<ul>
										<li><span>New</span> |&nbsp;&nbsp;Available !</li>
									</ul>
									<h3>Fondmetal 7500</h3>
									<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.</p>
								</div>
								<div class="cartire-grid-cartinfo">
									<h4>REDUCED PRICE!</h4>
									<span>5802.00 Rs</span>
									<ul>
										<li><input type="checkbox"></li>
										<li><p>Select to compare</p></li>
									</ul>
									<a href="singlepage.html">Add to Cart</a><br />
									<a href="singlepage.html">View</a>
								</div>
								<div class="clear"> </div>
							</div><br />
						</div>
					</div>
					<!--End-cartires-page---->
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
						<li><a href="#"><img src="images/facebook.png" title="facebook" /></a></li>
						<li><a href="#"><img src="images/twitter.png" title="Twiiter" /></a></li>
						<li><a href="#"><img src="images/rss.png" title="Rss" /></a></li>
						<li><a href="#"><img src="images/gpluse.png" title="Google+" /></a></li>
					</ul>
					<p>&copy 2012 Spare Parts . All Rights Reserved </p>
				</div>
			</div>
			</div>
		</div>
		<!---End-wrap--->
	</body>
</html>

