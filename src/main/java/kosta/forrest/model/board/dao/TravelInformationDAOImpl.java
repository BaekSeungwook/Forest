package kosta.forrest.model.board.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kosta.forrest.model.board.dto.FestivalDTO;
import kosta.forrest.model.board.dto.ForestDTO;
import kosta.forrest.model.board.dto.SightsDTO;
import kosta.forrest.model.board.dto.VideoDTO;

@Repository
public class TravelInformationDAOImpl implements TravelInformationDAO
{
	@Autowired
	private SqlSession session;
	
////////////////////////////////////////////////////////////////////////	
	@Override
	public List<String> selectCity()
	{
		
		List<String> list = new ArrayList<String>();
		list = session.selectList("travelInformationMapper.selectCity");
		
		return list;
	}
////////////////////////////////////////////////////////////////////////
	@Override
	public List<ForestDTO> selectForestByCity(String city)
	{
		List<ForestDTO> list = new ArrayList<ForestDTO>();
		list = session.selectList("travelInformationMapper.selectForestByCity", city);
		
		return list;
	}
	
	@Override
	public List<String> selectForestByName(String text)
	{
		List<String> list = new ArrayList<String>();
		list = session.selectList("travelInformationMapper.selectForestByName", text);
		return list;
	}
	@Override
	public List<ForestDTO> selectForest()
	{
		List<ForestDTO> list = new ArrayList<ForestDTO>();
		list = session.selectList("travelInformationMapper.selectForest");
		return list;
	}
////////////////////////////////////////////////////////////////////////
	@Override
	public int insertSights(SightsDTO dto)
	{
		return session.insert("travelInformationMapper.insertSights", dto);
	}
	@Override
	public int insertFestival(FestivalDTO dto)
	{
		return session.insert("travelInformationMapper.insertFestival", dto);
	}
	@Override
	public int insertVideo(VideoDTO dto)
	{
		return session.insert("travelInformationMapper.insertVideo", dto);
	}
////////////////////////////////////////////////////////////////////////	
	@Override
	public List<SightsDTO> selectSights()
	{
		List<SightsDTO> list = new ArrayList<SightsDTO>();
		list = session.selectList("travelInformationMapper.selectSights");
		
		return list;
	}
	
	@Override
	public List<FestivalDTO> selectFestival()
	{
		List<FestivalDTO> list = new ArrayList<FestivalDTO>();
		list = session.selectList("travelInformationMapper.selectFestival");
		
		return list;
	}
	
	@Override
	public List<VideoDTO> selectVideo()
	{
		List<VideoDTO> list = new ArrayList<VideoDTO>();
		list = session.selectList("travelInformationMapper.selectVideo");
		return list;
	}
////////////////////////////////////////////////////////////////////////
	@Override
	public int deleteSights(String sightsName)
	{
		return session.delete("travelInformationMapper.deleteSights", sightsName);
	}
	@Override
	public int deleteFestival(String festivalName)
	{
		return session.delete("travelInformationMapper.deleteFestival", festivalName);
	}
	@Override
	public int deleteVideo(String videoName)
	{
		return session.delete("travelInformationMapper.deleteVideo", videoName);
	}
////////////////////////////////////////////////////////////////////////
	@Override
	public int updateSights(Map<String, Object> map) {
		
		return session.update("travelInformationMapper.updateSights", map);
	}
	
	@Override
	public int updateFestival(Map<String, Object> map) {
		
		return session.update("travelInformationMapper.updateFestival", map);
	}
	
	@Override
	public int updateVideo(Map<String, Object> map) {
		
		return session.update("travelInformationMapper.updateVideo", map);
	}
}
