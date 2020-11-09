package com.portal.projt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import criTest.PageMaker;
import criTest.SearchCri;
import service.BoardService;
import vo.NBoardVO;

@Controller
public class Cont {
	@Autowired
	BoardService service;

	@RequestMapping(value = "/nblist")
	public ModelAndView nblist(ModelAndView mv,SearchCri cri,PageMaker pm) {
		cri.setSnoEno();
		mv.addObject("list",service.nblist(cri));
		pm.setCri(cri);// 바뀐페이지 정보를 가지고 있는 cri 를 pm에 넣어주는것
		pm.setLastPage(service.total(cri));
		mv.addObject("pm", pm);
		mv.setViewName("board/noticeBoardList");
		return mv;
	}
	

	@RequestMapping(value = "/nbdetail")
	public ModelAndView nbdetail(ModelAndView mv,NBoardVO vo) {
		vo = service.nbdetail(vo);
		mv.addObject("vo", vo);
		mv.setViewName("board/noticeBoardDetail");
		return mv;
	}
	
}
