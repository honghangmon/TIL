package com.ssafy.mvc.model.service;

import java.util.List;

import com.ssafy.mvc.model.dao.BoardDao;
import com.ssafy.mvc.model.dto.Board;

public class BoardServiceImpl implements BoardService {
	
	private final BoardDao boarDao;
	
	public BoardServiceImpl(BoardDao boardDao) {
		this.boarDao = boardDao;
	}

	@Override
	public List<Board> getBoardList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Board readBoard(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void writeBoard(Board board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeBoard(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyBoard(Board board) {
		// TODO Auto-generated method stub
		
	}

}
