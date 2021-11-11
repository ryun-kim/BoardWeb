<%@ page import="com.koreait.Board2.BoardVO" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    List<BoardVO> list = (List<BoardVO>)request.getAttribute("writelist");
%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>작성자의 모든글보기</title>
</head>
<body>
    <h1>작성글 목록</h1>
    <table>
        <tr>
            <th>번호</th>
            <th>제목</th>
            <th>글쓴이</th>
            <th>작성일자</th>
        </tr>
        <% for(BoardVO vo : list){%>
        <tr>
            <td><%= vo.getIboard() %></td>
            <td>
                <a href="/detail?iboard=<%= vo.getIboard()%>">
                    <%= vo.getTitle() %>
                </a>
            </td>
            <td>
                <%= vo.getWriter() %>
            </td>
            <td><%= vo.getRdt() %></td>
        </tr>
        <% } %>
    </table>

</body>
</html>
