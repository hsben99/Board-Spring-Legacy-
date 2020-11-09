package jdbcUtil;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import criTest.SearchCri;
import vo.NBoardVO;

@Repository
public class BoardDAO {
	@Autowired
	SqlSession sqlSession;
	String NS = "com.ncs.boardMapper.";

	public List<NBoardVO> nblist(SearchCri cri) {
		return sqlSession.selectList(NS + "nblist", cri);
	}

	public int total(SearchCri cri) {
		return sqlSession.selectOne(NS + "total", cri);
	}

	public NBoardVO nbdetail(NBoardVO vo) {
		return sqlSession.selectOne(NS + "nbdetail", vo);
	}

}
