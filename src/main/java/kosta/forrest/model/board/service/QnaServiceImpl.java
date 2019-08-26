package kosta.forrest.model.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kosta.forrest.model.board.dao.QnaDAO;
import kosta.forrest.model.board.dto.QnaDTO;

@Service
public class QnaServiceImpl implements QnaService {
	
	@Autowired
	private QnaDAO qnaDAO;
	
	@Override
	public List<QnaDTO> selectAll() {
		return qnaDAO.selectAll();
	}

	@Override
	public QnaDTO selectByNo(int qnaNo) {
		return qnaDAO.selectByNo(qnaNo);
	}
	
//	@Override
//	public List<QnaDTO> selectBySearch(String keyWord, String keyField) {
//		List<QnaDTO> list =  qnaDAO.selectBySearch(keyWord, keyField);
//		return list;
//	}



//	@Override
//	public int qnaInsert(QnaDTO qnaDTO) {
//		int result = qnaDAO.qnaInsert(qnaDTO);
//		if(result==0) throw new RuntimeException("������ ��ϵ��� �ʾҽ��ϴ�.");
//		return result;
//	}
//
//	@Override
//	public int answerUpdate(QnaDTO qnaDTO) {
//		int result =  qnaDAO.answerUpdate(qnaDTO);
//		if(result==0) throw new RuntimeException("�亯�� ��ϵ��� �ʾҽ��ϴ�.");
//		return result;
//	}
//
//	@Override
//	public int qnaUpdate(QnaDTO qnaDTO) {
//		int result =  qnaDAO.qnaUpdate(qnaDTO);
//		if(result==0) throw new RuntimeException("�������� �ʾҽ��ϴ�.");
//		return result;
//	}
//
//	@Override
//	public int qnaDelete(int qnaNo) {
//		int result = qnaDAO.qnaDelete(qnaNo);
//		if(result==0) throw new RuntimeException("�������� �ʾҽ��ϴ�.");
//		return result;
//	}

}
