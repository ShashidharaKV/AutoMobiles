<%@taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="header.jsp" %>
<html>
	<div class="content">
					<div class="contact">
						<div class="section group">				
				
				
				<div class="col span_2_of_3">
				  <div class="contact-form">
				  	<h3>Category Form</h3>
					   <c:url value="/addcategory" var="cat"/>
						<form:form action="${cat}" method="post" commandName="category">
					    	<div>
						    	<span><label>Category ID:</label></span>
						    	<span><form:input type="text" value="" path="CategoryID"/></span>
						    </div>
						    <div>
						    	<span><label>Category Name:</label></span>
						    	<span><form:input type="text" value="" path="Categoryname"/></span>
						    </div>
						   
						   <div>
						   		<span><input type="submit" value="Add Category"></span>
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
				<th bgcolor="royalblue">Category Id</th>
				<th bgcolor="royalblue">Category Name</th>
				<th bgcolor="royalblue">Actions</th>
				</tr>
				<c1:forEach items="${categories}" var="cat">
				<tr>
				<td>${cat.getCategoryID()}</td>
				<td>${cat.getCategoryname()}</td>
				<td><a href="<c:url value="/editcategory/${cat.getCategoryID()}"/>">Edit</a>/
				<a href="<c:url value="/deletecategory/${cat.getCategoryID()}"/>">Delete</a></td>
				</tr>
				</c1:forEach>
				</table>
			  
					</div>
			</div>
			
			<div class="clear"> </div>


<%@include file="footer.jsp" %>
</html>
