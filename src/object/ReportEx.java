package object;

public class ReportEx {
	String name;
	String depart;
	int kor;
	int eng;
	int mat;
	
	//�޼���
	public String getName() {
		return name;
	}
	public String getDepart() {
		return depart;
	}
	//�� ������ ������ ���� ���ϴ� �޼���
	public int getTotal() {
		//total�� getTotal�Լ� �������� ��� ������ ��������
		int total=kor+eng+mat;
		return total;
	}
	//�� ������ ������ ����� ���ϴ� �޼���
	public float getAvg() {
		float avg=(float)(kor+eng+mat)/3.0F;
		return avg;
	}
	//�� ������ ������ ����� 60�� �̻��̸� '�̼�', �ƴϸ� '���̼�' ���ϴ� �޼���
	public String getComplete() {
		float avg=(float)(kor+eng+mat)/3.0F;
		String res;
		if (avg>=60) {
			res="�̼�";
		}else {
			res="���̼�";
		}
		return res;		
	}
	
	public static void main(String[] args) {
		//Ŭ���� ReportEx�� ����� �ν��Ͻ� ����
		ReportEx sdt=new ReportEx();
		//sdt�ν��Ͻ��� ������ ���� �Է�
		sdt.name="�ڸ��";
		sdt.depart="���а�";
		sdt.kor=80;
		sdt.eng=70;
		sdt.mat=60;
		
		//��������� ���� ���
		System.out.println("�л� �̸� : "+sdt.getName());
		System.out.println("�л� �а� : "+sdt.getDepart());
		System.out.println("���� ���� : "+sdt.kor);
		System.out.println("���� ���� : "+sdt.eng);
		System.out.println("���� ���� : "+sdt.mat);
		System.out.println("���� : "+sdt.getTotal());
		System.out.println("���� : "+sdt.getAvg());
		System.out.println("���� : "+sdt.getComplete());
		
		//�ٸ� �ν��Ͻ� ����
		ReportEx universe=new ReportEx();
		universe.name="������";
		universe.depart="ü���а�";
		universe.kor=80;
		universe.eng=40;
		universe.mat=50;
		//��������� ���� ���
		System.out.println("�л� �̸� : "+universe.getName());
		System.out.println("�л� �а� : "+universe.getDepart());
		System.out.println("���� ���� : "+universe.kor);
		System.out.println("���� ���� : "+universe.eng);
		System.out.println("���� ���� : "+universe.mat);
		System.out.println("���� : "+universe.getTotal());
		System.out.println("���� : "+universe.getAvg());
		System.out.println("���� : "+universe.getComplete());
	}

}
