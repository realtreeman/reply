package me.light.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import me.light.model.ReplyVO;
import me.light.service.ReplyService;

@RestController
@RequestMapping("/replies/")
public class ReplyController {
	
	@Autowired
	ReplyService service;
	
	//consumes 파라메터랑 메칭 
	@PostMapping(value = "/new",
				consumes = MediaType.APPLICATION_JSON_VALUE,
				produces = MediaType.TEXT_PLAIN_VALUE
			)
	public ResponseEntity<String> create(@RequestBody ReplyVO vo){
		int insertCounter = service.register(vo);
		return insertCounter == 1 
				? new ResponseEntity<String>("성공했음",HttpStatus.OK)
				: new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@RequestMapping(method= {RequestMethod.PUT, RequestMethod.PATCH},
			value = "/{rno}",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity<String> modify(
			@RequestBody ReplyVO vo,@PathVariable Long rno){
		vo.setRno(rno);
		int insertCounter = service.modify(vo);
		return insertCounter == 1 
				? new ResponseEntity<String>("succes",HttpStatus.OK)
				: new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
}
}
