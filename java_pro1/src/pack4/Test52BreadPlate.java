package pack4;

public class Test52BreadPlate {
	private int breadCount = 0; // 스레드 간 공유 대상
	
	public Test52BreadPlate() {
		
	}
	
	public synchronized void makeBread() {
		if(breadCount >= 10) {
			try {
				System.out.println("빵 생산 초과");
				wait(); // 스레드의 비활성화				
			} catch (Exception e) {
				
			}
		}
		breadCount++; // 빵 생산
		notify(); // 스레드를 활성화
		System.out.println("빵 생산 후 개수 : "+ breadCount + "개");
	}
	
	public synchronized void eatBread() {
		if(breadCount < 1) {
			try {
			System.out.println("먹을 빵이 없어 대기중 ...");
			wait();
		} catch(Exception e) {
			}
		}
		breadCount--; // 빵 소비
		System.out.println("빵 소비 후 개수 : "+ breadCount + "개");
	}
	
	
	
}
