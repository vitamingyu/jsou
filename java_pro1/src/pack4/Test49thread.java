package pack4;


public class Test49thread extends Thread {//implements Runnable 이것도 쓸 수 있음 이거는 인터페이스 오버라이드 한거
	public Test49thread(){
		
	}
	
	public Test49thread(String name){
		super(name); //여기 수퍼는 스레드, te1과 te2중에 뭐가 먼저 입력되는지 보려고 써줌
	}

	public void run() { //스레드에 있는 run을 오버라이드 함
		for (int i = 1; i <=50; i++) {
			// System.out.print(i + " ");
			System.out.println(getName() + ":" + i + " ");
			// Runnable 한 경우에는 Thread.currentThread().getName() 한다.
			try {
				Thread.sleep(1000); // 1000하면 1초임, 1초간 스레드 비활성화
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	} //run이 끝나면 사용자 정의 thread가 종료
	
	public static void main(String[] args) throws Exception{ //하나의 process가 하나의 thread(main thread)를 사용하고있음
		//Thread(추상)를 상속받아 처리
		//Test49thread te1 = new Test49thread(); 위에 수퍼 생기기 전 호출 방식, 수퍼하면 아래 방식으로도 가능하다
		//Test49thread te2 = new Test49thread();
		Test49thread te1 = new Test49thread("one");
		Test49thread te2 = new Test49thread("two");
		te1.start(); //start가 run을 호출 => 사용자 정의 thread가 활성화 상태 됨
		te2.start(); // 스레드는 스케줄러가 따로 있다. 일반적으론 te1이 먼저 요청해서 먼저 값을 처리하지만 스케줄러는 sequence하지 않기 때문에 나중에 요청한 te2가 먼저 run될 수 있다.
		//메인스레드에 사용자 스레드 2개해서 총 3개의 스레드가 있음
		
		//te1.setPriority(MAX_PRIORITY); 0부터 10까지 지정가능. 숫자가 클수록 우선순위배정. 대문자에 쓰러졌네 final스태틱이다. 하지만 우선순위가 높아질 확률이 높을 뿐 스케줄러 마음이다
		
		te1.join(); // 외부처리 해주라네
		te2.join(); // te2작업이 끝날 때까지 main thread의 종료를 대기
		
		System.out.println("응용 프로그램 종료");
		
		/*
		Test49thread te1 = new Test49thread();
		Test49thread te2 = new Test49thread();
		te1.run(); // 순차적(sequence)
		te2.run(); // 얘는 te1.run()이 끝나야 실행이 됨.
		*/

	} //메소드 끝, 프로세스 끝. 사용자정의 스레드가 끝나기 전까지 메인스레드 너는 끝나지마 라고 지정할 수 있다 = 조인으로 해줌
}
