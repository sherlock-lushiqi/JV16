<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.html"%>

<P>検索キーワードを入力してください。</P>
<form action="pkg1/kadai03search" method="post">
    <input type="text" name="keyword">
    <input type="submit" name="検索">
</form>

<%@include file="footer.html"%>
