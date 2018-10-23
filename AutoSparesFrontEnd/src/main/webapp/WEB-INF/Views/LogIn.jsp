<%@taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<fieldset>
<legend><B><h1> Login Form </h1></B></legend>

 <c:url value="/j_spring_security_check" var="login"/>
    <form:form action="${login}" method="post">
  User Name:
  &nbsp<input type="text" name="j_username" Placeholder=" FULL NAME">
  
  <br><br>
  
  Password :
  &nbsp&nbsp&nbsp<input type="text" name="j_password" Placeholder="YOUR PASSWORD">
  <br><br><br>

  <input type="submit" value="LOGIN">
  &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="reset" value="CANCEL">
</form:form> 

</fieldset>
</html>
