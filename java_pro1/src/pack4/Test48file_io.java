package pack4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test48file_io {

	public static void main(String[] args) throws Exception {
		// 이진데이터 형식을 파일 입출력
		Test48MyData data = new Test48MyData();
		
		// 이진데이터 형식으로 파일 저장
		File f = new File("c:/work/iotest4.dat");
		//나눠서 주는 방법
		// File dir = new File("c:/work/");
		// File f = new file(dir, "iotest4.dat");
		
		FileOutputStream fo = new FileOutputStream(f); //예외처리 안 하면 오류남 unhandled
		BufferedOutputStream bo = new BufferedOutputStream(fo);
		//fo 대신 18번 뒤에 new 뒤로 복붙해도 됨
		
		ObjectOutputStream oo = new ObjectOutputStream(bo);
		oo.writeObject(data);
		System.out.println("저장 성공");
		oo.close();
		bo.close();
		fo.close();
		//생성의 역순으로 닫기
		
		System.out.println();
		// 여기까지 iotest4.dat로 인코딩해서 파일 만들어줌
		
		
		// 이진데이터 형식으로 파일 읽기
		File f1 = new File("c:/work/iotest4.dat");
		FileInputStream fis = new FileInputStream(f1);
		BufferedInputStream b1 = new BufferedInputStream(fis);
		ObjectInputStream oi = new ObjectInputStream(b1);
		Object obj = oi.readObject();
		Test48MyData myData = (Test48MyData) obj;
		System.out.println(myData.number);
		System.out.println(myData.weight);
		System.out.println(myData.irum);
		System.out.println(myData.juso);
		oi.close();
		b1.close();
		fis.close();
		

	}

}
