package com.iu.s8;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iu.board.qna.QnaService;

@Controller
@RequestMapping("/qna/")
public class QnaController {
	
	@Inject
	private QnaService qnaService;
	
	

}
