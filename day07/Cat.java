/**
 * 
 * 
 * private   ˽�е�  �ؼ���
   private�ؼ����ص㣺private��һ��Ȩ�����η����������γ�Ա�����ͳ�Ա������ �����εĳ�Աֻ���ڱ����з���
         ��װ��private��Ӧ�ã��ѳ�Ա������private���Σ��ṩ��Ӧ��getXxx()��setXxx()����
                      privateֻ�Ƿ�װ��һ����ʽ������˵��װ����˽��
 * 
 * */
//����һ��è��
public class Cat {
	//������private���� �����಻��ֱ�ӷ���   �����ṩsetXxx() getXxx()����
	private String variety;
	private String colour;
	//�ղι���     
	public Cat() {
		super();
		
	}
	//�вι���
	public Cat(String variety, String colour) {
		super();
		this.variety = variety;
		this.colour = colour;
	}
	public String getVariety() {//��ȡƷ��
		return variety;
	}
	public void setVariety(String variety) {//����Ʒ��
		this.variety = variety;
	}
	public String getColour() {//��ȡ��ɫ
		return colour;
	}
	public void setColour(String colour) {//����Ʒ��
		this.colour = colour;
	}
	
	public void cry(){
		System.out.println(colour+variety+"������");
	}
	
	
	
	
}
