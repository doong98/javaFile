package object;

public class TicketEx {
	//멤버변수
	private String name;
	int age;
	String grade;
	String place;
	//메서드(기능을 하는 명령어의 모음:함수)
	//보통 값을 얻어오는 함수는 get을 붙이고, 값을 설정하는 함수는 set을 붙임
	//void : return 값이 없음.
	public void getName() {
		 System.out.println("이름:"+name);
	}
	public int getAge() {
		return age;
	}
	//연령이 14세 이상이면 '관람가능', 아니면 '관람불가' 출력하는 메서드
	public String ageShow() {
		String show="";
		if(age>=14) {
			show="관람가능";
		}else {
			show="관람불가";
		}
		return show;
	}
	public String getGrade() {
		return grade;
	}
	//등급에 따른 가격을 책정하는 메서드
	public int priceDecide() {
		int price=0;
		switch(grade) {
			case "VIP석": price=160000;
			              break;
			case "R석": price=140000;
			            break;
			case "S석": price=110000;
			            break;
			case "A석": price=80000;
			            break;
			default:price=0;		 
		}
		return price;
	}
	public String getPlace() {
		return place;
	}
	//나이가 14세 이상이면 장소 출력하고, 나이가 14세 미만이면 장소에 "없음"출력
	public String placeShow() {
		String placeshow="";
		if(age>=14) {
			placeshow="샤롯데씨어터";
		}else {
			placeshow="장소 없음";
		}
		return placeshow;
	}
	
	
	
	
	public static void main(String[] args) {
		//인스턴스 생성
		TicketEx ticket=new TicketEx();
		TicketEx interpark=new TicketEx();
		ticket.name="김또바";
		ticket.age=29;
		ticket.grade="S석";
		ticket.place="샤롯데씨어터";
		
		interpark.name="유재석";
		interpark.age=13;
		interpark.grade="";
		interpark.place="";
		
		//System.out.println("이름:"+ticket.getName());
		ticket.getName();
		System.out.println("나이:"+ticket.getAge()+"세("+ticket.ageShow()+")");
		System.out.println("가격:"+ticket.getGrade()+"-"+ticket.priceDecide()+"원");
		System.out.println("장소:"+ticket.placeShow());
		
		System.out.println("==========================");
		//System.out.println("이름:"+interpark.getName());
		System.out.println("나이:"+interpark.getAge()+"세("+interpark.ageShow()+")");
		System.out.println("가격:"+interpark.getGrade()+"-"+interpark.priceDecide()+"원");
		System.out.println("장소:"+interpark.placeShow());	

	}

}
