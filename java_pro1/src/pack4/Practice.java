package pack4;

public class Practice {
//데이터 전달용
	
	private String major, irum;
	private int jumsu;
	
	public Practice() {
		
	}
	
	public Practice(String major, String irum, int jumsu) {
		this.major = major;
		this.irum = irum;
		this.jumsu = jumsu;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getIrum() {
		return irum;
	}

	public void setIrum(String irum) {
		this.irum = irum;
	}

	public int getJumsu() {
		return jumsu;
	}

	public void setJumsu(int jumsu) {
		this.jumsu = jumsu;
	}
	
	
	
	
}
