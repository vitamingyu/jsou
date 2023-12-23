package pack4;

import java.util.ArrayList;

public class Practice2 {
	ArrayList<Practice> list = new ArrayList<Practice>();
	
public void insertData() {
	Practice dtto= new Practice("통계","김민규",100);
	list.add(dtto);
	dtto = new Practice("dd","irumm",90);
	list.add(dtto);
	System.out.println("--------");
	list.clear();
	
	
	Practice dto = null;
	
	dto = new Practice();
	dto.setMajor("static"); 
	dto.setIrum("민규");
	dto.setJumsu(100);
	list.add(dto);
	 
}
	public void showDate() {
		for (int i=0; i<list.size(); i++) {
			Practice dto = new Practice();
			dto = list.get(i);
			System.out.println(dto.getMajor()+dto.getIrum()+dto.getJumsu());
		}
	}
	public static void main(String[] args) {
		Practice2 test = new Practice2();
		test.insertData();
		test.showDate();

	}

}
