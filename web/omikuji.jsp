<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>今日に御神籤</title>
    </head>
    <body>

        <h1>今日の御神籤</h1>
        <form method="post" action="pkg1/omikuji">
            <laber for="username">氏名</laber>
            <br>
            <input type="text" name="username">
            <br>
            <botton type="submit">占う！</botton>
        </form>

    </body>
</html>
