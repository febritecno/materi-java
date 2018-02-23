<%-- 
    Document   : logout
    Created on : Jan 31, 2016, 1:41:39 PM
    Author     : febritecno
--%>
<meta http-equiv="Refresh" content="3;url=index.jsp">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/loding2.css" />
<%
 
     String username=(String)session.getAttribute("username");
    if(username!=null)
        {

            
out.print("<span class='loading blue'></span>");
            session.removeAttribute("username");
             
                out.println("<script type='text/javascript'>"
                        + "setTimeout(function () {"
                        + "alert('User Telah Keluar');"
                        + "window.location.href = 'index.jsp';"
                        +"}, 1000);"
                        + "</script>");
        }
     else 
         {
             response.sendRedirect("index.jsp");
             
     }
 
 
 
%>  