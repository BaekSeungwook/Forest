package kosta.forrest.model.board.dao;

import java.util.List;

import kosta.forrest.model.board.dto.FaqDTO;

public interface FaqDAO {
	
	/**
	 * ��ü��� - ���ǰ˻�
	 */
	List<FaqDTO> selectAll(String option, String keyWord);
}
