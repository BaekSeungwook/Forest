package kosta.forrest.model.user.dao;

import java.util.List;

import kosta.forrest.model.user.dto.UserDTO;

public interface UserDAO {

	List<String> getAddressList();

	List<UserDTO> findUserListByAddress(String address);

	UserDTO login(UserDTO userDTO);

	int getUserCount();

	void updateUser(UserDTO userDTO);

	void registerUser(UserDTO userDTO);

	String idcheck(String id);

	UserDTO findUserById(String id);

	UserDTO loginConfirm(String id, Object pwd);
	
	/* ���ڵ� ��ü �˻� */
	List<UserDTO> selectAll();

	/* ȸ�����̵� �ش��ϴ� ���ڵ� �˻� */
	UserDTO selectByUserId(String userId);

	/* ���ڵ� ���� */
	int insert(UserDTO userDTO);

	/* ȸ�����̵� �ش��ϴ� ���ڵ� ���� */
	int delete(String userId);

	/* ȸ�����̵� �ش��ϴ� ���ڵ� ���� */
	int update(UserDTO userDTO);

}
