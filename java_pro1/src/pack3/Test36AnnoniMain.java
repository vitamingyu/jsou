package pack3;

public class Test36AnnoniMain {

	public static void main(String[] args) {
		// 내부 무명 클래스(익명)
		Test36Saram saram = new Test36Saram();
		System.out.println(saram.getIr());
		
		Test36Kildong kildong = new Test36Kildong();
		Test36Saram saram2 = kildong.getSaram();
		System.out.println(saram2.getIr());

	}

}
