package pack3;

public class Test25ElecProduct {
	// 전자제품(Radio, Tv)의 부모(= super,조상, parent, 상위)클래스
	private int volume = 0;
	public void volumeControl() {
		// 내용은 적지 않는다. 부모는 추상적이야, 볼륨컨트롤해야돼~ 만 알려주고 구체적으로 적진 않음
		// 자식클래스에서 특성에 맞게 각각 기능을 넣어줌
		// 현재 메소드를 자식 클래스에서 오버라이딩 하길 기대
		// 얘를 오버라이딩 안 하면 실행이 안되도록 하는 것 : 추상메소드
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	//마우스 오른쪽 클릭 - 소스 - 제너레이트 게터/ 세터
	
	
}
