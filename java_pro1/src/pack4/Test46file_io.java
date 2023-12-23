package pack4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Test46file_io {
	// file i/0 연습
	// 1byte 단위로 데이터 입출력 : 문자, 그림, 소리 등의 미디어 파일 등 다양한 종류의 데이터 처리 가능
	public void writeFile(File file, ArrayList<String> strList ) {
		try {
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
			
			for(String s:strList) {
				writer.write(s, 0, s.length());
				writer.newLine(); //17번 찍고 다음으로 넘어가 = line skip
			}
			writer.close();
		} catch (Exception e) {
			System.out.println("writeFile err : " + e.getMessage());
		}
	}
	
	public void readFile(File file) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			String oneline;
			String ss = null;
			StringBuffer sbuffer = new StringBuffer(); // 문자열 더하기를 대신해주는 클래스
			while ( (oneline = reader.readLine()) !=null) { //null(=자료를 못 읽음)아닌 경우에만 작업
				// ss = ss + oneline; 자바는 문자열 더하기를 연속적으로 하는 것을 비권장
				sbuffer.append(oneline + "\n");
			}
			reader.close();
			System.out.println(sbuffer.toString()); // StringBuffer의 내용을 출력
			
		} catch (Exception e) {
			System.out.println("readFile err : " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("자바 만세");
		list.add("nice");
		File file = new File("c:/work/iotest2.txt");
		
		Test46file_io tf = new Test46file_io();
		tf.writeFile(file , list); //list의 기억된 데이터를 파일로 저장하기
		tf.readFile(file); // 보조기억장치에 저장된 파일을 주기억장치로 읽기
	}

}
