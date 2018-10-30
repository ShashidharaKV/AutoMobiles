<%@taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=2">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
   
      <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
   
<!--    <title>dgdfg</title> -->
<!-- <!-- Latest compiled and minified CSS -->
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"> -->

<!-- <!-- jQuery library --> 
<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/4.0.0/jquery.min.js"></script> -->

<!-- <!-- Latest compiled JavaScript -->
<!-- <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script> -->
<!-- </script> -->
<!-- <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"> -->
<!-- </script> -->
<!-- <!------ Include the above in your HEAD tag ---------->
<link href="${css}style.css" rel="stylesheet" type="text/css">
  
  <c:url value="/resources/images" var="img"/>
    <c:url value="/resources/css" var="css"/>
      <c:url value="/resources/js" var="js"/>
      
      <style>
       body
      {
      background-image:url('${img}/Abstract-Background-HD-Wallpaper-14095.jpg');
     background-size: cover;
      }   
      
     
      </style>
      
  
</head>
<body>

<nav class="navbar navbar-Blue">
  <div class="container-fluid">
    <div class="navbar-header">
      <img src="${img}/logo1.png" alt="Auto Spares" width="100px" height="55px">
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <c1:if test="${pageContext.request.userPrincipal.name!=null}">
      Welcome!!!
      ${pageContext.request.userPrincipal.name }
      </c1:if>
       <c1:if test="${pageContext.request.userPrincipal.name!=null }">
          <security:authorize access="hasRole)('ROLE_ADMIN')">
      <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Admin<span class="caret"></span></a>
          <ul class="dropdown-menu">
         
            <li><a href='<c:url value="/category"/>'>CATEGORY</a></li>
            <li><a href='<c:url value="/Product"/>'>PRODUCT</a></li>
            <li><a href='<c:url value="/Supplier"/>'>SUPPLIER</a></li>
            
             </ul>
             </security:authorize>
          </c1:if>
            <li><a href='<c:url value="/User"/>'>Registration</a></li>
         
          <c1:if test="${pageContext.request.userPrincipal.name==null }">
            <li><a href='<c:url value="/LogIn"/>'>LOG-IN</a></li>
            </c1:if>
        </li>
       <c1:if test="${pageContext.request.userPrincipal.name!=null }"></c1:if>
                    <li> <a href="<c:url value="/LOG-OUT"/>"></a></li>
    
    </ul>

    <form class="navbar-form nav-right" style="float:right">
            	<div class="input-group">
                    <input type="text" class="form-control" placeholder="Search">
                    <span class="input-group-btn">
                        <button type="button" class="btn btn-primary"><span class="glyphicon glyphicon-search"></span></button>
                    </span>
                </div>
                </form>
              </div>
              </nav>  
<!-- <div class="container"> -->
 
 
<!-- </div> -->

<div class="container"> 
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
  
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
        <img src="${img}/773000-gorgerous-liberty-walk-wallpapers-1920x1200.jpg" alt="Los Angeles" style="width:100%;">
      </div>

      <div class="item">
        <img src="${img}/773004-beautiful-liberty-walk-wallpapers-1920x1280-for-android.jpg" alt="Chicago" style="width:100%;">
      </div>
    
      <div class="item">
        <img src="${img}/773019-widescreen-liberty-walk-wallpapers-1920x1200.jpg" alt="New york" style="width:100%;">
      </div>
       <div class="item">
        <img src="${img}/773114-top-liberty-walk-wallpapers-1920x1282.jpg" alt="Chicago" style="width:100%;">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
</div>
</nav>


<!-- Footer -->


<section id="footer">

<div class="container">
	
<div class="row text-center text-xs-center text-sm-left text-md-left">
<div class="col-xs-12 col-sm-4 col-md-4">
<h5>Quick links</h5>
<ul class="list-unstyled quick-links">
<li><a href="javascript:void();"><i class="fa fa-angle-double-right"></i>Home</a></li>
<li><a href="javascript:void();"><i class="fa fa-angle-double-right"></i>About</a></li>
<li><a href="javascript:void();"><i class="fa fa-angle-double-right"></i>FAQ</a></li>
<li><a href="javascript:void();"><i class="fa fa-angle-double-right"></i>Get Started</a></li>
<li><a href="javascript:void();"><i class="fa fa-angle-double-right"></i>Videos</a></li>
</ul>
</div>
<div class="col-xs-12 col-sm-4 col-md-4">
<h5>Quick links</h5>
<ul class="list-unstyled quick-links">
<li><a href="javascript:void();"><i class="fa fa-angle-double-right"></i>Home</a></li>
<li><a href="javascript:void();"><i class="fa fa-angle-double-right"></i>About</a></li>
<li><a href="javascript:void();"><i class="fa fa-angle-double-right"></i>FAQ</a></li>
<li><a href="javascript:void();"><i class="fa fa-angle-double-right"></i>Get Started</a></li>
<li><a href="javascript:void();"><i class="fa fa-angle-double-right"></i>Videos</a></li>
</ul>
</div>
<div class="col-xs-12 col-sm-4 col-md-4">
<h5>Quick links</h5>
<ul class="list-unstyled quick-links">
<li><a href="javascript:void();"><i class="fa fa-angle-double-right"></i>Home</a></li>
<li><a href="javascript:void();"><i class="fa fa-angle-double-right"></i>About</a></li>
<li><a href="javascript:void();"><i class="fa fa-angle-double-right"></i>FAQ</a></li>
<li><a href="javascript:void();"><i class="fa fa-angle-double-right"></i>Get Started</a></li>
<li><a href="https://wwwe.sunlimetech.com" title="Design and developed by"><i class="fa fa-angle-double-right"></i>Imprint</a></li>
</ul>
</div>
</div>
<div class="row">
<div class="col-xs-12 col-sm-12 col-md-12 mt-2 mt-sm-5">
<ul class="list-unstyled list-inline social text-center">
<li class="list-inline-item"><a href="javascript:void();"><i class="fa fa-facebook"></i></a></li>
						<li class="list-inline-item"><a href="javascript:void();"><i class="fa fa-twitter"></i></a></li>
						<li class="list-inline-item"><a href="javascript:void();"><i class="fa fa-instagram"></i></a></li>
						<li class="list-inline-item"><a href="javascript:void();"><i class="fa fa-google-plus"></i></a></li>
						<li class="list-inline-item"><a href="javascript:void();" target="_blank"><i class="fa fa-envelope"></i></a></li>
					</ul>
				</div>
				</hr>
			</div>	
			<div class="row">
				<div class="col-xs-12 col-sm-12 col-md-12 mt-2 mt-sm-2 text-center text-white">
					<p><u><a href="https://www.nationaltransaction.com/">National Transaction Corporation</a></u> is a Registered MSP/ISO of Elavon, Inc. Georgia [a wholly owned subsidiary of U.S. Bancorp, Minneapolis, MN]</p>
					<p class="h6">&copy All right Reversed.<a class="text-green ml-2" href="https://www.sunlimetech.com" target="_blank">Sunlimetech</a></p>
</div>				
</hr>
</div>	
</div>
</section>
<!-- ./Footer -->
/body>
</html>
