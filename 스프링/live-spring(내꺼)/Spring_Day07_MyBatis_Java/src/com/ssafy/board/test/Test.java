package com.ssafy.board.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ssafy.board.config.MyBatisConfig;
import com.ssafy.board.model.dto.Board;

public class Test {
	public static void main(String[] args) {
		try(SqlSession session = MyBatisConfig.getFactory().openSession()){
			List<Board> boards = session.selectList("com.ssafy.model.dao.Board.seletAll");
			for(Board board : boards) {
				System.out.println(board);
			}
		}
	}

}
