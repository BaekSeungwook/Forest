package kosta.forrest.model.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kosta.forrest.model.board.dto.QnaDTO;

@Repository
public class QnaDAOImpl implements QnaDAO {

	@Autowired
	private SqlSession sqlSession;
	
	
	/**
	 * ����Ʈ ���
	 * */
	@Override
	public List<QnaDTO> selectAll() {
		List<QnaDTO> list = sqlSession.selectList("qnaMapper.selectAll");
		System.out.println("list22 = " + list);
		return list;
	}
	
//	/**
//	 * �� �˻� - �̸�
//	 * */
//	@Override
//	public List<QnaDTO> selectByQnaName(String nameKeyword) {
//		return sqlSession.selectList("qnaMapper.selectByQnaName");
//	}
//	
//	/**
//	 * �� �˻� - ����
//	 * */
//	@Override
//	public List<QnaDTO> selectByQnaTitle(String nameKeyword) {
//		return sqlSession.selectList("qnaMapper.selectByQnaTitle");
//	}
//
//
//	@Override
//	public List<QnaDTO> selectOne(int qnaNo) {
//		return sqlSession.selectOne("qnaMapper.selectOne", qnaNo);
//	}
//
//	@Override
//	public int qnaInsert(QnaDTO qnaDTO) {
//		return sqlSession.insert("qnaMapper.qnaInsert", qnaDTO);
//	}
//
//	@Override
//	public int answerUpdate(QnaDTO qnaDTO) {
//		return sqlSession.update("qnaMapper.answerUpdate", qnaDTO);
//	}
//
//	@Override
//	public int qnaUpdate(QnaDTO qnaDTO) {
//		return sqlSession.update("qnaMapper.qnaUpdate", qnaDTO);
//	}
//	
//	@Override
//	public int qnaDelete(int qnaNo) {
//		return sqlSession.delete("qnaMapper.qnaDelete", qnaNo);
//	}

}
