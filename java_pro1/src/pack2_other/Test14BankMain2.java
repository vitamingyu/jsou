package pack2_other;

import pack2.Test14Bank; // 다른 package의 클래스를 사용하려면 import
//import pack.*; 이걸 하면 전체를 끌어오지만 메모리 낭비가 심해 권장하지 않음 위와 같은 방법을 권장

public class Test14BankMain2 {
	//Test14Bank와 Test14BankMain2은 다른 package에 존재
	//java.lang은 import안 해도 됨. 많이 쓰는거라 다 적용, 그런데 scanner같은건 임포트 해줘야 쓸 수 있음
	
	public static void main(String[] args) {
		
		System.out.println();
		Test14Bank john = new Test14Bank();
		System.out.println("john의 예금액은 " + john.getMoney());
		
		System.out.println();
		//접근 지정자 영향 범위 확인
		//System.out.println("Bank의 private member : " + john.money); private니까 불가
		//System.out.println("Bank의 default member : " + john.imsi); 디폴트는 패키지가 달라서 안됨
		System.out.println("Bank의 public member : " + john.imsi2); //public만 가능. 클래스도 마찬가지
		
		
	}
}
