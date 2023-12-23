package pack3;

public class Test29James implements Test29Resume{
	// 신입지원자 Tom
	private String irum, junhwa, skill;
	
	public Test29James() {
		
	}
	
	@Override
	public void setIrum(String irum) {
		if(irum.equals(null))
			this.irum="무명";
		else
			this.irum = irum;
	}
	
	@Override
	public void setJunhwa(String junhwa) {
		this.junhwa = junhwa;		
	}
	
	public void setskill(String skill) { //James만 갖고있는 일반(고유)메소드
		this.skill = skill;
	}
	
	@Override
	public void print() {
		//Test29Resume.SIZE = "B5"; 는 final값이기 때문에 오류가 남
		System.out.println("이력서 규격은 " + Test29Resume.SIZE);
		System.out.println("성명은: "+irum + ", 전화번호는 : " + junhwa);
		System.out.println(", 보유기술 : " + skill);
	}
	

	
	
}
