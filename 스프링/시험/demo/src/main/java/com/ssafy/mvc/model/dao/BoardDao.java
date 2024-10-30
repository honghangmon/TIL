package com.ssafy.mvc.model.dao;

import java.util.List;

import com.ssafy.mvc.model.dto.Board;

public interface BoardDao {

	public List<Board> selectAll();
	
	public void insertBoard(Board board);

	public void updateViewCnt(int id);

	public Board seletOne(int id);
}
