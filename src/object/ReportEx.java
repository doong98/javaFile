package object;

public class ReportEx {
	String name;
	String depart;
	int kor;
	int eng;
	int mat;
	
	//메서드
	public String getName() {
		return name;
	}
	public String getDepart() {
		return depart;
	}
	//세 과목의 점수의 합을 구하는 메서드
	public int getTotal() {
		//total은 getTotal함수 내에서만 사용 가능한 지역변수
		int total=kor+eng+mat;
		return total;
	}
	//세 과목의 점수의 평균을 구하는 메서드
	public float getAvg() {
		float avg=(float)(kor+eng+mat)/3.0F;
		return avg;
	}
	//세 과목의 점수의 평균이 60점 이상이면 '이수', 아니면 '미이수' 구하는 메서드
	public String getComplete() {
		float avg=(float)(kor+eng+mat)/3.0F;
		String res;
		if (avg>=60) {
			res="이수";
		}else {
			res="미이수";
		}
		return res;		
	}
	
	public static void main(String[] args) {
		//클래스 ReportEx를 사용한 인스턴스 생성
		ReportEx sdt=new ReportEx();
		//sdt인스턴스의 변수에 값을 입력
		sdt.name="박명수";
		sdt.depart="수학과";
		sdt.kor=80;
		sdt.eng=70;
		sdt.mat=60;
		
		//멤버변수의 값을 출력
		System.out.println("학생 이름 : "+sdt.getName());
		System.out.println("학생 학과 : "+sdt.getDepart());
		System.out.println("국어 점수 : "+sdt.kor);
		System.out.println("영어 점수 : "+sdt.eng);
		System.out.println("수학 점수 : "+sdt.mat);
		System.out.println("총점 : "+sdt.getTotal());
		System.out.println("총점 : "+sdt.getAvg());
		System.out.println("총점 : "+sdt.getComplete());
		
		//다른 인스턴스 생성
		ReportEx universe=new ReportEx();
		universe.name="서장훈";
		universe.depart="체육학과";
		universe.kor=80;
		universe.eng=40;
		universe.mat=50;
		//멤버변수의 값을 출력
		System.out.println("학생 이름 : "+universe.getName());
		System.out.println("학생 학과 : "+universe.getDepart());
		System.out.println("국어 점수 : "+universe.kor);
		System.out.println("영어 점수 : "+universe.eng);
		System.out.println("수학 점수 : "+universe.mat);
		System.out.println("총점 : "+universe.getTotal());
		System.out.println("총점 : "+universe.getAvg());
		System.out.println("총점 : "+universe.getComplete());
	}

}
