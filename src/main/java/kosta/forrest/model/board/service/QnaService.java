package kosta.forrest.model.board.service;

import java.util.List;

import kosta.forrest.model.board.dto.QnaDTO;

public interface QnaService {

	/**
	 * 리스트 출력
	 * */
	List<QnaDTO> selectAll();
//	
//	/**
//	 * 글 검색 - 이름
//	 * */
//	List<QnaDTO> selectByQnaName(String nameKeyword);
//	
//	/**
//	 * 글 검색 - 제목
//	 * */	
//	List<QnaDTO> selectByQnaTitle(String titleKeyword);
//	
//	/**
//	 * 글 상세보기
//	 * */
//	List<QnaDTO> selectOne(int qnaNo);
//	
//	/**
//	 * 질문 등록
//	 * */
//	int qnaInsert(QnaDTO qnaDTO);
//	
//	/**
//	 * 답변 등록
//	 * */
//	int answerUpdate(QnaDTO qnaDTO);
//	
//	/**
//	 * 질문 수정
//	 * */
//	int qnaUpdate(QnaDTO qnaDTO);
//	
//	/**
//	 * 질문 삭제
//	 * */
//	int qnaDelete(int qnaNo);
}
