<%@taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<fieldset>
<legend><I><h1> Product Form </h1></I></legend>

<c:url value="/addproduct" var="prod"/>
<form:form action="${prod}" method="post" commandName="product" enctype="multipart/form-data">

  Product ID :
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="text" name="101" Placeholder=" CD124F" path="ProductID"/>
  
  <br><br>
  
  Product Name :
  &nbsp;&nbsp;&nbsp;<form:input type="text" name="username" Placeholder="Apple" path="Name"/>

<br><br>
  
  Price :
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="number" name="number" Placeholder="20/-" path="Price"/>


<br><br>
  
  Quantity :
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="number" name="number" Placeholder="2" path="Qty"/>


<br><br>
  
  Description :
  &nbsp;&nbsp;&nbsp;&nbsp;<form:input type="Text" name="Text" Placeholder="Himalayan Product " path="Description"/>

  <br><br><br>
  
  <Label>Categories:</Label>
<form:select path= "category.CategoryID">
<c1:forEach items="${categories}" var="cat">
<option value="${cat.getCategoryID()}"> ${cat.getCategoryname()}</option>
</c1:forEach>
</form:select>
  <Label>Suppliers:</Label>
<form:select path= "supplier.supplierID">
<c1:forEach items="${suppliers}" var="sup">
<option value="${sup.getSupplierID() }"> ${sup.getName()}</option>
</c1:forEach>
</form:select>
<form:input type="file" value="uploadfile" path="pimg"/>



  <input type="SUBMIT" value="ADD PRODUCT">
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="CANCEL">
  
</form:form>

</fieldset>
<table>
<tr>
<th>product id</th>
<th>product name</th>
<th>price </th>
<th>quantity</th>
<th>description</th>
<th>Actions</th>
</tr>
<c1:forEach items="${products}" var="pro">
<tr>
<td>${pro.getProductID()}</td>
<td>${pro.getName()}</td>
<td>${pro.getPrice()}</td>
<td>${pro.getQty()}</td>
<td>${pro.getDescription()}</td>
<td><a href="<c:url value="/editProduct/${pro.getProductID()}"/>">Edit</a>/
<a href="<c:url value="/deleteproduct/${pro.getProductID()}"/>">Delete</a></td>
</tr>
</c1:forEach>
</table>
</html>
