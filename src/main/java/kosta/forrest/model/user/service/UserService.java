package kosta.forrest.model.user.service;

import java.util.List;

import kosta.forrest.model.user.dto.AuthorityDTO;
import kosta.forrest.model.user.dto.UserDTO;

public interface UserService {
	
	UserDTO findUserById(String id);

	List<String> getAddressList();

	List<UserDTO> findUserListByAddress(String address);

	UserDTO login(UserDTO userDTO);

	int getUserCount();

	void updateUser(UserDTO userDTO);

	void registerUser(UserDTO userDTO);

	String idcheck(String id);
	
	List<AuthorityDTO> selectAuthorityByUsername(String username);

	/* ���ڵ� ��ü �˻� */
	List<UserDTO> selectAll();

	UserDTO selectByUserId(String userId);

	/* ���ڵ� ���� */
	int insert(UserDTO userDTO);

	/* ����� ���̵� �ش��ϴ� ���ڵ� ���� */
	int delete(String userId);

	/* �𵨹�ȣ�� �ش��ϴ� ���ڵ� ���� */
	int update(UserDTO userDTO);
}
