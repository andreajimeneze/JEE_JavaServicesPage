<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="cl.praxis.desafiojps.utils.Utilities"%>
<%
  Utilities utilesgeneral = new Utilities();
%>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>

<body>
<h1>Desafío 1 JEE</h1>

<table>
  <thead>
    <tr>Número</tr>
    <tr>Calcular Factorial</tr>
    <tr>¿Es par o impar?</tr>
  </thead>
  <tbody>
<%
  for(int x = 1; x <= 10; x++)
  {
%>
  <tr>
  <td>Número <%=x%></td>
    <td><a href="factorial?value=<%=x%>">Factorial es <%=x%></a></td>
  <td><a href="impar?value=<%=x%>">Par o impar es <%=x%></a></td>
  </tr>
<%
  }
%>
  </tbody>



  </table>
</body>
</html>