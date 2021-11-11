<%@ page import="com.koreait.Board2.BoardVO" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    List<BoardVO> list = (List<BoardVO>)request.getAttribute("go");
%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>글 리스트</title>
</head>
<body>
    <h1>목록</h1>
    <table>
        <tr>
            <th>번호</th>
            <th>제목</th>
            <th>글쓴이</th>
            <th>작성일자</th>
        </tr>
        <% for(BoardVO vo : list) {%> <!-- 리스트를 모두 불러오는 for문 -->
        <tr>
            <td><%= vo.getIboard() %></td> <!-- BoardVO에 담긴 iboard값-->
            <td>
                <a href="/detail?iboard=<%= vo.getIboard()%>"> <!--detail로 넘어가기위한 태그-->
                        <%= vo.getTitle() %>
                </a>
            </td> <!-- BoardVO에 담긴 title값-->
            <td>
                <a href="/writelist?writer=<%= vo.getWriter()%>">
                    <%= vo.getWriter() %>
                </a>
            </td> <!-- BoardVO에 담긴 writer값-->
            <td><%= vo.getRdt() %></td> <!-- BoardVO에 담긴 rdt값-->
        </tr>
        <% } %> <!-- 여기까지 자바 선언 -->
    </table>
    <div>
        <a href="/write"><input type="button" value="새글 작성"></a>
    </div>

</body>
</html>
