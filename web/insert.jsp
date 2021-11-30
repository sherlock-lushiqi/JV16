<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.html"%>

<P>追加する商品を入力してください。</P>
<form action="pkg1/insert" method="post">
    商品名<input type="text" name="name">
    価格<input type="text" name="price">
    <input type="submit" value="追加">
</form>

<%@include file="footer.html"%>
