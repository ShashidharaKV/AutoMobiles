<%@taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %><html>
<%@include file="header.jsp" %>

<div class="content">
					<div class="contact">
						<div class="section group">				
				
				
				<div class="col span_2_of_3">
				  <div class="contact-form">
				  	<h3>Supplier Form</h3>
					  <c:url value="/addSupplier" var="supp"/>
                         <form:form action="${supp}" method="post" commandName="supplier">
					    	<div>
						    	<span><label>Supplier Id:</label></span>
						    	<span><form:input type="text" id="name" name="user_name" path="supplierID"/></span>
						    </div>
						    <div>
						    	<span><label>Supplier Name:</label></span>
						    	<span><form:input type="TEXT" id="name" name="SUPPLIER NAME" path="Name"/></span>
						    </div>
						    <div>
						    	<span><label>Email-Id:</label></span>
						    	<span><form:input type="Text" id="mail" name="Email-ID" path="Email_ID"/></span>
						    </div>
						    <div>
						    	<span><label>Phone Number:</label></span>
						    	<span><form:input type="text" id="number" name="Number" path="Phno"/></span>
						    </div>
						    <div>
						    	<span><label>Address:</label></span>
						    	<span><form:textarea id="msg" name="user_message" path="Address"></form:textarea></span>
						    </div>
						   <div>
						   		<span><input type="submit" value="Add Supplier"></span>
								<span><input type="reset" value="Cancel"></span>
						  </div>
					    </form:form>
				    </div>
  				</div>	
 <style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
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
<th bgcolor="royalblue">Supplier Id</th>
<th bgcolor="royalblue">Supplier Name</th>
<th bgcolor="royalblue">Email_Id </th>
<th bgcolor="royalblue">Ph_No</th>
<th bgcolor="royalblue">Address</th>
<th bgcolor="royalblue">Actions</th>
</tr>
<c1:forEach items="${suppliers}" var="sup">
<tr>
<td>${sup.getSupplierID()}</td>
<td>${sup.getName()}</td>
<td>${sup.getEmail_ID()}</td>
<td>${sup.getPhno()}</td>
<td>${sup.getAddress()}</td>
<td><a href="<c:url value="/editSupplier/${sup.getSupplierID()}"/>">Edit</a>/
<a href="<c:url value="/deletesupplier/${sup.getSupplierID()}"/>">Delete</a></td>
</tr>
</c1:forEach>
</table>
</div>
			</div>
			
			<div class="clear"> </div>


<%@include file="footer.jsp" %>
</html>
