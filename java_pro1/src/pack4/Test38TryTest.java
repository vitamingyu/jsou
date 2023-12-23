package pack4;

import java.io.FileReader;

//예외처리 - 자바가 외부장치(ex 키보드 ,네트워크 등)와 '연결해서 작업하는 경우' 대처 코드를 작성하도록 강요
//		- 일반 명령문 작업시 에러가 발생할 의심적인 코드가 있을 때도 선택적으로 사용
//try - catch문
//다음은 예외처리를 위한 try, catch문의 기본 구조이다.
//try블록에는 예외발생 가능 코드가 위치하고 만일 코드에 오류가 발생되면,
//오류 종류(예외 클래스)에 맞는 catch문으로 가서 catch블록 안에 있는 코드를 실행 시킨다
//만일 오류가 발생하지 않으면 catch문은 실행하지 않는다
public class Test38TryTest {
	
	public void test() {
		try {
			int [] arr = {1,2,3};
			System.out.println(arr[0]);
			System.out.println(arr[3]);
		} catch (Exception e) {
			System.out.println("test 메소드에서 에러"); //메인에서도 오류가 나겠지만, 지역이 우선 . 예외처리 여기서 함
		}
	}
	
	public static void main(String[] args) {
		//FileReader fr = new FileReader("c:\\work\\abc.txt"); 예외처리를 해주지 않아서 오류가 뜸 unhandled 예외처리 해줘라
		try {
			//int re = 10 / 0; //여기서 3은 계속 변하는 숫자, 외부에서 들어옴. 이때 0이 들어와 에러가 생긴다면..
			int re = 10 / 2;
			System.out.println("re : " + re);
			
			//My my = new My();
			//My my = null;
			//System.out.println(my.imsi);
			
			Test38TryTest trytest = new Test38TryTest();
			trytest.test();
			
		} catch (ArithmeticException e) { //에러 떨어지면 catch로 넘어옴 - 연산에러
			//e.printStackTrace(); 에러메세지 그대로 내보내기
			System.out.println("0으로 나눌 수 없습니다. \n에러메세지 : " + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("객체 참조 에러 : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("나머지 모든 에러 처리 영역 " + e); //굳이 e라고 변수명 안 정해도 되고 e2같은걸로 써도 됨. 굳이 겟메세지도 안 써도 된대
		} finally {
			System.out.println("에러와 상관없이 늘 수행");
		}
			
		System.out.println("응용 프로그램 종료");
		
	}

}
