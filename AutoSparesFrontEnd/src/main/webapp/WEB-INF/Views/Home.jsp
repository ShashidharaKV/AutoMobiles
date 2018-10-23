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
  
  <c:url value="/resources/images" var="img"/>
    <c:url value="/resources/css" var="css"/>
      <c:url value="/resources/js" var="js"/>
</head>
<body>

<nav class="navbar navbar-default">
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
<div class="container">
 
 
</div>

</body>
</html>
