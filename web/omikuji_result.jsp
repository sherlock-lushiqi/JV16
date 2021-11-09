<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>御神籤の結果</title>
    </head>
    <body>

        <c:choose>
            <c:when test="${errors != null}">
                <h1>入力にエラーがあります。</h1>
                <ul>
                    <c:forEach var="error" items="${errors}">
                        <li><c:out value="${error}"/></li>
                    </c:forEach>
                </ul>
            </c:when>
            <c:otherwise>
                <h1>御神籤の結果</h1>
                <p><c:out value="${username}"/>さんの今日の運勢は<c:out value="${omikuji_result}"/>です。</p>
            </c:otherwise>
        </c:choose>

    </body>
</html>
