package kosta.forrest.model.board.dao;

import java.util.List;

import kosta.forrest.model.board.dto.FaqDTO;

public interface FaqDAO {
	
	/**
	 * ��ü��� - ���ǰ˻�
	 */
	List<FaqDTO> selectAll(int start, int end, String option, String keyWord);
	
	/**
	 * ī��Ʈ
	 */
	int countArticle(String option, String keyWord);
}
