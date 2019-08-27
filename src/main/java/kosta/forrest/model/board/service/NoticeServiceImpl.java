package kosta.forrest.model.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kosta.forrest.model.board.dao.NoticeDAO;
import kosta.forrest.model.board.dto.NoticeDTO;



@Service
public class NoticeServiceImpl implements NoticeService{
	
	@Autowired
	private NoticeDAO noticeDAO;

	@Override
	public List<NoticeDTO> selectAll(String option, String keyWord) {
		return noticeDAO.selectAll(option, keyWord);
	}
	
	
	@Override
	public int insert(NoticeDTO noticeDTO) {
		int result = noticeDAO.insert(noticeDTO);
		if(result==0)throw new RuntimeException("��ϵ��� �ʾҽ��ϴ�.");
		return result;
	}


	@Override
	public NoticeDTO selectByNoticeNo(int noticeNo, boolean b) {
		if(b) {
			int result = noticeDAO.readnumUpdate(noticeNo);
			if(result==0)throw new RuntimeException("��ȸ������ ������ �����Ͽ����ϴ�.");
		}
		
		NoticeDTO NoticeDTO =noticeDAO.selectByNoticeNo(noticeNo);
		if(NoticeDTO==null)throw new RuntimeException("�Խù� �˻��� ������ �߻��߽��ϴ�.");
		return NoticeDTO;
	}


	@Override
	public int update(NoticeDTO noticeDTO) {
		int result = noticeDAO.update(noticeDTO);
		if(result==0)throw new RuntimeException("�������� �ʾҽ��ϴ�.");
		return result;
	}
	
	
	@Override
	public int delete(int noticeNo) {
		int result = noticeDAO.delete(noticeNo);
		if(result==0)throw new RuntimeException("�������� �ʾҽ��ϴ�.");
		return result;
	}

}