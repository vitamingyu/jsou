package pack4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// collection : 객체를 담을 수 있는 기억장소
// Set, List, Map 타입 ...
public class Test39SetTest {

	public static void main(String[] args) {
		// Set type : 중복 불가, 순서 X
		// 참고 Collection클래스<Generic> : Generic은 Collection에 저장할 객체의 타입을 제한
		//HashSet<Object> list = new HashSet<Object>(); //제네릭을 생략하면 오브젝이라 다 받아. 보통 제네릭에 타입을 줘서 제한하는 편
		HashSet<String> list = new HashSet<String>();

		list.add("kor");
		// list.add(1.3)object니까 어떤 객체든 다 받아
		list.add("mat");
		list.add("eng");
		list.add("kor");
		System.out.println(list.size()); //배열의 크기를 .length로 알듯이 이건 size로 파악
		list.remove("eng");
		System.out.println(list.size()); //kor중복이라 안되는데 뭐라 설명했더라
		System.out.println(list);
		System.out.println(list.toArray());  //주소가 떨어짐
		System.out.println("------------");
		print(list.toArray()); // 34번으로
		System.out.println("------------");
		print(list); //44번으로

	}
	
	public static void print(Object[] obj) {
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
		
		for(Object ob:obj) {
			System.out.println(ob);
		}
	}

	public static void print(Set set) { //Set뒤에 <E>제너릭 생략함
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			String str=(String)iter.next();
			System.out.println(str);
			
		}
	}
}
