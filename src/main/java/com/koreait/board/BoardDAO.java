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
        String sql = "INSERT INTO t_board (title, writer, ctnt) VALUES "+
                    " (?,?,?) ";
        try{
            con = DbUtils.getCon();
            ps = con.prepareStatement(sql);
            ps.setString(1, param.getTitle());
            ps.setString(2, param.getWriter());
            ps.setString(3, param.getCtnt());

            return ps.executeUpdate();

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            DbUtils.close(con,ps);
        }
        return 0;
    }


    public static List<BoardVO> selBoardList(){
        List<BoardVO> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT iboard, title, writer, rdt FROM t_board ORDER BY iboard DESC";

        try{
            con = DbUtils.getCon();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                BoardVO vo = new BoardVO();
                vo.setIboard(rs.getInt("iboard"));
                vo.setTitle(rs.getString("title"));
                vo.setWriter(rs.getString("writer"));
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

    public static BoardVO selBoard(BoardVO param){
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT title, writer, ctnt, rdt FROM t_board WHERE iboard = ? ";

        try {
            con = DbUtils.getCon();
            ps = con.prepareStatement(sql);
            ps.setInt(1, param.getIboard());
            rs = ps.executeQuery();
            if(rs.next()) {
                BoardVO vo = new BoardVO();
                vo.setIboard(param.getIboard());
                vo.setTitle(rs.getString("title"));
                vo.setCtnt(rs.getString("ctnt"));
                vo.setWriter(rs.getString("writer"));
                vo.setRdt(rs.getString("rdt"));
                return vo;
            }

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            DbUtils.close(con,ps,rs);
        }
        return null;
    }

    public static int updBoard(BoardVO param){
        Connection con = null;
        PreparedStatement ps = null;
        String sql = "UPDATE t_board SET title=?, ctnt =?, writer =? WHERE iboard=?";

        try{
            con = DbUtils.getCon();
            ps = con.prepareStatement(sql);
            ps.setString(1,param.getTitle());
            ps.setString(2,param.getCtnt());
            ps.setString(3,param.getWriter());
            ps.setInt(4,param.getIboard());
            return ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            DbUtils.close(con, ps);
        }
        return 0;
    }

    public static int delBoard(BoardVO param){
        Connection con = null;
        PreparedStatement ps = null;
        String sql = "DELETE FROM t_board WHERE iboard =?";

        try{
             con = DbUtils.getCon();
             ps = con.prepareStatement(sql);
             ps.setInt(1,param.getIboard());
             return ps.executeUpdate();
        }catch(Exception e) {
            e.printStackTrace();
        }finally {
            DbUtils.close(con,ps);
        }
        return 0;
    }


}
