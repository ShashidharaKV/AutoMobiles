<%@taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="header.jsp" %>

<div>
</div>

<html>

<head>
<style>
table, th, td {
    border: 2px solid blue;
}
.button {
    background-color: #4CAF50; /* Green */
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    margin: 4px 2px;
    cursor: pointer;
}
</style>
</head>

<body>

<table style="width:100%">
<tr style="align:center">
<th align="center" >PRODUCT ID</th>
<th align="center"> NAME </th>
<th align="center">DESCRIPTION</th>
<th> PRICE </th>
</tr>
 
 <c1:forEach items="${cartItem}" var="car">
<tr style="align:center">
<td align="center">${car.getProduct().getProductID()}</td>
<td align="center">${car.getProduct().getName()}</td>
<td align="center">${car.getProduct().getDescription()}</td>
<td align="center">${car.getProduct().getPrice()}.Rs</td>
<td align="center"><button class="button button1"><a href="<c:url value="/Buy/${car.getProduct().getProductID()}/${car.getCartitem_Id()}"/>">Buy</a></button></td>
<td align="center"><button class="button button1"><a href="<c:url value="/Remove/${car.getCartitem_Id()}"/>">Remove</a></button></td>
</tr>
</c1:forEach> 

</div>
 
</table>
<button class="button button1"><a href="<c:url value="/Buyall"/>">Buy ALL</a></button>
<div></div>
<button class="button button1"><a href="<c:url value="/RemoveAll"/>">Remove ALL</a></button>

</body>

<%@include file="footer.jsp" %>
</html>
