package pack2;

public class Test14Bank {
	//package의 이해 : 접근지정자 허용범위. 다른 클래스의 멤버 참조하기
	private int money = 1000; // 잔고
	
	int imsi = 1;
	public int imsi2 = 1;
	
	public Test14Bank() {
		// 파라미터 없는 생성자
	}
	public Test14Bank(int money) {
		this.money += money;
	}
	//생성자는 리턴타입을 적지 않음. void관련
	
	public void dePosit(int amount) { // 입금 메소드
		if(amount > 0 ) money += amount; //참값 하나인 경우 중괄호 안해도 됨
	}
	public void  withDraw(int amount) { //출금
		if ((amount > 0) && (money-amount) >=0) {
			money -= amount;
		} else {
			System.out.println("출금액이 너무 많아요");
		}
	}
	//프라이빗을 외부에서 확인 하려면 getter 만들면 됨
	public int getMoney() { //잔금 확인용 메서드
		return money;
		//외부에서 만든거 갖다 쓰려면 라이브러리 확장자 자르로 해야됨
	}
	
}
