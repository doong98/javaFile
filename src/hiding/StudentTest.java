package hiding;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee=new Student();
		//private�� ������ ��������� ������ �� ����.(����)
		//studentLee.studentName="������";
		
		//���� ������ �������(��������)
		studentLee.grade=70;
		studentLee.address="��⵵";
		//�޼��忡�� ���ٰ�����.(public���� ����)
		System.out.println(studentLee.getStudentName("������"));
	}

}
