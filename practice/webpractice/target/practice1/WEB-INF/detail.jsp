<%@ page import="com.koreait.Board2.BoardVO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    BoardVO vo = (BoardVO) request.getAttribute("godata");
%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>상세 글 보기</title>
</head>
<body>
    <h1>글 내용</h1>
    <div>제목 : <%= vo.getTitle()%></div>
    <div>작성자 : <%= vo.getWriter()%></div>
    <div>작성일시 : <%= vo.getRdt()%></div>
    <div> <%= vo.getCtnt()%> </div>
    <div>
        <a href="/del?iboard=<%= vo.getIboard() %>">
            <input type="button" value="글 삭제 하기">
        </a>
        <a href="/mod?iboard=<%= vo.getIboard()%>">
            <input type="button" value="글 수정 하기">
        </a>

    </div>
    <div>
        <a href="/list">
            <input type="button" value="리스트로 돌아가기">
        </a>
    </div>
</body>
</html>