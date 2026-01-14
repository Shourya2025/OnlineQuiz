<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Online Quiz</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="Welcome.jsp">Home</a></li>
      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Test
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="StartTest.jsp?t=cn">Computer Network</a></li>
          <li><a href="StartTest.jsp?t=ds">Data Structure</a></li>
          <li><a href="StartTest.jsp?t=dbms">DBMS</a></li>
            <li><a href="StartTest.jsp?t=os">OS</a></li>
              <li><a href="StartTest.jsp?t=oot">OOT</a></li>
          <li><a href="StartTest.jsp?t=se">SE</a></li>
          
        </ul>
      </li>
      <li><a href="ResultHistory.jsp">Result History</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      
      <li><a href="signout.jsp"><span class="glyphicon glyphicon-log-in"></span> Sign Out</a></li>
    </ul>
  </div>
</nav>

</body>
</html>