package kosta.forrest.model.board.service;

import java.util.List;

import kosta.forrest.model.board.dto.QnaDTO;

public interface QnaService {

	/**
	 * ����Ʈ ���
	 * */
	List<QnaDTO> selectAll();
	
	/**
	 * �� �󼼺���
	 * */
	QnaDTO selectByNo(int qnaNo);
	
//	/**
//	 * �� �˻�
//	 * */
//	List<QnaDTO> selectBySearch(String keyWord, String keyField);
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
