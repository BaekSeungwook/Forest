package kosta.forrest.model.board.service;

import java.util.List;

import kosta.forrest.model.board.dto.FaqDTO;

public interface FaqService {
	
	/**
	 * ��ü��� - ���ǰ˻�
	 */
	List<FaqDTO> selectAll(String option, String keyWord);
}
