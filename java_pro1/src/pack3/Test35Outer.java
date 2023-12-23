package pack3;

// 내부 클래스 : 클래스의 맴버로 클래스를 가질 수 있다.
//특정 클래스 안에서만 사용할 클래스를 선언하고 이를 내부 클래스(inner class)라고 한다.

public class Test35Outer {
	private int a;
	Inner inner;
	
	public Test35Outer() {
	   	System.out.println("Outer생성자");
		 a = 10;
		 inner = new Inner();  // 내부 클래스는 내부 클래스를 감싸고 있는 외부 클래스 내에서 생성한다. 이렇게 권장함.
	}
	
	public void aa() {
		System.out.println("Outer의 맴버 aa 메소드");
		bb();
		// cc(); cc는 내부 클래스에 있기 때문에 그냥은 부를 수 없음.
		inner.cc(); // 내부 클래스의 맴버는 객체변수를 사용
		System.out.println("Outer의 맴버 필드 a:" + a + ", Inner 맴버 필드 kbs:" + inner.kbs);
	}
	
	private void bb() {
		System.out.println("Outer 소속 bb 메소드");
	}
	
	public class Inner { // 내부 클래스
		// public class Inner extends 어쩌구 implements 저쩌구 이런것이 가능함.
		private int kbs;
		
		public Inner() {
			System.out.println("Inner 생성자");
			kbs = 9;
		}
		
		public void cc() {
			System.out.println("cc --------");
			System.out.println("내부 클래스 내에 cc메소드");
			bb(); //Outer의 멤버는 바로 호출 
			System.out.println("Outer의 맴버 필드 a:" + a + ", Inner 맴버 필드 kbs:" + kbs);
		}
		
		// class InnerInner{
		// 내부 클래스 내에 내부 클래스 선언 가능. 비권장
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Test35Outer outer = new Test35Outer();
		outer.aa();
		System.out.println();
		// Inner inner = new Inner(); 내부 클래스라 독립적인 new는 불가
		// Test35Outer.Inner inner = outer.new Inner();  //이렇게는 new가 가능함. 권장은 안함, 되기는 하는데 이렇게 안 쓰거든
		
		//outer.inner.cc(); // 가능은 한데 이렇게 써주진 않음 아우터 밖에서 이너에 대해 언급 잘 안함
		
		
		
		
		
	}

	
	
}
