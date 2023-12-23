package pack1;

public class Test3 {

	public static void main(String[] args ) {
		//논리 연산시 주의사항
		boolean a=false, b=true, c;
		c=a||b;
		System.out.println(c);
		c=a&&b;
		System.out.println(c);
		
		
		System.out.println("------------");
		boolean b1, b2;
		b1=goAbc(); //goAbc로 가. 그러면 걔가 뭘 줄거거든? 그걸 받아와
		//행위를 의미함.a=1 처럼 정적이지 않음. 파이썬엔 펑션이나 메쏘드가 있는데 자바는 메쏘드만 있음
		System.out.println(b1);
		System.out.println(goDef());
		
		
		System.out.println("주의 사항--------");
		System.out.println("or 연산");
		//b2 = goAbc() || goDef(); abc에서 true값 나오니 여기서 끝. abc만 들렀다가 출력하고 끝
		b2 = goDef() || goAbc(); //def갔는데 false라서 출력하고 abc한테 또 들름. 여기서 출력하고 true나오니 끝
		System.out.println(b2);
		System.out.println();
		
		System.out.println("and 연산");
		b2 = goAbc() && goDef();
		b2 = goDef() && goAbc();
		System.out.println(b2);
		
		System.out.println("========");
		b2=goAbc() | goDef(); //필터를 하나만 쓰면 앞에서 작업이 끝나도 둘 다 수행함 and연산자도 마찬가지
		System.out.println(b2);
	}

	public static boolean goAbc() {			//행위(method)를 정의
		System.out.println("goAbc 처리");
		return true; //프린트 출력하고 true를 줌. 다시 위로 가서 b1을 출력하면 true출력함
	}	
	
	public static boolean goDef() {    //객체지향에서 중요한 자원의 재활용. 한번 써두고 필요할 때마다 씀
		System.out.println("goDef 처리");
		return false;
		
	}
}
