<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>글쓰기</title>
</head>
<body>
    <h1>작성중인 글</h1>
    <form action="/boardwrite" method="post">
        <div> <input type="text" name="title" placeholder="글제목"> </div>
        <div> <input name="ctnt" placeholder="내용"> </div>
        <div> <input type="text" name="writer" placeholder="작성자"> </div>
        <div>
            <input type="submit" value="저장">
            <input type="reset" value="초기화">
        </div>

    </form>
    <div>
        <a href="/list"><button type="button" value="뒤로가기"></button></a>
    </div>
</body>
</html>
