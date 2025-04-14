Index.html
<!DOCTYPE html>
<html>
 <head>
 <title>Download File Example</title>
 <meta charset="UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1.0">
 </head>
 <body>
 <h1>Click the below link to Download file</h1><br>
 <a href="dd">Download</a>
 </body>
</html>
Step 3:
After creating the project go to source package
[Source package->Right Click-> New-> Servlet-> Class Name(Download)->
Package(com)-> Next-> Finish]
It creates Download,java file
Download.java
package com;
import java.io.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
@WebServlet("/dd")
public class Download extends HttpServlet {
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
 File file = new File("C:\\BCA\\mycv.txt");
 if (!file.exists()) {
 response.getWriter().println("File not found.");
 return;
 }
 response.setContentType("application/octet-stream");
 response.setHeader("Content-Disposition", "attachment; filename=\"" +
file.getName() + "\"");
 try (var in = new FileInputStream(file); var out =
response.getOutputStream()) {
 in.transferTo(out); 
 }
 }
}
