package service;

import java.util.List;

import criTest.SearchCri;
import vo.NBoardVO;

public interface BoardService {

	public List<NBoardVO> nblist(SearchCri cri);
	

	public int total(SearchCri cri);
	
	public NBoardVO nbdetail(NBoardVO vo);
}