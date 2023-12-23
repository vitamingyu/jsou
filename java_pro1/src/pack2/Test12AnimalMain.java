package pack2;

public class Test12AnimalMain {

	public static void main(String[] args) {
		Test12Animal tiger= new Test12Animal();
		tiger.display();
		tiger.display(22);
		//하나의 클래스에 두개의###. 파라미터가 다르면 가능
		//tiger.display(int age)는 age에 넣으라는게 아니야
		//정수를 넣어. 이 말임. 정수를 넣는데 그게 age면 좋겠다
		tiger.display("호랑이");
		tiger.display(25, "호랭이");
		tiger.display("호돌이", 30);
		System.out.println();
		
		Test12Animal hen = new Test12Animal(2, "암탉");
		
		hen.showData();
		
		System.out.println();
		Test12Animal dog = new Test12Animal(4);
		dog.showData();
		dog.display(3, "나는 개라고 해");
		dog.showData(); // 왼쪽에서 this로 차별함
		
		System.out.println();
		Test12Animal wolfdog = new Test12Animal();
		wolfdog.showData();
		
//		클래스에 맴버필드에 값을 주는 법 3가지
//		private String name = "강아지"; 초기값으로 처음부터 준 경우
//		생성자를 통해 바꿀 수도 있따.
//		초기값 있지만 메소드를 줘서 중간에 바꿀 수 있다.
		
	}

}
