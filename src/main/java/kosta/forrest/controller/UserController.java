package kosta.forrest.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import kosta.forrest.model.user.dto.UserDTO;
import kosta.forrest.model.user.service.UserService;

@Controller
//@RestController --> ResponseBody�� ���� �־ �̰� ������ �񵿱�ȭ ����� �� ����Ѵ�.
public class UserController {

	@Autowired
	private UserService userService;
	
	//ȸ������������ ��й�ȣ <��ȣȭó��>�� ���� ��ü�� ���Թ޴´�
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
		
	/*//ȸ�� �����ϱ� :: redirect ���
	 * @RequestMapping("/registerMember") 
	 * public String insertUser(UserDTO userDTO) { 
	 * 		return "redirect:/";
	 * }*/
	
	//ȸ������ ��
	@RequestMapping("/registerForm")
	public String registerForm() {
		return "user/registerForm";
	}
	
	//�����ϰ� ������ ���� Ȯ���ϴ� ������
	@RequestMapping("/registerUser") 
	public String registerUser(UserDTO userDTO) {
		//ModelAndView mv = new ModelAndView();
		userService.registerUser(userDTO);
		//mv.addObject("userDTO", userDTO);//���� ȭ�鿡�� ���� ���� registerUserȭ�鿡�� ���� ��� �� �������ֱ� ���ؼ� addObject ����("userDTO", userDTO);
		//mv.setViewName("board/home");
		return "board/home";
	}

	//�α��� ��
	@RequestMapping("/loginForm")
	public String loginForm() { 
		return "user/loginForm";
	}
	
	//ȸ�� �˻� ��
	/*@RequestMapping("findUserByIdForm")
	public ModelAndView findIdUser(String userId) {
		ModelAndView mv = new  ModelAndView();
		UserDTO userDTO = userService.findUserById(userId);
		mv.addObject("userDTO", userDTO);
		mv.setViewName("user/findUserResult");
		return mv;
	} */
	
	//Ư�� ȸ�� �˻��ϱ�
	@RequestMapping("user/findUser")
	public ModelAndView findUser(HttpServletRequest request) {
		String userId = request.getParameter("userId");
		System.out.println(userId);
		UserDTO userDTO = userService.findUserById(userId);
		return new ModelAndView("user/findUserResult", "userDTO", userDTO);
	}
	
	/*
	 * //������ �������� ���� ȸ�� ��� �ľ��ϱ�
	 * 
	 * @RequestMapping("admin/enterCafe") public ModelAndView adminWelcome() {
	 * return new ModelAndView("admin/main", "count", userService.getUserCount()); }
	 */
	
	//���̵� �ߺ�Ȯ��
	@RequestMapping("/idcheckAjax")  
	@ResponseBody
	public String idCheckAjax(HttpServletRequest request) {
		return userService.idcheck(request.getParameter("id"));
	}
	
	//�ּ� ������ �˻� :: select form
	@RequestMapping("user/addressList")
	public ModelAndView addressList() {
		System.out.println("addressList");
		return new ModelAndView("user/addressList", "list", userService.getAddressList());
	}
	
	@RequestMapping("findUserListByAddress")
	@ResponseBody
	public List<UserDTO> findUserListByAddress(HttpServletRequest request) { //?address
		List<UserDTO> list = userService.findUserListByAddress(request.getParameter("address"));
		System.out.println("list = " + list);
		return list;
	}
	
	//ȸ������ ���� ������
	@RequestMapping("user/updateForm") 
	public String updateForm() {
		return "user/updateForm";
	}
	
	/* Authentication�� ����ó�� ��� �����صθ� �α׾ƿ� �� �� ������ ��� ����, �׷���  ȸ������ ���� �� ������ ������ Authentication �� �ִ� ������ ����ġ �� �� �� ������ ��ġ�����ֱ� ���ؼ�
	  �ؿ��� ���� set ���� �ٲ���� �ȴ�. */ 
	@RequestMapping("updateUserAction")
	public ModelAndView updateUserAction(HttpServletRequest request, UserDTO userDTO) {
		System.out.println("1. UserDTO  :: " + userDTO);
		//ȸ������ �������� Spring Security ���� ȸ�������� ��ȯ�޴´�
		UserDTO userDto = (UserDTO)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		/* ObjectType���� principal �� �����µ�, ��¥�� ����ִ� ���� UserDTO --- userAuthenticationProvider�� 
		return new UsernamePasswordAuthenticationToken(dto, null, authList); �� dto �ε�...*/
		
		System.out.println("2. Spring Security ���� ���� �� ȸ������:" + userDto);
		
		//������ ��й�ȣ�� ��ȣȭ�Ѵ� 
		String encodePassword = passwordEncoder.encode(userDTO.getUserPwd());
		userDTO.setUserPwd(encodePassword);
		userService.updateUser(userDTO);
		
		System.out.println("**********************************************");
		// ������ ȸ�������� Spring Security ���� ȸ�������� ������Ʈ�Ѵ� / 
		userDto.setUserPwd(encodePassword);
		userDto.setUserName(userDTO.getUserName());
		userDto.setUserAddr(userDTO.getUserAddr());
		System.out.println("3. Spring Security ���� ���� �� ȸ������ : " + userDto);
				
		return new ModelAndView("user/updateResult"); //���� updateResult ȭ�� ���� ��� �ʿ� ������ ��� ó������?
	}
	
}













