package object;

public class Man {
	int age;
	String name;
	boolean isMarried;
	int children;
	
	//�޼��� ����
	public String getAge() {
		return "�� ���� ���̴� "+age+"�Դϴ�.";
	}
	public String getName() {
		return "�� ���� �̸��� "+name+"�Դϴ�.";
	}
	public String getIsMarried() {
		return "�� ���� ��ȥ �ϼż� "+isMarried+"�Դϴ�.";
	}
	public String getChildren() {
		return "�� ���� �ڳడ "+children+"�� �ֽ��ϴ�.";
	}
	
	public static void main(String[] args) {
		//Man ���赵�� ������� �� �ν��Ͻ� ����
		Man man=new Man();
		man.age=40;
		man.name="James";
		man.isMarried=true;
		man.children=3;
		//man�ν��Ͻ��� ��������� ���� �ֿܼ� ���
		System.out.println(man.age);
		System.out.println(man.name);
		System.out.println(man.isMarried);
		System.out.println(man.children);
		//man�ν��Ͻ��� �޼��带 ȣ��
		System.out.println(man.getAge());
		System.out.println(man.getName());
		System.out.println(man.getIsMarried());
		System.out.println(man.getChildren());

	}

}
