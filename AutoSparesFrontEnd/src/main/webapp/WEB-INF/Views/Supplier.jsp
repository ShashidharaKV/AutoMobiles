<%@taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %><html>
<fieldset>
<legend><B><h1> Supplier Form </h1></B></legend>

<c:url value="/addSupplier" var="supp"/>
<form:form action="${supp}" method="post" commandName="supplier">
 
    Supplier ID:  </label>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="text" id="name" name="user_name" path="supplierID"/>
<br>
<br>

   Supplier Name: </label>
    &nbsp;<form:input type="TEXT" id="name" name="SUPPLIER NAME" path="Name"/>
  
<br>
<br>  

    Email-ID: </label>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="Email" id="mail" name="Email-ID" path="Email_ID"/>

<br>
<br>  

    Phone No: </label>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="text" id="number" name="Number" min="8" max="10" path="Phno"/>

<br>
<br>  

    Address: </label>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:textarea id="msg" name="user_message" path="Address"></form:textarea>
  
<br>
<br>

 <input type="SUBMIT" value="Add Supplier">
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="CANCEL">
</form:form>

</fieldset>

<table>
<tr>
<th>supplier id</th>
<th>supplier name</th>
<th>email_id </th>
<th>phno</th>
<th>address</th>
<th>Actions</th>
</tr>
<c1:forEach items="${Supplier}" var="sup">
<tr>
<td>${sup.getSupplierID()}</td>
<td>${sup.getSupplierName()}</td>
<td>${sup.getEmail_ID()}</td>
<td>${sup.getPhno()}</td>
<td>${sup.getAddress()}</td>
<td><a href="<c:url value="/editSupplier/${sup.getSupplierID()}"/>">Edit</a>/
<a href="<c:url value="/deletesupplier/${sup.getSupplierID()}"/>">Delete</a></td>
</tr>
</c1:forEach>
</table>
</html>
