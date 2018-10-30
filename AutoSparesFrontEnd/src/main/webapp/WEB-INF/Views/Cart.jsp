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
<th align="center">QUANTITY</th>
<th> PRICE </th>
</tr>
 
<tr style="align:center">
<td align="center">100</td>
<td align="center">Gears</td>
<td align="center">Honda Spares</td>
<td align="center">2</td>
<td align="center">2000.Rs</td>
<td align="center"><button class="button button1">Buy</button></td>
<td align="center"><button class="button button1">Remove</button></td>
</tr>
 
<tr style="align:center">
<td align="center">101</td>
<td align="center">Clutch</td>
<td align="center">Mahendra Mojo Spare</td>
<td align="center">2</td>
<td align="center">3080.Rs</td>
<td align="center";style= "border-collapse: collapse"><button class="button button1">Buy</button></td>
<td align="center";style= "border-collapse: collapse"><button class="button button1">Remove</button></td>
<tr>
</div>
 
</table>
<button class="button button1">Buy ALL</button>
<div></div>
<button class="button button1">Remove ALL</button>

</body>

<%@include file="footer.jsp" %>
</html>
