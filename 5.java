Index.html
<!DOCTYPE html>
<html>
<head>
<title>Voting Eligibility Check</title>
</head>
<body>
<form method="POST" action="CheckVoter">
<table cellspacing=5 cellpadding=5 bgcolor="aqua" cols=2>
<tr>
<td>Name</td>
<td><input type="text" name="uname" value="" placeholder="ENTER
NAME"></td>
</tr>
<tr>
<td>Age</td>
<td><input type="text" name="age" value="" placeholder="ENTER AGE"></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="check voting eligibility"></td>
</tr>
</table>
</form>
</body>
</html>
After creating the project go to source package
[Source package->Right Click-> New-> Servlet-> Class Name(CheckVoter)->
Package(com)-> Next-> Finish]
It creates CheckVoter,java file
CheckVoter,java
package com;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
public class CheckVoter extends HttpServlet {
protected void processRequest(HttpServletRequest request, HttpServletResponse
response)
 throws ServletException, IOException {
 response.setContentType("text/html;charset=UTF-8");
 PrintWriter pw = response.getWriter();
 try (PrintWriter out = response.getWriter()) {

 String name = request.getParameter("uname");
 int age=Integer.parseInt(request.getParameter("age"));
 if(age>=18){
 out.println("<font color='green'><h1> " +name+ " You are Eligible
to Vote </h1></font>");
 }else{
 out.println("<font color='brown'><h1> " +name+ " You are not
Eligible to Vote </h1></font>");
 }
 out.println("<a href=\"index.html\">HOME</a>");
}
}
}
