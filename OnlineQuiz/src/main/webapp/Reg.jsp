<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Registration</title>
</head>
<body>
<jsp:include page="headerwithoutlogin.jsp"></jsp:include>
<h2>Registration !</h2>
<Form method="post" action="./RegController">
<div class="container">
<div class="form-group">
    <label for="t1"> Name</label>
    
   <input type="text" name="t1" id="t1"  class="form-control"/>
  </div>


<div class="form-group">
    <label for="t2"> Email</label>
  <input type="email" name="t2" id="t2" class="form-control"/>
  </div>

<div class="form-group">
    <label for="t3"> Mobile</label>
  <input type="text" name="t3" id="t3" class="form-control"/>
  </div>

<div class="form-group">
    <label for="t4"> Password</label>
  <input type="password" name="t4" id="t4" class="form-control"/>
  </div>

<div class="form-group">
<input type="submit" name="b1" value="Submit" class="btn btn-success"  />
</div></div>
</Form>


</body>
</html>