package object;

public class Order {
	String orderNum;
	String orderId;
	String orderDay;
	String orderName;
	String prodName;
	String address;
	
	public String getOrderNum() {
		return "주문번호 : "+orderNum;
	}
	public String getOrderId() {
		return "주문자 아이디 : "+orderId;
	}
	public String getOrderDay() {
		return "주문 날짜 :"+orderDay;
	}
	public String getOrderName() {
		return "주문자 이름 :"+orderName;
	}
	public String getProdName() {
		return "주문 상품 번호 :"+prodName;
	}
	public String getAddress() {
		return "배송 주소 :"+address;
	}

	public static void main(String[] args) {
		//인스턴스 생성
		Order order = new Order();
		order.orderNum="201803120001";
		order.orderId="abc123";
		order.orderDay="2018년 3월 12일";
		order.orderName="홍길순";
		order.prodName="PD0345-12";
		order.address="서울시 영등포구 여의도동 20번지";
		
		System.out.println(order.orderNum);
		System.out.println(order.orderId);
		System.out.println(order.orderDay);
		System.out.println(order.orderName);
		System.out.println(order.prodName);
		System.out.println(order.address);
		System.out.println();
		System.out.println(order.getOrderNum());
		System.out.println(order.getOrderId());
		System.out.println(order.getOrderDay());
		System.out.println(order.getOrderName());
		System.out.println(order.getProdName());
		System.out.println(order.getAddress());
	}

}
