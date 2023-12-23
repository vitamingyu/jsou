package pack3;

//public class Test30Radio implements Test30InterVol{
public class Test30Radio implements Test30AdvanceVol{
	private int v=0;
	
	@Override 
	public void volOn() {
		System.out.println("라디오 소리 켜기");
	}
	
	@Override
	public void volOff() {
		System.out.println("라디오 소리 끄기");		
	}
	
	@Override
	public void volup(int v) {
		this.v += v;
		System.out.println("라디오 볼륨은 " + this.v); //그냥 v하면 오버라이드 내에 v를 ㅆ기 때문에 this 필수
	}
	
	@Override
	public void voldown(int v) {
		this.v -= v;
		System.out.println("라디오 볼륨은 " + this.v);
	}
		
	//---------------
	public static void main(String[] args) {
		Test30Radio radio = new Test30Radio();
		radio.volOn();
		radio.volup(5);
		radio.voldown(2);
		radio.volOff();
	}
	
}
