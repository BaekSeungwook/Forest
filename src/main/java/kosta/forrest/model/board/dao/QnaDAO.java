package kosta.forrest.model.board.dao;

import java.util.List;

import kosta.forrest.model.board.dto.QnaDTO;

public interface QnaDAO {
	
	/**
	 * ����Ʈ ���
	 * */
	List<QnaDTO> selectAll();
//	
//	/**
//	 * �� �˻� - �̸�
//	 * */
//	List<QnaDTO> selectByQnaName(String nameKeyword);
//	
//	/**
//	 * �� �˻� - ����
//	 * */	
//	List<QnaDTO> selectByQnaTitle(String titleKeyword);
//	
//	/**
//	 * �� �󼼺���
//	 * */
//	List<QnaDTO> selectOne(int qnaNo);
//	
//	/**
//	 * ���� ���
//	 * */
//	int qnaInsert(QnaDTO qnaDTO);
//	
//	/**
//	 * �亯 ���
//	 * */
//	int answerUpdate(QnaDTO qnaDTO);
//	
//	/**
//	 * ���� ����
//	 * */
//	int qnaUpdate(QnaDTO qnaDTO);
//	
//	/**
//	 * ���� ����
//	 * */
//	int qnaDelete(int qnaNo);
	
}
