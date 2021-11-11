package com.koreait.Board2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/detail")
public class DetailServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String striboard = req.getParameter("iboard");
        int iboard = Integer.parseInt(striboard);
        BoardVO vo = new BoardVO();
        vo.setIboard(iboard);
        BoardVO vvo = DAO.selBoardDetail(vo);
        req.setAttribute("godata", vvo);

        String path = "/WEB-INF/detail.jsp";
        RequestDispatcher rd = req.getRequestDispatcher(path);
        rd.forward(req,res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

    }
}
