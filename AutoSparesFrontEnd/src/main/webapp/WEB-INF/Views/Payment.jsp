<!DOCTYPE html>
<html>
<%@include file="header.jsp" %>
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
<legend><I><h1> CASH ON DELIVERY </h1></I></legend>

<c:url value="/payment" var="pay"/>
<form action="${pay}" method="post" >     

    OTP </label>
     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" id="number" name="payb2" />
<br>
<br>
<br>
<input type="submit" value="PAY">
   &nbsp &nbsp &nbsp &nbsp &nbsp<input type="reset" value="CANCEL">
   </form>
</fieldset>
  </div>
</div>


<div class="split right">
  <div class="centered">
    <fieldset>
	
<legend><I><h1> CARD PAYMENT</h1></I></legend>

<form action=" " >   
    CARD HOLDERS NAME   </label>
    &nbsp;&nbsp;<input type="text" id="name" name="user_name" />
<br>
<br>

    CARD NAME  </label>
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="NAME" id="NAME" name="CITY" />
  
<br>
<br>  

            <label class="control-label" for="password">CARD EXPIRY DATE </label>
             &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select class="span3" name="expiry_month" id="expiry_month">
               <option></option>
                <option value="01">Jan (01)</option>
                <option value="02">Feb (02)</option>
                <option value="03">Mar (03)</option>
                <option value="04">Apr (04)</option>
                <option value="05">May (05)</option>
                <option value="06">June (06)</option>
                <option value="07">July (07)</option>
                <option value="08">Aug (08)</option>
                <option value="09">Sep (09)</option>
                <option value="10">Oct (10)</option>
                <option value="11">Nov (11)</option>
                <option value="12">Dec (12)</option>
              </select>
              <select class="span2" name="expiry_year">
                <option value="13">2013</option>
                <option value="14">2014</option>
                <option value="15">2015</option>
                <option value="16">2016</option>
                <option value="17">2017</option>
                <option value="18">2018</option>
                <option value="19">2019</option>
                <option value="20">2020</option>
                <option value="21">2021</option>
                <option value="22">2022</option>
                <option value="23">2023</option>
              </select>
            
<br>
<br>  

            <label class="control-label"  for="password_confirm">CARD CVV </label>
               &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="password" id="password_confirm" name="password_confirm" placeholder="" class="span2">
            
<br>
<br>
<br>

 <input type="submit" value="PAY">
   &nbsp &nbsp &nbsp &nbsp &nbsp<input type="reset" value="CANCEL">



</fieldset>
  </div>
</div>
     
</body>
</html> 
