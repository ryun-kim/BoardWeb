package com.koreait.Board2;

import javax.swing.*;
import java.sql.*;

import java.util.ArrayList;
import java.util.List;

public class DAO {

    public static int insBoard(BoardVO param){ //int로 vo 안의 iboard값을 찾아 넣어준다.
        Connection con = null;
        PreparedStatement ps = null;
        String sql = "INSERT INTO t_board (title, ctnt, writer) VALUE (?, ?, ?)";

        try{
            con = DbUtils.getCon();
            ps = con.prepareStatement(sql);
            ps.setString(1, param.getTitle());
            ps.setString(2, param.getCtnt());
            ps.setString(3, param.getWriter());
            return ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            DbUtils.close(con, ps);
        }
        return 0;
    }

    public static List<BoardVO> selBoardWriter(String param){
        List<BoardVO> list = new ArrayList<>();

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs= null;
        String sql= "SELECT iboard, title, writer, ctnt, rdt FROM t_board WHERE writer =?";
        try{
            con = DbUtils.getCon();
            ps = con.prepareStatement(sql);
            ps.setString(1, param);
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
            DbUtils.close(con, ps, rs);
        } return list;
    }
    public static BoardVO selBoardDetail(BoardVO param){
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT title, writer, ctnt, rdt FROM t_board WHERE iboard = ? ";

        try{
            con = DbUtils.getCon();
            ps = con.prepareStatement(sql);
            ps.setInt(1, param.getIboard());
            rs = ps.executeQuery();

            if(rs.next()){
                BoardVO vo = new BoardVO();
                vo.setIboard(param.getIboard());
                vo.setTitle(rs.getString("title"));
                vo.setWriter(rs.getString("writer"));
                vo.setCtnt(rs.getString("ctnt"));
                vo.setRdt(rs.getString("rdt"));
                return vo;
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            DbUtils.close(con,ps,rs);
        }
        return null;
    }

    public static List<BoardVO> selBoardList(){ //selBoardList 생성
        List<BoardVO> list = new ArrayList<>(); // 새로운 리스트 객체화
        Connection con = null; // Connection 객체화
        PreparedStatement ps = null; // PreparedStatement 객체화
        ResultSet rs = null; //select문에 필요한 resultset 객체화
        String sql = "SELECT iboard, title, writer, rdt FROM t_board ORDER BY iboard DESC";

        try{

            con = DbUtils.getCon(); //DbUtils에 연결
            ps = con.prepareStatement(sql); //con에 있는 pre에서 sql과 연결
            rs = ps.executeQuery(); //rs에 ps에 넣은 값을 넣어준다.
            while(rs.next()){
                BoardVO vo = new BoardVO(); //VO 객체화
                vo.setIboard(rs.getInt("iboard")); //객체화 시킨 vo에 rs에 받은 값을 넣어준다
                vo.setTitle(rs.getString("title"));
                vo.setWriter(rs.getString("writer"));
                vo.setRdt(rs.getString("rdt"));
                list.add(vo); // vo에 넣은 값을 list에 넣어준다.
            }

        }catch(Exception e){//예외처리
            e.printStackTrace();
        }finally {
            DbUtils.close(con,ps,rs); // 메모리를 많이 차지하기에 사용후 닫아준다.
        }
        return list; //list값을 리턴
    }

    public static int updBoard(BoardVO param){
        Connection con = null;
        PreparedStatement ps = null;
        String sql = "UPDATE t_board SET title=?, ctnt =?, writer = ? WHERE iboard=?";

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
            DbUtils.close(con,ps);
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
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            DbUtils.close(con, ps);
        }return 0;
    }
}
