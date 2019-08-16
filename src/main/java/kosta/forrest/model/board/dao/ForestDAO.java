package kosta.forrest.model.board.dao;

import java.util.List;

import kosta.forrest.model.board.dto.ForestDTO;

public interface ForestDAO{

	/**
	 * ? μ½λ ? μ²? κ²??
	 * */
	List<ForestDTO> selectAll() ;

	/**
	 * λͺ¨λΈλ²νΈ? ?΄?Ή?? ? μ½λ κ²??
	 * */
	ForestDTO selectByForestNo(int forestNo) ;
	
	/**
	 * ?΄?λ¦Όμ΄λ¦?, μ£Όμλ³? κ²??
	 * */
	public List<ForestDTO> selectBySearch(String keyWord, String keyField) ;

	/**
	 * ? μ½λ ?½?
	 * */
	int insert(ForestDTO forestDTO);

	/**
	 * λͺ¨λΈλ²νΈ? ?΄?Ή?? ? μ½λ ?­? 
	 * */
	int delete(int forestNo);

	/**
	 * λͺ¨λΈλ²νΈ? ?΄?Ή?? ? μ½λ ?? 
	 * */
	int update(ForestDTO forestDTO);

}
