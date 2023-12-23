package pack2;

public class Test16CallByMain {

	public static void main(String[] args) {
		// 메소드를 통헤 자료 전달시 값 또는 주소가 넘어감
		Test16Call1 my = new Test16Call1();
		Test16Call2 your = new Test16Call2();
		System.out.println("원래 a:" + my.a + ", b:"+my.b);
		your.ex(my.a, my.b); //인수로 기본형을 줌, 값이 전달됩니다
		//매서드 콜로 call2로 넘어감 값만 보냄. 보낸 곳에서의 a,b저장소와 main에서 my.a는 같은 a값을 같고있는 변수 이름만 같지 , 같은 주소가 아님 그래서 아래 출력도 원래 값이 출력
		System.out.println("1. 수행 후 a:" + my.a + ", b:"+my.b);
		System.out.println();
		
		your.ex(my); //인수로 참조형, 주소가 전달
		System.out.println("2. 수행 후 a:" + my.a + ", b:"+my.b);
		System.out.println();
		
		your.ex(my.c); //인수로 참조형(배열) : 주소가 전달
		System.out.println("3. 수행 후 c[0]:" + my.c[0] + ", c[1]:"+my.c[1]);
		
	}

}
