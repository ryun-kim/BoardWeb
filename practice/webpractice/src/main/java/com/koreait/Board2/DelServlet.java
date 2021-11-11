package com.koreait.Board2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/del")
public class DelServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String striboard= req.getParameter("iboard");
        int iboard = Integer.parseInt(striboard);
        BoardVO vo = new BoardVO();
        vo.setIboard(iboard);
        int result = DAO.delBoard(vo);
        switch (result){
            case 1:
                res.sendRedirect("/list");
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

    }
}
