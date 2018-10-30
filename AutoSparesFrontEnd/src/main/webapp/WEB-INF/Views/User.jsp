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
				  	<h3>Registration Form</h3>
					  <c:url value="/addUser" var="user"/>
                     <form:form action=" ${user}" method="post" commandName="user">   
					    	<div>
						    	<span><label>User Id:</label></span>
						    	<span><form:input type="text" id="name" name="user_name" path="UserID"/></span>
						    </div>
						    <div>
						    	<span><label>User Name:</label></span>
						    	<span><form:input type="TEXT" id="name" name="User NAME" path="Name" /></span>
						    </div>
						    <div>
						    	<span><label>Email-Id:</label></span>
						    	<span><form:input type="Text" id="mail" name="Email-ID" path="Email_ID"/></span>
						    </div>
						    <div>
						    	<span><label>Phone Number:</label></span>
						    	<span><form:input type="text" id="number" name="Number" path="PhNo" /></span>
						    </div>
						    <div>
						    	<span><label>Address:</label></span>
						    	<span><form:textarea id="msg" name="user_message" path="Address"></form:textarea></span>
						    </div>
						    <div>
						    	<span><label>Password:</label></span>
						    	<span><form:input type="TEXT" id="name" name="User Name" path="Password"/>
						    </div>
						   <div>
						   		<span><input type="submit" value="Register"></span>
								<span><input type="reset" value="Cancel"></span>
						  </div>
					    </form:form>
				    </div>
  				</div>	
</div>

			</div>
			
			<div class="clear"> </div>


<%@include file="footer.jsp" %>
</html>
