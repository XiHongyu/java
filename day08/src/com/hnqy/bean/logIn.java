package com.hnqy.bean;

	/**
	 *�û���¼���ܣ��ж��˻������ʽ
	 */
public class logIn {
	//�ж������˻���ʽ
	private boolean judge(String s){
		String regex="[1-9]\\d{5}";  //������ʽ�����˺Ÿ�ʽ
		if(s.matches(regex)){
			return true;
		}
		return false;
	}
	
	//��¼���  �����˻�����
	public String login(String ID,String pwd){
		if(!judge(ID)){
			return "�˺Ÿ�ʽ����";
		}
		if(ID.equals("234567")&&pwd.equals("123456")){
			return "��½�ɹ�";
		}
		
	return "�˺Ż��������";
	}
	
}
