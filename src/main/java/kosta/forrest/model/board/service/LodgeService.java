package kosta.forrest.model.board.service;

import java.util.List;

import kosta.forrest.model.board.dto.BookingDTO;
import kosta.forrest.model.board.dto.ForestDTO;
import kosta.forrest.model.board.dto.LodgeDTO;

public interface LodgeService {
	/**
	 * ���� ���ڵ� ��ü �˻�
	 * */
	List<LodgeDTO> selectAll(int forestNo) ;
	

	/**
	 * ���ڵ� ����
	 * */
	int insert(LodgeDTO ��odgeDTO);

	/**
	 * �޾縲��ȣ�� �ش��ϴ� ���ڵ� ����
	 * */
	int delete(String lodeCode);

	/**
	 * �����ڵ忡 �ش��ϴ� �����ϱ��� �ҷ�����
	 */
	BookingDTO selectBookInfo(String lodgeCode);
}
