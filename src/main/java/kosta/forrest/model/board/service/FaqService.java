package kosta.forrest.model.board.service;

import java.util.List;

import kosta.forrest.model.board.dto.FaqDTO;

public interface FaqService {
	
	/**
	 * ��ü��� - ���ǰ˻�
	 */
	List<FaqDTO> selectAll(int start, int end, String option, String keyWord);
	
	/**
	 * ī��Ʈ
	 */
	int countArticle(String option, String keyWord);
	
	/**
	 * ���ڵ� ����
	 * */
	int faqInsert(FaqDTO faqDTO);
	  
    /**
     * �𵨹�ȣ�� �ش��ϴ� ���ڵ� ����
     */
	int faqDelete(int faqNo);
	  
	/**
	 * �𵨹�ȣ�� �ش��ϴ� ���ڵ� ����
	 */
	int faqUpdate(FaqDTO faqDTO);
}
