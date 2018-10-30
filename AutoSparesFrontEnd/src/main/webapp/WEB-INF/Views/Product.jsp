<%@taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="header.jsp" %>
<html>
<head>
 <c:url value="/resources/images" var="img"/>
    <c:url value="/resources/css" var="css"/>
      <c:url value="/resources/js" var="js"/>
</head>
<div class="content">
					<div class="contact">
						<div class="section group">				
				
				
				<div class="col span_2_of_3">
				  <div class="contact-form">
				  	<h3>Product Form</h3>
					   <c:url value="/addproduct" var="prod"/>
                 <form:form action="${prod}" method="post" commandName="product" enctype="multipart/form-data">
					    	<div>
						    	<span><label>Product ID:</label></span>
						    	<span><form:input type="text" value="" path="ProductID"/></span>
						    </div>
						    <div>
						    	<span><label>Product Name:</label></span>
						    	<span><form:input type="text" value="" path="Name"/></span>
						    </div>
						   <div>
						    	<span><label>Price:</label></span>
						    	<span><form:input type="text" value="" path="Price"/></span>
						   <div>
						    <div>
						    	<span><label>Quantity:</label></span>
						    	<span><form:input type="text" value="" path="Qty"/></span>
						    	<div>
						    	<div>
						    	<span><label>Description:</label></span>
						    	<span><form:input type="text" value="" path="Description"/></span>
						    <div>
						    </div>
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
						     <div></div>
						   		<span><input type="submit" value="Add Product"></span>
								<span><input type="reset" value="Cancel"></span>
						  </div>
					    </form:form>
				    </div>
  				</div>			
			  </div>
			   <style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 150%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>
			  <table>
<tr>
<th bgcolor="royalblue">Images</th>
<th bgcolor="royalblue">Product Id</th>
<th bgcolor="royalblue">Product name</th>
<th bgcolor="royalblue">Price </th>
<th bgcolor="royalblue">Quantity</th>
<th bgcolor="royalblue">Description</th>
<th bgcolor="royalblue">Actions</th>
</tr>
<c1:forEach items="${products}" var="pro">
<tr>
<td><img src="${img}/${pro.getProductID()}.jpg"></td>
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
</div>
			</div>
			
			<div class="clear"> </div>



<%@include file="footer.jsp" %>
</html>
