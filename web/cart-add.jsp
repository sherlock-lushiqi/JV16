<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.html"%>

<p>商品を入力してください。</p>
<form action="pkg1/cart-add" method="post">
    商品名<input type="text" name="name">
    価格<input type="text" name="price">
    <input type="submit" value="追加">
</form>

<%@include file="footer.html"%>
