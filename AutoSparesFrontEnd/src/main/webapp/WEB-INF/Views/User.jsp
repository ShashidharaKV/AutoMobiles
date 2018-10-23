<%@taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<fieldset>
<legend><I><h1> REGISTRATION FORM </h1></I></legend>

<c:url value="/addUser" var="user"/>
<form:form action=" ${user}" method="post" commandName="user">   
    USER ID :  </label>
    &nbsp &nbsp &nbsp&nbsp&nbsp<form:input type="text" id="name" name="user_name" path="UserID"/>
<br>
<br>

    Name : </label>
    &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp<form:input type="TEXT" id="name" name="User NAME" path="Name" />
  
<br>
<br>  

    Email-ID: </label>
    &nbsp &nbsp&nbsp&nbsp &nbsp&nbsp<form:input type="Email" id="mail" name="Email-ID" path="Email_ID"/>

<br>
<br>  

    Phone No: </label>
    &nbsp &nbsp&nbsp&nbsp &nbsp<form:input type="text" id="number" name="Number" path="PhNo" />

<br>
<br>  

    Address: </label>
    &nbsp &nbsp&nbsp &nbsp &nbsp &nbsp<form:textarea id="msg" name="user_message" path="Address"/></textarea>
  
<br>
<br>

    Password : </label>
    &nbsp&nbsp &nbsp &nbsp&nbsp<form:input type="TEXT" id="name" name="User NAME" path="Password"/>

<br>
<br>
<br>

 <input type="submit" value="REGISTER">
   &nbsp &nbsp &nbsp &nbsp &nbsp<input type="reset" value="CANCEL">


</form:form>
</fieldset>
</html>
