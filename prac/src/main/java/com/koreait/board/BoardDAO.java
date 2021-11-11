package com.koreait.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BoardDAO {

    public static int insBoard(BoardVO param){
        Connection con = null;
        PreparedStatement ps = null;
        String mysql = "INSERT INTO t_board "+
                        "(title, writer, ctnt)"+
                        "(VALUES )"+
                        "(?, ?, ?)";


        try{
            con = DbUtils.getCon();
            ps = con.prepareStatement(mysql);
            ps.setString(1,param.getTitle());
            ps.setString(2, param.getWriter());
            ps.setString(3, param.getCtnt());

            return ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            DbUtils.close(con,ps);
        }

        return 0;
    }

    public static List<BoardVO> selBoardList(){
        List<BoardVO> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String mysql = "SELECT iboard, title, writer,ctnt,rdt FROM t_board ORDER BY iboard DESC";
        try{
            con = DbUtils.getCon();
            ps = con.prepareStatement(mysql);
            rs = ps.executeQuery();
            while(rs.next()){
                BoardVO vo = new BoardVO();
                vo.setIboard(rs.getInt("iboard"));
                vo.setTitle(rs.getString("title"));
                vo.setWriter(rs.getString("writer"));
                vo.setCtnt(rs.getString("ctnt"));
                vo.setRdt(rs.getString("rdt"));
                list.add(vo);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            DbUtils.close(con,ps,rs);
        }
        return list;
    }


}
