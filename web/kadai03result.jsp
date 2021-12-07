<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.html" %>
<%@page import="main.java.bean.Product,java.util.List" %>

<% List<Product> list = (List<Product>) request.getAttribute("list"); %>
<% for (Product p : list) { %>
<P><%=p.getId()%> : <%=p.getName()%>:<%=p.getPrice()%></P>
<% }%>

<%@include file="footer.html" %>
