package com.ssafy.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.mvc.model.dto.Board;
import com.ssafy.mvc.model.dto.SearchCondition;
import com.ssafy.mvc.model.service.BoardService;

@RestController
@RequestMapping("/api-board")
public class BoardRestController {

		private final BoardService boardService;

		@Autowired
		public BoardRestController(BoardService boardService) {
			this.boardService = boardService;
		}
		//생성자 오버로딩? 
		@GetMapping("/board")
		public ResponseEntity<List<Board>> list(){
			List<Board> list = boardService.getBoardList();
			return new ResponseEntity<>(list, HttpStatus.OK);
		}
		
		@GetMapping("/board/{id}")
		public ResponseEntity<Board> detail(@PathVariable("id") int id){
			Board board = boardService.readBoard(id);
			if(board != null){
			return ResponseEntity.ok(board);
			
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		
}
		@PostMapping("/board")
		public ResponseEntity<?> write(@ModelAttribute Board board){
			boardService.writeBoard(board);
			
			int id = board.getId();
			
			return new ResponseEntity<Board>(board, HttpStatus.CREATED);
		}
		
		@DeleteMapping("/board/{id}")
		public ResponseEntity<String> delete(@PathVariable("id") int id){
			boolean isDeleted = boardService.removeBoard(id);
			
			if(isDeleted)
				return ResponseEntity.status(HttpStatus.OK).body("Board deleted");
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed");
		}
		
		@PutMapping("/board/{id}")
		public ResponseEntity<Void> update(@PathVariable("id") int id, @RequestBody Board board){
			board.setId(id);
			boardService.modifyBoard(board);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		@GetMapping("/board")
		public ResponseEntity<?> list(@ModelAttribute SearchCondition condition){
			List<Board> list = boardService.search(condition);
			
			if(list == null || list.size() == 0) {
				return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<List<Board>>(list, HttpStatus.OK);
		}
		
}
