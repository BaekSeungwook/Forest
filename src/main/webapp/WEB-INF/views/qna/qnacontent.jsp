<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div>
		<span>
		 ����<input type=text value="">
		</span>
		<span>
		 ��б� ���� <input type=checkbox value="">
		</span>
	</div>
	<div>
		<span>
		�ۼ��� ${dto.userDTO.userName}
		</span>
		<span>
		�޾縲����
		<select name="option" style="float:left">
			<option value="">���������ڿ��޾縲</option>
			<option value="">��ȭ�� �����ڿ��޾縲</option>
			<option value="">�˺����ڿ��޾縲</option>
			<option value="">����ڿ��޾縲</option>
			<option value="">�����ڿ��޾縲</option>
			<option value="">��������ڿ��޾縲</option>
			<option value="">�������ڿ��޾縲</option>
			<option value="">�ڴ����ڿ��޾縲</option>
			<option value="">�����ڿ��޾縲</option>
			<option value="">�񽽻��ڿ��޾縲</option>
			<option value="">������ڿ��޾縲</option>
			<option value="">��õ�ڿ��޾縲</option>
			<option value="">�ȸ鵵�ڿ��޾縲</option>
			<option value="">�����ڿ��޾縲</option>			
		</select>
		</span>	
	</div>
	<div>
		<span>
		 �̸���<input type=text value="">@<input type=text value="">
		 <select name="option" style="float:left">
		 	<option value="">naver.com</option>
			<option value="">daum.net</option>
			<option value="">google.com</option>
			<option value="">hanmail.net</option>
		 </select>
		</span>		
	</div>	
	<div>
		<span>
		����<input type=text placeholer="������ �Է����ּ���">
		</span>
	</div>
	
	<button>���</button>
	<button>���</button>
	
	</div>
</body>
</html>