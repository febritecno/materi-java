<%-- 
    Document   : chec
    Created on : Jan 31, 2016, 1:40:41 PM
    Author     : febritecno
--%>
<meta http-equiv="Refresh" content="3;url=index.jsp">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/loding.css" />
<%
            String username = request.getParameter("username");
            String password = request.getParameter("password");
           
            if (username == null || password == null) {
 
                out.print("Invalid paramters ");
             
            }
 
            // Here you put the check on the username and password
            else if (username.toLowerCase().trim().equals("admin") && password.toLowerCase().trim().equals("admin")) {
                
                session.setAttribute("username", username);
                
out.println("<div class='container'>");
 out.println(" <div class='loader'>");
    out.println("<div class='loader--dot'></div>");
    out.println("<div class='loader--dot'></div>");
   out.println(" <div class='loader--dot'></div>");
    out.println("<div class='loader--dot'></div>");
     out.println("<div class='loader--dot'></div>");
    out.println("<div class='loader--dot'></div>");
    out.println("<div class='loader--text'></div>");
out.println("  </div>");
out.println("</div>");

            }
           else 
               {
                
out.println("<div class='container'>");
 out.println(" <div class='loader'>");
    out.println("<div class='loader--dot'></div>");
    out.println("<div class='loader--dot'></div>");
   out.println(" <div class='loader--dot'></div>");
    out.println("<div class='loader--dot'></div>");
     out.println("<div class='loader--dot'></div>");
    out.println("<div class='loader--dot'></div>");
    out.println("<div class='loader--text'></div>");
out.println("  </div>");
out.println("</div>");

   
                out.println("<script type='text/javascript'>"
                        + "setTimeout(function () {"
                        + "alert('Username Dan Password Tidak Valid');"
                        + "window.location.href = 'index.jsp';"
                        +"}, 1000);"
                        + "</script>");
                          //response.sendRedirect("index.jsp");

               }
            
%> 