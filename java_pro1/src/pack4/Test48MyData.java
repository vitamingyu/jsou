package pack4;

import java.io.Serializable; // binary(이진)처리를 함, 네트웍을 통해 데이터를 송수신할 때 많이 사용

public class Test48MyData implements Serializable{ // 아래 맴버들을 이진수화(암호화)해서 넘김
	int number = 100;
	double weight = 78.9;
	String irum = "홍길동";
	String juso = "역삼1동";
	
	
	
}
