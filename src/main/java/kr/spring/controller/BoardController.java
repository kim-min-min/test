package kr.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.spring.entity.Board;
import kr.spring.service.BoardService;

@RequestMapping("/board")
@Controller
public class BoardController {

	@Autowired
	private BoardService service;
	
	//게시글 전체 조회
	@RequestMapping("/list")
	public String list(Model model) 
	{
		service.list(model);
		return "board/list";
	}
	
	//게시글 상세보기
	@RequestMapping("/get")
	public @ResponseBody Board get(Long idx) 
	{
		return service.get(idx);		
	}
	
	//게시글 등록
	@RequestMapping("/register")
	public String register(Board vo) 
	{
		service.register(vo);
		return "redirect:/board/list";
	}
	
	//게시글 삭제
	@RequestMapping("/remove")
	public String remove(Long idx) 
	{
		service.remove(idx);
		return "redirect:/board/list";
	}
	
	
	
	
}
