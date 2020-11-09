package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import criTest.SearchCri;
import jdbcUtil.BoardDAO;
import vo.NBoardVO;

@Service
public class BoardServiceImple implements BoardService {
	@Autowired
	BoardDAO dao;
 
	@Override
	public List<NBoardVO> nblist(SearchCri cri) {
		return dao.nblist(cri);
	}

	@Override
	public int total(SearchCri cri) {
		return dao.total(cri);
	}

	@Override
	public NBoardVO nbdetail(NBoardVO vo) {
		return dao.nbdetail(vo);
	}

}
