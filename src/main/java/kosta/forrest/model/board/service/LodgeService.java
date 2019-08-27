package kosta.forrest.model.board.service;

import java.util.List;

import kosta.forrest.model.board.dto.BookingDTO;
import kosta.forrest.model.board.dto.ForestDTO;
import kosta.forrest.model.board.dto.LodgeDTO;

public interface LodgeService {
	/**
	 * 숙박 레코드 전체 검색
	 * */
	List<LodgeDTO> selectAll(int forestNo) ;
	

	/**
	 * 레코드 삽입
	 * */
	int insert(LodgeDTO ㅣodgeDTO);

	/**
	 * 휴양림번호에 해당하는 레코드 삭제
	 * */
	int delete(String lodeCode);

	/**
	 * 숙박코드에 해당하는 예약하기폼 불러오기
	 */
	BookingDTO selectBookInfo(String lodgeCode);


	int bookingInsert(BookingDTO bookingDTO);


	List<BookingDTO> selectBookAll();


	BookingDTO selectByBookingCode(int bookCode);
}
