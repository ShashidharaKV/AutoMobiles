<%@taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="header.jsp" %>

<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
    font-family: Arial;
    color: white;
}

.split {
    height: 100%;
    width: 50%;
    position: fixed;
    z-index: 1;
    top: 0;
    overflow-x: hidden;
    padding-top: 20px;
}

.left {
    left: 0;
    background-color: #117;
}

.right {
    right: 0;
    background-color: #111;
}

.centered {
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    text-align: center;
}

.centered img {
    width: 150px;
    border-radius: 50%;
}
</style>
</head>
<body>

<div class="split left">
  <div class="centered">
    <fieldset>
<legend><I><h1> BILLING FORM </h1></I></legend>


    Billing ID :  </label>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="text" id="name" name="user_name" path="billing.Billing_Id"/>
<br>
<br>

    Name : </label>
     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="TEXT" id="name" name="BILLING NAME" path="billing.Billing_Name"/>
  
<br>
<br>  

    Address: </label>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:textarea id="msg" name="user_message" path="billing.Billing_Address"></form:textarea>
  
<br>
<br>  

    Phone No: </label>
     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="text" id="number" name="Number" path="billing.Billing_Phoneno"/>

<br>
<br>
  </div>
</div>

<div class="split right">
  <div class="centered">
    <fieldset>
<legend><I><h1> SHIPPING FORM </h1></I></legend>

<c:url value="/orderConfirm" var="order"/>
<form:form action="${order}" method="post" commandName="shippingAddress">   
    SHIPPING ID :  </label>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="text" id="name" name="user_name" path="shipId"/>
<br>
<br>

    ADDRESS : </label>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:textarea id="msg" name="user_message" path="address"></form:textarea>
  
<br>
<br>  

   CITY : </label>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="NAME" id="NAME" name="CITY" path="city"/>

<br>
<br>  

    STATE: </label>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="tEXT" id="nAME" name="NAME" path="state"/>

<br>
<br>

    COUNTRY : </label>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:input type="TEXT" id="name" name="COUNTRY NAME" path="country"/>

<br>
<br>  

    PIN-CODE: </label>
    &nbsp&nbsp&nbsp &nbsp &nbsp &nbsp<form:input type="TEXT" id="number" name="NUMBER" path="pincode"/>
  
<br>
<br>

    PHONE NO : </label>
    &nbsp&nbsp &nbsp &nbsp&nbsp<form:input type="TEXT" id="number" name="MOBILE NO" path="phone"/>

<br>
<br>
<br>

 <input type="submit" value="SUBMIT">
   &nbsp &nbsp &nbsp &nbsp &nbsp<input type="reset" value="CANCEL">

</form:form>

</fieldset>
  </div>
</div>
     
</body>

<%@include file="footer.jsp" %>
</html> 
