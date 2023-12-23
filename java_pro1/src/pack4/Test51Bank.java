package pack4;

public class Test51Bank {
	private int money = 10000; // 여러 스레드가 공유할 대상
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public synchronized void saveMoney(int save) { // 입금 - syncronized 후 스레드 동기화 됨
		int m = getMoney();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		setMoney(m + save);
	}
	
	public synchronized void minusMoney(int mon) {
		int m = getMoney();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
		setMoney(m - mon);
	}
}
