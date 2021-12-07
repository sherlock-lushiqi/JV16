<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.html"%>

<%@ page import="main.java.bean.Product" %>
<% Product p = (Product) request.getAttribute("product"); %>
<% p.getId(); %>:
<% p.getName(); %>:
<% p.getPrice(); %>:<br>

<%@include file="footer.html"%>
