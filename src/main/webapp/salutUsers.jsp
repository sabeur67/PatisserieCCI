<%@ page import = "java.util.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
</head>
<body>


<h1>liste des utilisateurs</h1>
<ul>
    <%
        List users = (List)request.getAttribute("listUser");
        for(Object u : users){
            out.println("<li>" + u + "</li>");
        }
    %>
</ul>




</body>
</html>