package kosta.forrest.model.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kosta.forrest.model.user.dao.AuthoritiesDAO;
import kosta.forrest.model.user.dao.UserDAO;
import kosta.forrest.model.user.dto.AuthorityDTO;
import kosta.forrest.model.user.dto.UserDTO;
import kosta.forrest.util.Constants;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	@Autowired
	private AuthoritiesDAO authoritiesDAO;
	/*
	 * ��й�ȣ ��ȣȭ�� ���� ��ü�� ���Թ޴´� */
	@Autowired
	private PasswordEncoder passwordEncoder; 
	
	
	@Override
	public UserDTO findUserById(String id) {	 
		return userDAO.findUserById(id);
	}

	@Override
	public List<String> getAddressList() {		
		return userDAO.getAddressList();
	}

	@Override
	public List<UserDTO> findUserListByAddress(String address) {		
		return userDAO.findUserListByAddress(address);
	}

	@Override
	public UserDTO login(UserDTO userDTO) {
		return userDAO.login(userDTO);
	}

	@Override
	public int getUserCount() {
		return userDAO.getUserCount();
	}

	@Override
	public void updateUser(UserDTO userDTO) {
		userDAO.updateUser(userDTO);
	}
	
    @Transactional
	@Override
	public void registerUser(UserDTO userDTO) {
    	//��й�ȣ ��ȣȭ
    	//System.out.println("userDTO.getPassword() : " + userDTO.getUserPwd());
        String encodedPassword = passwordEncoder.encode(userDTO.getUserPwd());
        //System.out.println("encodedPassword : " + encodedPassword);
        userDTO.setUserPwd(encodedPassword);
        userDAO.registerUser(userDTO);
		
		//���ѵ��
		/*AuthorityDTO authority = new AuthorityDTO(userDTO.getuserId(),"ROLE_MEMBER");
		userDAO.registerRole(authority);*/
		authoritiesDAO.insertAuthority(new AuthorityDTO(userDTO.getUserId(), Constants.ROLE_MEMBER));
		if(userDTO.getUserGrade().equals("1")) { //���� �κ��� user_type���� userGrade�� ����
			authoritiesDAO.insertAuthority(new AuthorityDTO(userDTO.getUserId(), Constants.ROLE_ADMIN));
		}
	}

	@Override
	public String idcheck(String id) {
		String count = userDAO.idcheck(id); 
		return (count == null) ? "ok" : "fail"; 	
	}

	@Override
	public List<AuthorityDTO> selectAuthorityByUsername(String username) {
		return authoritiesDAO.selectAuthorityByUserName(username);
	}
	
	////////////////////////////// ������
	@Override
	public List<UserDTO> selectAll() {
		List<UserDTO> userList = userDAO.selectAll();
	if(userList.isEmpty()) throw new RuntimeException("ȸ�� ����Ʈ�� �������� �ʽ��ϴ�.");
	else return userList;
	}

	@Override
	@Transactional  //�޼ҵ� ���� �����ϸ� �ش� �޼ҵ常 PointCut�� �ȴ�. -> ���ܰ� �߻����� �� �˾Ƽ� commit/rollback ó�� ���ش�.
	public UserDTO selectByUserId(String userId) {
		UserDTO userDTO = userDAO.selectByUserId(userId);
		if(userDTO == null) throw new RuntimeException(userId + "�� �ش��ϴ� ������ �����ϴ�.");
		else return userDTO;
	}

	@Override
	public int insert(UserDTO userDTO) {
		int result = userDAO.insert(userDTO);
		if(result == 0) throw new RuntimeException("ȸ���� ��ϵ��� �ʾҽ��ϴ�.");
		return result;
	}

	@Override
	public int delete(String userId) {
		int result = userDAO.delete(userId);
		if(result == 0) throw new RuntimeException("���� �߻�! �������� �ʾҽ��ϴ�.");
		return result;
	}

	@Override
	public int update(UserDTO userDTO) {
		System.out.println("update userId?" + userDTO.getUserId());
		
		 
		int result = userDAO.update(userDTO);
		if(result == 0) throw new RuntimeException("���� �߻�! �������� �ʾҽ��ϴ�.");
		return result;
	}


}
