<%@taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="header.jsp" %>

<!DOCTYPE html>
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
<th align="center">PRICE</th>
<th align="center">QUANTITY</th>
</tr>


 <c1:if test="${prot!=null}">
      <tr>
        <td style="border: 1px solid black"><img src="<c:url value='/resources/images/${prot.getProductID()}.jpg'/>" width="150px" height="200px"></td>
        <td style="border: 1px solid black">${prot.getName()}</td>
<%--         <td>${prot.getDes()}</td>  --%>
        <td style="border: 1px solid black">${prot.getCategory().getCategoryname()}</td>
        <td style="border: 1px solid black">${prot.getSupplier().getName()}</td>
        <td style="border: 1px solid black">${prot.getPrice()}</td>
       </tr> 
      </c1:if>
    <c1:if test="${prot==null}">
     <c1:forEach items="${cartItems}" var="c1">
      <tr>
        <td style="border: 1px solid black"><img src="<c:url value='/resources/images/${c1.getProduct().getProductID()}.jpg'/>"></td>
        <td style="border: 1px solid black">${c1.getProduct().getName()}</td>
<%--         <td>${c1.getproduct.getDes()}</td> --%>
        <td style="border: 1px solid black">${c1.getProduct().getCategory().getCategoryname()}</td>
        <td style="border: 1px solid black">${c1.getProduct().getSupplier().getName()}</td>
        <td style="border: 1px solid black">${c1.getProduct().getPrice()}</td>
      </tr>
      </c1:forEach>
      </c1:if>
   

<!-- <tr style="align:center"> -->
<%-- <th align="center" >${prot.getProductID()}</th> --%>
<%-- <th align="center"> ${prot.getName()} </th> --%>
<%-- <th align="center">${prot.getPrice()} .Rs</th> --%>
<%-- <th align="center">${prot.getQty()}</th> --%>
<!-- </tr> -->
</div>
 
 <br>
<br>
 <table style="width:100%">
<tr style="align:center">
<th align="center" >BILLING ID</th>
<th align="center"> NAME </th>
<th align="center">ADDRESS</th>
<th align="center">PHONE NO</th>
</tr>

<tr style="align:center">
<th align="center" >${billing.getBilling_Id()}</th>
<th align="center"> ${billing.getBilling_Name()} </th>
<th align="center">${billing.getBilling_Address()}</th>
<th align="center">${billing.getBilling_Phoneno()}</th>
</tr>
<br>
</table>
<br>

<table style="width:100%">
<tr style="align:center">
<th align="center" >SHIP ID</th>
<th align="center"> NAME </th>
<th align="center">ADDRESS</th>
<th align="center">PHONE NO</th>
</tr>

<tr style="align:center">
<th align="center" >${shippingAddress.getShipId()}</th>
<th align="center"> ${shippingAddress.getUser().getName()}</th>
<th align="center">${shippingAddress.getAddress()}</th>
<th align="center">${shippingAddress.getPhone()}</th>
</tr>
<%--     <c1:if test="${prot==null}"> --%>
<%--      <c1:forEach items="${cartItems}" var="c1"> --%>
<!--       <tr> -->
<!--         <td style="border: 1px solid black"><img src=""></td> -->
<%--         <td style="border: 1px solid black">${c1.getProduct().getName()}</td> --%>
<%-- <%--         <td>${c1.getproduct.getDes()}</td> --%> 
<%--         <td style="border: 1px solid black">${c1.getProduct().getCategory().getCategoryname()}</td> --%>
<%--         <td style="border: 1px solid black">${c1.getProduct().getSupplier().getName()}</td> --%>
<%--         <td style="border: 1px solid black">${c1.getProduct().getPrice()}</td> --%>
<!--       </tr> -->
<%--       </c1:forEach> --%>
<%--       </c1:if> --%>
</table>
<button class="button button1" ><a href="<c:url value="/pay"/>">PAY</button>
<div></div>
<button class="button button1" ></button><a href="<c:url value=""/>">CANCEL</a></button>

</body>
<%@include file="footer.jsp" %>
</html> 
