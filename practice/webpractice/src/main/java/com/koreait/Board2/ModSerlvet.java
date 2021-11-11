package com.koreait.Board2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/mod")
public class ModSerlvet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String striboard = req.getParameter("iboard");
        int iboard = Integer.parseInt(striboard);
        BoardVO vo = new BoardVO();
        vo.setIboard(iboard);
        BoardVO vvo = DAO.selBoardDetail(vo);
        req.setAttribute("moddata",vvo);

        String path = "/WEB-INF/mod.jsp";
        RequestDispatcher rd = req.getRequestDispatcher(path);
        rd.forward(req,res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String title = req.getParameter("title");
        String ctnt = req.getParameter("ctnt");
        String writer = req.getParameter("writer");
        String striboard = req.getParameter("iboard");
        int iboard = Integer.parseInt(striboard);

        BoardVO param = new BoardVO();
        param.setIboard(iboard);
        param.setTitle(title);
        param.setCtnt(ctnt);
        param.setWriter(writer);

        int result = DAO.updBoard(param);
        switch(result){
            case 1:
                res.sendRedirect("/detail?iboard="+ striboard);
                break;
        }


    }
}
