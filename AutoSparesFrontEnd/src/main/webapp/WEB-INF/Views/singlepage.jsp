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
				<div class="content">
					<div class="single-page"><br />
						<div class="single-top-pagination">
							<ul>
								<li><a href="index.html">Home /</a></li>
								<li><span>Productname</span></li>
							</ul>
						</div>
						<div class="clear"> </div>
						<div class="product-info">
							<div class="product-image">
								<div class="flexslider">
							        <!-- FlexSlider -->
										<script src="${js}/imagezoom.js"></script>
										  <script defer src="${js}/jquery.flexslider.js"></script>
										<link rel="stylesheet" href="${css}/flexslider.css" type="text/css" media="screen" />

										<script>
										// Can also be used with $(document).ready()
										$(window).load(function() {
										  $('.flexslider').flexslider({
											animation: "slide",
											controlNav: "thumbnails"
										  });
										});
										</script>
									<!-- //FlexSlider-->

							  <ul class="slides">
								<li data-thumb="${img}/${pro.getProductID()}.jpg">
									<div class="thumb-image"> <img src="${img}/${pro.getProductID()}.jpg" data-imagezoom="true" class="img-responsive"> </div>
								</li>
<%-- 								<li data-thumb="${img}/triumph_thumb1.jpg"> --%>
<%-- 									 <div class="thumb-image"> <img src="${img}/triumph_thumb1.jpg" data-imagezoom="true" class="img-responsive"> </div> --%>
<!-- 								</li> -->
<%-- 								<li data-thumb="${img}/triumph_thumb2.jpg"> --%>
<%-- 								   <div class="thumb-image"> <img src="${img}/triumph_thumb2.jpg" data-imagezoom="true" class="img-responsive"> </div> --%>
<!-- 								</li> -->
<%-- 								<li data-thumb="${img}/triumph_thumb3.jpg"> --%>
<%-- 								   <div class="thumb-image"> <img src="${img}/triumph_thumb3.jpg" data-imagezoom="true" class="img-responsive"> </div> --%>
<!-- 								</li> -->
							  </ul>
							<div class="clear"></div>
						</div>
							</div>
							<div class="product-price-info">
								<div class="product-catrgory-pagenation">
									<ul>
										<li><h3>Categories :</h3></li>
										<li class="active3"><a href="#">Productname</a></li>
										<li><a href="#">Product2</a></li>
										<li><a href="#">Product3</a></li>
									</ul>
								</div>
									<div class="product-value">
									<h4>${pro.getName()}</h4>
									<ul>
										<li><h2>Price :</h2></li>
										<li><span>30500 Rs</span></li>
										<li><h5>${pro.getPrice()}</h5></li>
										<li><a href="#">Instock</a></li>
									</ul>
									<ul>
										<li><h3>Not rated</h3></li>
										<li><h5>No reviews</h5></li>
									</ul>
								</div>
								<div class="product-shipping">
									<span>Shipping :</span>
									<p><lable>FREE</lable> - Flat Rate Courier - Delivery anywhere in </p>
									<div class="clear"> </div>
								</div>
								<div class="product-payments">
									<span>Payments: :</span>
									<p><lable>paypal</lable> - (Credit card, EMI, Debit card, Online Bank Transfer), PaisaPay COD  </p>
									<div class="clear"> </div>
								</div>
								<div class="product-description">
									<h3>${pro.getDescription()} </h3>
									<a href="<c:url value="/addtocart/${pro.getProductID()}"/>">Addcart</a>
								</div>
								<div class="product-share">
									<h3>share on:</h3>
									<ul>
										<li><a href="#"><img src="${img}/facebook.png" title="facebook" />Facebook</a></li>
										<li><a href="#"><img src="${img}/twitter.png" title="Twitter" />Twitter</a></li>
										<li><a href="#"><img src="${img}/rss.png" title="Rss" />Rss</a></li>
										<li><a href="#"><img src="${img}/gpluse.png" title="Googlepluse" />Google+</a></li>
									</ul>
								</div>
							</div>
							<div class="clear"> </div>
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

