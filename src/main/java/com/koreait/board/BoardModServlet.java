package com.koreait.board;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/mod")
public class BoardModServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String str = req.getParameter("iboard");
        int iboard = Integer.parseInt(str);
        BoardVO vo = new BoardVO();
        vo.setIboard(iboard);
        BoardVO modvo = BoardDAO.selBoard(vo);
        req.setAttribute("data2",modvo);

        String path = "/WEB-INF/jsp/mod.jsp";
        req.getRequestDispatcher(path).forward(req,res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String title = req.getParameter("title");
        String ctnt = req.getParameter("ctnt");
        String writer = req.getParameter("writer");
        String striboard= req.getParameter("iboard");
        int iboard = Integer.parseInt(striboard);

        BoardVO vo = new BoardVO();
        vo.setIboard(iboard);
        vo.setTitle(title);
        vo.setCtnt(ctnt);
        vo.setWriter(writer);

        int result = BoardDAO.updBoard(vo);
        System.out.println("result : "+ result);
        switch(result){
            case 1:
                res.sendRedirect("/detail?iboard="+ striboard);
                break;
        }

    }
}
