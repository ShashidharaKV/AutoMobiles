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
				  	<h3>Log-In Form</h3>
					   <c:url value="/j_spring_security_check" var="login"/>
                          <form:form action="${login}" method="post">
					    	<div>
						    	<span><label>User Name or Number:</label></span>
						    	<span><input type="text" name="j_username" Placeholder="Email-Id"/></span>
						    </div>
						    <div>
						    	<span><label>Password:</label></span>
						    	<span><input type="text" name="j_password" Placeholder="YOUR PASSWORD"/></span>
						    </div>
						   <div>
						   		<span><input type="submit" value="Sign-In"></span>
								<span><input type="reset" value="Cancel"></span>
						  </div>
					    </form:form>
				    </div>
  				</div>	

<%@include file="footer.jsp" %>
</html>
