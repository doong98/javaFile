package object;

public class TicketEx {
	//�������
	private String name;
	int age;
	String grade;
	String place;
	//�޼���(����� �ϴ� ��ɾ��� ����:�Լ�)
	//���� ���� ������ �Լ��� get�� ���̰�, ���� �����ϴ� �Լ��� set�� ����
	//void : return ���� ����.
	public void getName() {
		 System.out.println("�̸�:"+name);
	}
	public int getAge() {
		return age;
	}
	//������ 14�� �̻��̸� '��������', �ƴϸ� '�����Ұ�' ����ϴ� �޼���
	public String ageShow() {
		String show="";
		if(age>=14) {
			show="��������";
		}else {
			show="�����Ұ�";
		}
		return show;
	}
	public String getGrade() {
		return grade;
	}
	//��޿� ���� ������ å���ϴ� �޼���
	public int priceDecide() {
		int price=0;
		switch(grade) {
			case "VIP��": price=160000;
			              break;
			case "R��": price=140000;
			            break;
			case "S��": price=110000;
			            break;
			case "A��": price=80000;
			            break;
			default:price=0;		 
		}
		return price;
	}
	public String getPlace() {
		return place;
	}
	//���̰� 14�� �̻��̸� ��� ����ϰ�, ���̰� 14�� �̸��̸� ��ҿ� "����"���
	public String placeShow() {
		String placeshow="";
		if(age>=14) {
			placeshow="���Ե�������";
		}else {
			placeshow="��� ����";
		}
		return placeshow;
	}
	
	
	
	
	public static void main(String[] args) {
		//�ν��Ͻ� ����
		TicketEx ticket=new TicketEx();
		TicketEx interpark=new TicketEx();
		ticket.name="��ǹ�";
		ticket.age=29;
		ticket.grade="S��";
		ticket.place="���Ե�������";
		
		interpark.name="���缮";
		interpark.age=13;
		interpark.grade="";
		interpark.place="";
		
		//System.out.println("�̸�:"+ticket.getName());
		ticket.getName();
		System.out.println("����:"+ticket.getAge()+"��("+ticket.ageShow()+")");
		System.out.println("����:"+ticket.getGrade()+"-"+ticket.priceDecide()+"��");
		System.out.println("���:"+ticket.placeShow());
		
		System.out.println("==========================");
		//System.out.println("�̸�:"+interpark.getName());
		System.out.println("����:"+interpark.getAge()+"��("+interpark.ageShow()+")");
		System.out.println("����:"+interpark.getGrade()+"-"+interpark.priceDecide()+"��");
		System.out.println("���:"+interpark.placeShow());	

	}

}
