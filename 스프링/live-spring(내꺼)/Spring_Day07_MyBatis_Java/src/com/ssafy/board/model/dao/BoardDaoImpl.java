package com.ssafy.board.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.ssafy.board.model.dto.Board;

public class BoardDaoImpl implements BoardDao {

	@Override
	@Select
	public List<Board> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Board selectOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertBoard(Board board) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBoard(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateBoard(Board board) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateViewCnt(int id) {
		// TODO Auto-generated method stub

	}

}
