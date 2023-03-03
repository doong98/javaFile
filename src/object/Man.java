package object;

public class Man {
	int age;
	String name;
	boolean isMarried;
	int children;
	
	//메서드 생성
	public String getAge() {
		return "그 분의 나이는 "+age+"입니다.";
	}
	public String getName() {
		return "그 분의 이름은 "+name+"입니다.";
	}
	public String getIsMarried() {
		return "그 분은 결혼 하셔서 "+isMarried+"입니다.";
	}
	public String getChildren() {
		return "그 분은 자녀가 "+children+"명 있습니다.";
	}
	
	public static void main(String[] args) {
		//Man 설계도를 기반으로 한 인스턴스 생성
		Man man=new Man();
		man.age=40;
		man.name="James";
		man.isMarried=true;
		man.children=3;
		//man인스턴스의 멤버변수의 값을 콘솔에 출력
		System.out.println(man.age);
		System.out.println(man.name);
		System.out.println(man.isMarried);
		System.out.println(man.children);
		//man인스턴스의 메서드를 호출
		System.out.println(man.getAge());
		System.out.println(man.getName());
		System.out.println(man.getIsMarried());
		System.out.println(man.getChildren());

	}

}
