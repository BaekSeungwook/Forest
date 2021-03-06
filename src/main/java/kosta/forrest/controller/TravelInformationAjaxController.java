package kosta.forrest.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kosta.forrest.model.board.dto.FestivalDTO;
import kosta.forrest.model.board.dto.ForestDTO;
import kosta.forrest.model.board.dto.SightsDTO;
import kosta.forrest.model.board.dto.VideoDTO;
import kosta.forrest.model.board.service.TravelInformationService;


@RestController
public class TravelInformationAjaxController
{
	@Autowired
	private TravelInformationService service;
	
	@RequestMapping(value = "/travelInformationAjax/forest", produces = {"application/json;charset=UTF-8"})
	public List<ForestDTO> selectForestByCity(String city)
	{
		return service.selectForestByCity(city);
	}
	
//	@RequestMapping(value = "/travelInformationAjax/forestInit", produces = {"application/json;charset=UTF-8"})
//	public List<ForestDTO> selectForest()
//	{
//		for(ForestDTO dto : service.selectForest())
//		{
//			System.out.println(dto);
//		}
//		
//		return service.selectForest();
//	}
	/////////////////////////////////////////////
	@RequestMapping("/sightsInsert")
	public int sightsInsert(SightsDTO dto)
	{
		System.out.println(dto);
		
		return service.insertSights(dto);
	}
	
	@RequestMapping("/festivalInsert")
	public int festivalInsert(FestivalDTO dto)
	{
		System.out.println(dto);
		
		return service.insertFestival(dto);
	}
	@RequestMapping("/videoInsert")
	public int videoInsert(VideoDTO dto)
	{
		System.out.println(dto);
		
		return service.insertVideo(dto);
	}
/////////////////////////////////////////////
	@RequestMapping("/sightsSelect")
	public List<SightsDTO> sightsSelect()
	{
		return service.selectSights();
	}
	@RequestMapping("/festivalSelect")
	public List<FestivalDTO> festivalSelect(){
		return service.selectFestival();
	}
	@RequestMapping("/videoSelect")
	public List<VideoDTO> videoSelect()
	{
		return service.selectVideo();
	}
	/////////////////////////////////////////////
	@RequestMapping("/sightsDelete")
	public int sightsDelete(String sightsName)
	{
		return service.deleteSights(sightsName);
	}
	@RequestMapping("/festivalDelete")
	public int festivalDelete(String festivalName)
	{
		return service.deleteFestival(festivalName);
	}
	@RequestMapping("/videoDelete")
	public int videoDelete(String videoName)
	{
		return service.deleteVideo(videoName);
	}
/////////////////////////////////////////////
	@RequestMapping("/sightsUpdate")
	public int sightsUpdate(SightsDTO dto, String selectedSightsName)
	{
		return service.updateSights(dto, selectedSightsName);
	}
	
	@RequestMapping("/festivalUpdate")
	public int festivalUpdate(FestivalDTO dto, String selectedFestivalName)
	{
		return service.updateFestival(dto, selectedFestivalName);
	}
	
	@RequestMapping("/videoUpdate")
	public int videoUpdate(VideoDTO dto, String selectedVideoName)
	{
		return service.updateVideo(dto, selectedVideoName);
	}
/////////////////////////////////////////////	
	@RequestMapping("/searchImage")
	public String searchImage(String keyword)
	{
		return service.searchImage(keyword);
	}
}
