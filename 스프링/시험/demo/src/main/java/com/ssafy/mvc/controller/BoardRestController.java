package com.ssafy.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.mvc.model.service.BoardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api-board")
public class BoardRestController {

		private final BoardService boardService;
		
		@Autowired
		public BoardRestController(BoardService boardService) {
			this.boardService = boardService;
		}
		
		@GetMapping("/board")
		public ResponseEntity<?> list(@ModelAttribute SearchCondition condition){
			List<Board> = BoardService.search(condition);
			
			if(list == null || list.size() == 0) {
				return ResponseEntity<Void>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(list, HttpStatus.OK);
		}
		
		
		
		
		
		
		
}
