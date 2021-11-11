package com.koreait.Board2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/write")
public class WriteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        String path = "/WEB-INF/write.jsp";
        RequestDispatcher rd = req.getRequestDispatcher(path);
        rd.forward(req,res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String title = req.getParameter("title"); //title의 값을 가져와서 Strig title에 넣어준다.
        String writer = req.getParameter("writer");
        String ctnt = req.getParameter("ctnt");
        BoardVO vo = new BoardVO(); //BoardVO를 객체화 해서 값을 넣는다.
        vo.setTitle(title);
        vo.setWriter(writer);
        vo.setCtnt(ctnt);

        int result = DAO.insBoard(vo);
        switch (result){
            case 1:
                res.sendRedirect("/list");
                break;
            default:
                res.sendRedirect("/write");
                break;
        }

    }
}
