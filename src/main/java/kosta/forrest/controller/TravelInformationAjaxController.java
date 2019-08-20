package kosta.forrest.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import kosta.forrest.model.board.dto.ForestDTO;
import kosta.forrest.model.board.dto.SightsDTO;
import kosta.forrest.model.board.service.TravelInformationService;
import net.sf.json.JSONArray;


@RestController
public class TravelInformationAjaxController
{
	@Autowired
	private TravelInformationService service;
	
	/**
	 * array�� json ���� ��ȯ�Ͽ� �����ϱ�
	 * :pom.xml ���� jackson-databind lib�� �߰��ϸ�
	 * @Responsebody�� �����ϴ� �ڹٰ�ü�� �˾Ƽ�
	 * json��ȯ���ش�.
	 */
	@RequestMapping(value = "/travelInformationAjax/city", produces = {"application/json;charset=UTF-8"})
	public List<String> selectCity()
	{
		System.out.println("sss");
		return service.selectCity();
	}
	
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
	
	@RequestMapping("/travelInformationAjax/suggest")
	public List<String> selectForestByName(String text)
	{
		return service.selectForestByName(text);//jakson�� ���� json���� ��ȯ�Ǿ� response
	}
	
	@RequestMapping("/sightsInsert")
	public int sightsInsert(SightsDTO dto) {
		System.out.println(dto);
		
		return service.insertSights(dto);
	}
}
