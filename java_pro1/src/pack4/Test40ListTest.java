package pack4;

import java.util.ArrayList;
import java.util.List;

public class Test40ListTest {

	
	
	
	public static void main(String[] args) {
		// list type : 순서가 있고 중복을 허용
		List<String> list = new ArrayList<String>();
		//인터페이스는 new 못해 타입을 만드는거야(그안에 추상메서드가 있던없던)
		//List=인터페이스의 서브 클래스 ArrayList를 통해 new를 한다(?)
		//list는 스트링을 한꺼번에 담아둘 수 있는 그릇
		//ArrayList<String> list = new ArrayList<String>(); //13이랑 같은 말 예전엔 ArrayList대신 vector를 썼다
		list.add("kor"); //값을 넣을 때 add
		list.add("eng");
		list.add("mat");
		list.add("kor");
		System.out.println(list.size()); //배열의 크기를 .length로 알듯이 이건 size로 파악
		list.remove("eng");
		System.out.println(list.size()); //중복 가능이니 순서가 있다(?)
		System.out.println(list);

		System.out.println();
		for (Object a:list) { //향상된 for
			System.out.println(a);
		}
		
		
	}

}
